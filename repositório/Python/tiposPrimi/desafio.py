
try:
    valor =input('Digite algo: ')

    print(f'O tipo primitivo desse valor é {type(valor)}')
    print()
    print(f'É um número? {isinstance(valor, int)}')
    print('')
    print(f'É alfabético? {isinstance(valor, str)}')
    print('')
    print(f'Está em Maiúscula?{valor.isupper()}')
    print(f'Está captalizada?{valor.istitle()}')
    
    print('')
except ValueError:
    print('Verifique a entrada!')
