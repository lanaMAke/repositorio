import time

valorHora = float(input('Digite o valor da hora do seu trabalho: '))
horasTrab = int(input('Digite as horas trabalhadas: '))

salarioBruto = valorHora * horasTrab

# fixo
sindicato = salarioBruto * 3/100
fgts = salarioBruto * 11/100

# Estrutura de condições
if salarioBruto <= 900:
    impRenda = 0
    impRendaTxt = 'Isento'
elif salarioBruto <= 1500:
    impRenda = salarioBruto * 5/100
    impRendaTxt = '5%'
elif salarioBruto <= 2500:
    impRenda = salarioBruto * 10/100
    impRendaTxt = '10%'
else:
    impRenda = salarioBruto * 20/100
    impRendaTxt = '20%'

# Cálculo dos descontos e salário líquido
descontos = sindicato + impRenda
salarioLiq = salarioBruto - descontos

# Impressão formatada
print('Aguarde carregamento...')
time.sleep(2)
print(f'Salário Bruto: ({valorHora:.2f} * {horasTrab}) = R$ {salarioBruto:.2f}')
print(f'(-) IR ({impRendaTxt})   : R$ {impRenda:.2f}')
print(f'(-) INSS (3%)            : R$ {sindicato:.2f}')
print(f'FGTS (11%)               : R$ {fgts:.2f}')
print('')
print(f'Total de descontos       : R$ {descontos:.2f}')
print(f'Salário Líquido          : R$ {salarioLiq:.2f}')
print('_-_'*20)
