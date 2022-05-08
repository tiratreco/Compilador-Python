class Id:
    def __init__(self, address: int = None, type=None, function: bool = False, local: bool = False):
        self.type = type
        self.address = address
        self.function = function
        self.local = local


def type_convert(type):
    if type == 'string':
        return 'Ljava/lang/String;'
    elif type == 'int':
        return 'I'
    elif type == 'float':
        return 'F'
    elif type == 'NoneType':
        return 'V'
    else:
        return None


class Generator:
    var_list = []  # index = endereco

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

    def create_global(self, var_name):
        self.__write(
            """
            .field public static {} I
            """.format(var_name)
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

    def enter_function(self, name):  # TODO: receive parameters
        self.__write(
            """
            .method public static {}(){}
           .limit stack 5
           .limit locals 100
            """.format(name, type_convert(self.symbol_table[name].type))
        )

    def exit_function(self, name):
        self.__write(
            """
            ireturn
            .end method
            """
        )

    def print(self, type, val):
        self.__write(
            """
            getstatic java/lang/System/out Ljava/io/PrintStream;
            """
        )
        self.load_temp(val, type)
        self.__write(
            """
            invokevirtual java/io/PrintStream/println({})V 
            """.format(type_convert(type))
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
