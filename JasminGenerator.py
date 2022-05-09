class Id:
    def __init__(self, address: int = None, type=None, function: bool = False, local: bool = False):
        self.type = type
        self.address = address
        self.function = function
        self.local = local


def type_convert(type):
    descriptor = {'int': 'I', 'float': 'F', 'string': 'Ljava/lang/String;', 'boolean': 'I', 'NoneType': 'V',
                  'integer': 'I'}
    return descriptor[type]


class Generator:

    def __init__(self, name, symbol_table):
        self.name = name
        self.file = open(name + '.j', 'w+')
        self.start_file()
        self.symbol_table = symbol_table
        self.top_index = 0

    def close_file(self):
        self.file.close()

    # remove tabs de strings antes de escrever a linha
    def __write(self, string):
        for s in string.split('\n'):
            if s.strip():
                self.file.write(s.strip() + "\n")

    def create_global(self, var_name, var_type):
        self.__write(
            """
            .field public static {} {}
            """.format(var_name, type_convert(var_type))
        )
        # TODO: salvar outros tipos

    def start_file(self):
        self.__write(
            """
            .class public {}
            .super java/lang/Object
            """.format(self.name)
        )

    def enter_main(self):
        self.__write(
            """
            .method public static main([Ljava/lang/String;)V
            .limit stack 10
            .limit locals 100
            """
        )

    def exit_main(self):
        self.__write(
            """
            return
            .end method
            """
        )

    def enter_function(self, name, parameters):  # TODO: receive parameters
        param = ''
        for p in parameters:
            param += type_convert(p)
        self.__write(
            """
            .method public static {}({}){}
            .limit stack 5
            .limit locals 100
            """.format(name, param, type_convert(self.symbol_table[name].type))
        )

    def exit_function(self):
        self.__write(
            """
            .end method
            """
        )

    def do_return(self, val, type):
        self.load_temp(val, type)
        return_type = type_convert(type)
        if return_type == 'I':
            self.__write(
                """
                ireturn
                """
            )
        elif return_type == 'F':
            self.__write(
                """
                freturn
                """
            )
        elif return_type == 'V':
            self.__write(
                """
                return
                """
            )
        elif return_type == 'Ljava/lang/String;':
            self.__write(
                """
                areturn
                """
            )

    def print(self, type_val):
        for type, val in type_val:
            self.__write(
                """
                getstatic java/lang/System/out Ljava/io/PrintStream;
                """
            )
            self.load_temp(val, type)
            self.__write(
                """
                invokevirtual java/io/PrintStream/print({})V
                """.format(type_convert(type))
            )
            self.__write(
                """
                getstatic java/lang/System/out Ljava/io/PrintStream;
                ldc " "
                invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
                """
            )
        self.__write(
            """
            getstatic java/lang/System/out Ljava/io/PrintStream;
            ldc ""
            invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
            """
        )

    def sum(self, type, add1, add2):
        self.load_temp(add1, type)
        self.load_temp(add2, type)
        if type == 'int':
            self.__write(
                """
                iadd
                """
            )
        elif type == 'float':
            self.__write(
                """
                fadd
                """
            )
        # TODO : soma de string
        return self.store_val(type)

    def mul(self, type, add1, add2):
        self.load_temp(add1, type)
        self.load_temp(add2, type)
        if type == 'int':
            self.__write(
                """
                imul
                """
            )
        elif type == 'float':
            self.__write(
                """
                fmul
                """
            )
        # TODO : soma de string
        return self.store_val(type)

    def store_val(self, type):
        if type == 'string':
            self.__write(  # TODO : armazenar string
                """
                astore {}
                """.format(self.top_index)
            )
        elif type == 'int' or type == 'boolean':
            self.__write(
                """
                istore {}
                """.format(self.top_index)
            )
        elif type == 'float':
            self.__write(
                """
                fstore {}
                """.format(self.top_index)
            )
        self.top_index += 1
        return self.top_index - 1

    def load_var(self, var):
        var_data = self.symbol_table[var]
        if var_data.local:  # local var
            if var_data.type == 'int' or var_data.type == 'boolean':
                self.__write(
                    """
                     iload {}
                     """.format(var_data.address)
                )
            elif var_data.type == 'float':
                self.__write(
                    """
                    fload {}
                    """.format(var_data.address)
                )
            # TODO: tratar string
        else:  # global var
            self.__write(
                """
                getstatic {}/{} {}
                """.format(self.name, var, type_convert(self.symbol_table[var].type))
            )
        return self.store_val(var_data.type)

    def store_var(self, var, address):
        var_data = self.symbol_table[var]
        if var_data.local:  # local var
            if var_data.type == 'int' or var_data.type == 'boolean':
                self.__write(
                    """
                    iload {}
                    istore {}
                    """.format(var_data.address, address)
                )
            elif var_data.type == 'float':
                self.__write(
                    """
                    fload {}
                    fstore {}
                    """.format(var_data.address, address)
                )
            # TODO: tratar string
        else:  # global var
            self.load_temp(address, self.symbol_table[var].type)
            if var_data.type == 'int' or var_data.type == 'boolean':
                self.__write(
                    """
                    putstatic {}/{} {}
                    """.format(self.name, var, type_convert(self.symbol_table[var].type))
                )
            elif var_data.type == 'float':
                self.__write(
                    """
                    putstatic {}/{} {}
                    """.format(self.name, var, type_convert(self.symbol_table[var].type))
                )
            # TODO: tratar string

    def do_int_sum(self):
        self.__write(
            """
            iadd
            """
        )

    def load_temp(self, val, type):
        if type == 'int':
            self.__write(
                """
                iload {}
                """.format(val)
            )
        elif type == 'float':
            self.__write(
                """
                fload {}
                """.format(val)
            )
        elif type == 'string':
            self.__write(
                """
                aload {}
                """.format(val)
            )

    def create_temp(self, val, type):
        self.__write(
            """
            ldc {}
            """.format(val)
        )
        return self.store_val(type)

    def int_to_float(self, val):
        self.load_temp(val, "int")
        self.__write(
            """
            i2f
            """
        )
        return self.store_val("float")
