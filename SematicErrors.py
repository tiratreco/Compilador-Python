class ExprTypeError(Exception):
    def __init__(self, type1, operation):
        message = 'Operação {} não suportada para o tipo: {}'.format(operation, type1)
        super().__init__(message)

    def __init__(self, type1, type2, operation):
        message = 'Operação {} não suportada para os tipos: {} e {}'.format(operation, type1, type2)
        super().__init__(message)


class UndeclaredVariable(Exception):
    def __init__(self, id):
        message = 'A variável {} não foi declarada'.format(id)
        super().__init__(message)


class UnexpectedTypeError(Exception):
    def __init__(self, expected_type, recieved_type):
        message = 'Era esperado o tipo {}, foi recebido {}'.format(expected_type, recieved_type)
        super().__init__(message)


class BreakException(Exception):
    def __init__(self):
        message = 'Break fora do escopo de um laço de repetição'
        super().__init__(message)


class ReturnException(Exception):
    def __init__(self):
        message = 'Return fora do escopo de uma função'
        super().__init__(message)


class MissingArgument(Exception):
    def __init__(self, expected_args, recieved_args):
        message = 'Eram esperados {} argumentos, {} foram recebidos'.format(expected_args, recieved_args)
        super().__init__(message)


class UndeclaredFunction(Exception):
    def __init__(self, id):
        message = 'A função {} não foi declarada'.format(id)
        super().__init__(message)


class AlreadyDeclaredError(Exception):
    def __init__(self, id):
        message = 'Id já declarado: {}'.format(id)
        super().__init__(message)
