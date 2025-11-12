try:

    num1 = int(input('Digite um número.: '))

    if num1 > 0:
        print(f'Número {num1} é um número positivo :)')
    elif num1 < 0:
        print(f'Número {num1} é um número negativo :)')

except ValueError:
    print('')
    print('Erro de digitação, digite valor válido!')