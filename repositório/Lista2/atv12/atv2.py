nota1 = float(input('Digite sua nota parcial.: '))
nota2 = float(input('Digite sua segunda nota parcial.: '))

nota_final = nota1 + nota2 /2

if nota_final > 9.0 or nota_final == 10.0:
    print('A')
elif nota_final >= 7.5 or  