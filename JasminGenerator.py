class Id:
    def __init__(self, address: int = None, type=None, function: bool = False, local: bool = False):
        self.type = type
        self.address = address
        self.function = function
        self.local = local


def type_convert(type):
    descriptor = {'int': 'I', 'float': 'F', 'string': 'Ljava/lang/String;', 'boolean': 'Z', 'NoneType': 'V',
                  'integer': 'I'}
    return descriptor[type]


class Generator:
    MAX_LOCALS = 100

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
            .limit locals {}
            """.format(self.MAX_LOCALS)
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
            param += type_convert(self.symbol_table[p].type)
        self.__write(
            """
            .method public static {}({}){}
            .limit stack 5
            .limit locals {}
            """.format(name, param, type_convert(self.symbol_table[name].type), self.MAX_LOCALS)
        )
        for p in parameters:
            self.symbol_table[p].address = self.top_index
            self.symbol_table[p].local = True
            self.top_index += 1

    def exit_function(self):
        self.__write(
            """
            .end method
            """
        )

    def function_call(self, func_name, params, types):
        func_type = self.symbol_table[func_name].type
        args = ''
        for p, t in zip(params, types):
            self.load_temp(p, t)
            args += type_convert(t)
        self.__write(
            """
            invokestatic {}.{}({}){}
            """.format(self.name, func_name, args, type_convert(func_type))
        )
        return self.store_val(func_type)

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

    def mul(self, type, add1, add2):
        self.load_temp(add1, type)
        self.load_temp(add2, type)
        if type == 'int' or type == 'integer':
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
        return self.store_val(type)

    def div(self, type, add1, add2):
        self.load_temp(add1, type)
        self.load_temp(add2, type)
        if type == 'int':
            self.__write(
                """
                idiv
                """
            )
        elif type == 'float':
            self.__write(
                """
                fdiv
                """
            )
        return self.store_val(type)

    def calc_not(self, val):
        self.load_temp(val, 'boolean')
        self.__write(
            """
            ldc 1
            ixor
            """
        )
        return self.store_val('boolean')

    def calc_and(self, val1, val2):
        self.load_temp(val1, 'boolean')
        self.load_temp(val2, 'boolean')
        self.__write(
            """
            iand
            """
        )
        return self.store_val('boolean')

    def calc_or(self, val1, val2):
        self.load_temp(val1, 'boolean')
        self.load_temp(val2, 'boolean')
        self.__write(
            """
            ior
            """
        )
        return self.store_val('boolean')

    def calc_eq(self, type, val1, val2, label_id, op):
        cmp = {'==': 'eq', '!=': 'ne', '>=': 'ge', '>': 'gt', '<=': 'le', 'lt': '<'}
        self.load_temp(val1, type)
        self.load_temp(val2, type)
        if type in ['int', 'integer', 'boolean']:
            self.__write(
                """
                if_icmp{} true{}
                """.format(cmp[op], label_id)
            )
        elif type == 'float':
            self.__write(
                """
                if{} true{}
                """.format(cmp[op], label_id)
            )
        else:
            self.__write(
                """
                if_acmp{} true{}
                """.format(cmp[op], label_id)
            )
        self.__write(
            """
            ldc 0
            goto cmp_end{}
            true{}:
            ldc 1
            cmp_end{}:
            """.format(label_id, label_id, label_id, label_id)
        )
        return self.store_val('boolean')

    def store_val(self, type):
        if type == 'string':
            self.__write(
                """
                astore {}
                """.format(self.top_index)
            )
        elif type == 'int' or type == 'boolean' or type == 'integer':
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
            self.__write(
                """
                putstatic {}/{} {}
                """.format(self.name, var, type_convert(self.symbol_table[var].type))
            )

    def input(self, name):
        t = self.symbol_table[name].type
        self.__write(
            """
            new java/util/Scanner
            dup
            getstatic java/lang/System/in Ljava/io/InputStream;
            invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
            """
        )
        if t == 'string':
            self.__write(
                """
                invokevirtual java/util/Scanner/nextLine()Ljava/lang/String;
                """
            )
        elif t == 'int' or t == 'integer':
            self.__write(
                """
                invokevirtual java/util/Scanner/nextInt()I
                """.format(type_convert(self.symbol_table[name].type))
            )
        elif t == 'float':
            self.__write(
                """
                invokevirtual java/util/Scanner/nextFloat()F
                """.format(type_convert(self.symbol_table[name].type))
            )
        elif t == 'bool':
            self.__write(
                """
                invokevirtual java/util/Scanner/nextBoolean()Z
                """.format(type_convert(self.symbol_table[name].type))
            )
        addr = self.store_val(self.symbol_table[name].type)
        self.store_var(name, addr)

    def add(self, type, add1, add2):
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

    def sub(self, type, add1, add2):
        self.load_temp(add1, type)
        self.load_temp(add2, type)
        if type == 'int':
            self.__write(
                """
                isub
                """
            )
        elif type == 'float':
            self.__write(
                """
                fsub
                """
            )
        return self.store_val(type)

    def load_temp(self, val, type):
        if type == 'int' or type == 'integer' or type == 'boolean':
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

    def enter_for(self, temp=False):
        if temp:
            self.__write(
                """
                ldc 0
                """
            )
            start = self.store_val('int')
        return start, "for{}:\n"

    def exit_for(self, start, end, stack_idx):
        self.__write(
            """
            iinc {} +1
            """.format(start)
        )
        self.load_temp(start, 'int')
        self.load_temp(end, 'int')
        self.__write(
            """
            if_icmplt for{}
            continue{}:
            """.format(end, stack_idx)
        )

    def break_loop(self, break_point):
        self.__write(
            """
            goto continue{}
            """.format(break_point)
        )

    def write_inh(self, line):
        self.__write(line)
