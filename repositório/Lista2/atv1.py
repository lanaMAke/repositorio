try:

    num1 = int(input('Digite um número.: '))
    num2 = int(input('Digite um segundo número.: '))

    if num1 > num2:
        print(f'Número {num1} é maior que número {num2} :)')
    elif num1 < num2:
        print(f'Número {num2} é maior que número {num1} :)')
    else:
        print('Valores iguais! ;)')

except ValueError:
    print('')
    print('Erro de digitação, digite valor válido!')