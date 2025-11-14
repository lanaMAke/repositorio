
try:

    nota1 = float(input('Digite sua nota parcial.: '))
    nota2 = float(input('Digite sua segunda nota parcial.: '))

    nota_final = nota1 + nota2 /2

    if nota_final == 10.0:
        print('Aprovado com Distinção!! ;)')

    elif nota_final >= 7.0:
        print('Aprovado!! :)')

    else:
        print('Reprovado.. :(')

except ValueError:
    print('Digite uma nota válida!')



