
peso = float(input('Digite o peso dos peixes: '))

if peso > 50:
    diferenca = peso - 50
    multa = diferenca * 4
    print(f'Excesso de peso, {diferenca:.2f} kg de diferença! ')
    print(f'Multa de R$ {multa:.2f}')
else:
   print('peso adequado!! pode vender :)') 

print('')
print('______________________________________________')


