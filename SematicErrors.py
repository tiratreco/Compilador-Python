class ExprTypeError(Exception):
    def __init__(self, line, type1, operation):
        message = 'Linha {}: Operação {} não suportada para o tipo: {}'.format(line, operation, type1)
        super().__init__(message)

    def __init__(self, line, type1, type2, operation):
        message = 'Linha {}: Operação {} não suportada para os tipos: {} e {}'.format(line, operation, type1, type2)
        super().__init__(message)


class UndeclaredVariable(Exception):
    def __init__(self, line, id):
        message = 'Linha {}: A variável {} não foi declarada'.format(line, id)
        super().__init__(message)


class UnexpectedTypeError(Exception):
    def __init__(self, line, expected_type, recieved_type):
        message = 'Linha {}: Era esperado o tipo {}, foi recebido {}'.format(line, expected_type, recieved_type)
        super().__init__(message)


class BreakException(Exception):
    def __init__(self, line):
        message = 'Linha {}: Break fora do escopo de um laço de repetição'.format(line)
        super().__init__(message)


class ReturnException(Exception):
    def __init__(self, line):
        message = 'Linha {}: Return fora do escopo de uma função'.format(line)
        super().__init__(message)


class MissingArgument(Exception):
    def __init__(self, line, expected_args, recieved_args):
        message = 'Linha {}: Eram esperados {} argumentos, {} foram recebidos'.format(line, expected_args,
                                                                                      recieved_args)
        super().__init__(message)


class UndeclaredFunction(Exception):
    def __init__(self, line, id):
        message = 'Linha {}: A função {} não foi declarada'.format(line, id)
        super().__init__(message)


class AlreadyDeclaredError(Exception):
    def __init__(self, line, id):
        message = 'Linha {}: Id já declarado: {}'.format(line, id)
        super().__init__(message)
