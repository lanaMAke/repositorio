'''
valorHora = float(input('Digite valor por hora [use ponto "." ao invés de vírgula","]: '))
horasTrab = int(input('Digite as horas de trabalho semanais: '))

horasMes = horasTrab * 5

salario = valorHora * horasMes
print(f'O salário ficou em : R$ {salario:.2f}')
print('')

'''
'''
tempCelsius = float(input('Digite uma temperatura: '))

conversão = (tempCelsius*1.8)+32
print(f'Temperatura {tempCelsius}° convertida para Fahrenheit foi {conversão} F°')
print('')
'''
'''
num1 = int(input('Digite um número: '))
num2 = int(input('Digite um segundo número: '))
num3 = float(input('Digite um terceiro número: '))

def calculo1 (num1,num2):
    return (num2/2)*(num1*2)

def calculo2 (num1,num3):
    return (num1*3)+num3

def calculo3 (num3):
    return num3**3

print(calculo1(num1,num2))
print(calculo2(num1,num3))
print(calculo3(num3))
print('')
'''
'''
arq = int(input('Digite tamanho do arquivo: '))

conversao = arq*1024
print(f'O tamanho do arquivo presente {arq} GB, o seu tamanho em MB está em {conversao}')
print('')


kiloB = conversao*1024**2

print(f'Transformação do arquivo para uma unidade maior é {kiloB} KB')
print('')
print('-------------------------------------------------------------')
'''
