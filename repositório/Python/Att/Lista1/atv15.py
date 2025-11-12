valorHora = float(input('Digite valor por hora que trabalha.: '))
horaTrab = int(input('Digite horas trabalhadas ao mês.: '))

salarioBruto = valorHora*horaTrab

inss = salarioBruto - 8/100 
sindicato = salarioBruto - 5/100 
impostRenda = salarioBruto - 11/100

result = inss + sindicato + impostRenda

print(f'+ Salário.: R$ {salarioBruto:.2f}')
print(f'- IR(11%).: R$ {impostRenda:.2f}')
print(f'- INSS(8%).: R$ {inss:.2f}')
print(f'- Sindicato(5%).: R$ {sindicato:.2f}')
print(f'- Salário Liquido.: R$ {result:.2f}')
print('')
print('________________________________________')
   

