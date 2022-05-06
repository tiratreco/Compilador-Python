class Id:
    def __init__(self, address: int = None, type=None, function: bool = False, local: bool = False):
        self.type = type
        self.address = address
        self.function = function
        self.local = local


def type_convert(type):
    if type == 'string':
        return 'S'
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

    # remove tabs de strings antes de escrever a linha
    def __write(self, string):
        for s in string.split('\n'):
            if s.strip():
                self.file.write(s.strip() + "\n")

    def __save_value(self, address):
        self.__write(
            """
            .field public static {} I
            """.format(self.var_list[address].name)
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
            .limit locals 100
            """
        )

    def exit_main(self):
        self.__write(
            """
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

    def print(self, text):
        self.__write(
            """
            getstatic java/lang/System/out Ljava/io/PrintStream;
            ldc "{}" 
            invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
            """.format(text)
        )

    def int_sum(self, var1, var2):
        self.__write(
            """
            ; int_sum
            iload {}
            iload {}
            iadd
            """.format(var1.address, var2.address)
        )
