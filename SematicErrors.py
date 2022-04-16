class ExprTypeError(Exception):
    def __int__(self, type1, type2, operation):
        message = 'Operação {} não suportada para os tipos: {} {}'.format(operation, type1, type1)
        super().__init__(self.message)

class UndeclaredVariable(Exception):
    def __int__(self, id):
        message = 'A variável {} não foi declarada'.format(id)
        super().__init__(self.message)

class AssignmentTypeError(Exception):
    def __int__(self, type, id):
        message = 'Tipo incompatível com a variável {}: {}'.format(type, id)
        super().__init__(self.message)

class BreakException(Exception):
    def __int__(self, type, id):
        message = 'Break fora do escopo de um laço de repetição'
        super().__init__(self.message)

class ReturnException(Exception):
    def __int__(self, type, id):
        message = 'Return fora do escopo de uma função'
        super().__init__(self.message)