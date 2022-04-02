for i in range(1,100):
    if i % 3 == 0 or i % 5 == 0:
        print(i)

penultimo, ultimo = 0, 1
soma = 0
while ultimo <= 4000000:
    if ultimo % 2 == 0:
        soma = soma + ultimo
    penultimo, ultimo = ultimo, penultimo + ultimo
print(soma)
