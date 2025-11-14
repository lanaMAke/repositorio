salario = float(input('Qual o valor do seu salário? .: R$'))

if salario <= 280.00:

    percentual = 20/100
    aumento = salario + percentual
    diferenca = salario - aumento
    abs(diferenca)

    print(f'Salário antes do reajuste.: R$ {salario:.2f}')
    print(f'O percentual foi de {percentual}')
    print(f'Valor do aumento ficou em {diferenca:.2f}')
    print(f'Seu salario ficará em .: R$ {aumento:.2f}')


elif salario == 280.00 and salario < 700.00:

    percentual = 15/100
    aumento = salario + percentual
    diferenca = salario - aumento
    abs(diferenca)

    print(f'Salário antes do reajuste.: R$ {salario:.2f}')
    print(f'O percentual foi de {percentual}')
    print(f'Valor do aumento ficou em {diferenca:.2f}')
    print(f'Seu salario ficará em .: R$ {aumento:.2f}')

elif salario == 700.00 and salario < 1500.00:

    percentual = 10/100 
    aumento = salario + percentual
    diferenca = salario - aumento
    abs(diferenca)

    print(f'Salário antes do reajuste.: R$ {salario:.2f}')
    print(f'O percentual foi de {percentual}')
    print(f'Valor do aumento ficou em {diferenca:.2f}')
    print(f'Seu salario ficará em .: R$ {aumento:.2f}')

elif salario > 1500.00:

    percentual = 5/100
    aumento = salario + percentual
    diferenca = salario - aumento
    abs(diferenca)

    print(f'Salário antes do reajuste.: R$ {salario:.2f}')
    print(f'O percentual foi de {percentual}')
    print(f'Valor do aumento ficou em {diferenca:.2f}')
    print(f'Seu salario ficará em .: R$ {aumento:.2f}')

else:
    if salario <= 0:
        print('Valor inválido.. ')

