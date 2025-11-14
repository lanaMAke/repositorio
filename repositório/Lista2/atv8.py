
try:

    prod1 = float(input('Digite o valor do produto 1.: R$ '))
    prod2 = float(input('Digite o valor do produto 2.: R$ '))
    prod3 = float(input('Digite o valor do produto 3.: R$ '))
    print('')
# Menor
    if prod1 < prod2 and prod1 < prod3:
        print(f'O produto {prod1:.2f} é o mais barato para compra!')
    elif prod2 < prod1 and prod2 < prod3:
        print(f'O produto {prod2:.2f} é o mais barato para compra!')
    elif prod3 < prod1 and prod3 < prod2:
        print(f'O produto {prod3:.2f} é o mais barato para compra!')
    else:
        print('Os valores dos produtos são iguais... ')
except ValueError:
    print('Erro!')