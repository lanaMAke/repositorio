num1 = int(input('Digite um número.: '))
num2 = int(input('Digite um segundo número.: '))
num3 = int(input('Digite um terceiro número.: '))
print('')
# Maior
if num1 > num2 and num1 > num3:
    print(f'N°{num1} é maior que n°{num2} e n°{num3}')
elif num2 > num1 and num2 > num3:
    print(f'N°{num2} é maior que n°{num1} e n°{num3}')
elif num3 > num1 and num3 > num2:
    print(f'N°{num3} é maior que n°{num1} e n°{num2}')
elif num1 == num2 == num3:
    print('Números iguaiss... ')

print('')
# Menor
if num1 < num2 and num1 < num3:
    print(f'N°{num1} é menor que n°{num2} e n°{num3}')
elif num2 < num1 and num2 < num3:
    print(f'N°{num2} é menor que n°{num1} e n°{num3}')
elif num3 < num1 and num3 < num2:
    print(f'N°{num3} é menor que n°{num1} e n°{num2}')


