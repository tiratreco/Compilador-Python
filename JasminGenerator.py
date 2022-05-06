class Id:
    def __init__(self, address: int = None, type=None, function: bool = False, local: bool = False):
        self.type = type
        self.address = address
        self.function = function
        self.local = local


class Generator:
    var_list = []  # index = endereco

    def __init__(self, name, symbol_table):
        self.name = name
        self.file = open(name + '.j', 'w+')
        self.start_file()
        self.symbol_table = symbol_table

    # remove tabs de strings antes de escrever linha
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

    def print(self, text):
        self.__write(
            """
            getstatic java/lang/System/out Ljava/io/PrintStream;
            ldc "{}" 
            invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
            """.format(text)
        )

    def int_sum(self, reg1, reg2, result):
        self.__write(
            """
            ; int_sum
            iload {}
            iload {}
            iadd
            istore {}
            """.format(reg1, reg2, result)
        )
