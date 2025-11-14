import math

metros_quadrados = int(input("Digite a área para pintura.: "))

folga = metros_quadrados * (10 / 100)
metros_ComFolga = metros_quadrados + folga
##############################################################
litrosTinta = metros_ComFolga / 6
latas = litrosTinta / 18
galoes = litrosTinta / 3.6

quant_latas = math.ceil(latas)
quant_galoes = math.ceil(galoes)

'''Só Latas'''
valorLata = quant_latas * 80.00
print(f'O valor ficará por.: R$ {valorLata:.2f}, nescessário {quant_latas} latas.')

'''Só galões'''
valorGaloes = quant_galoes * 25.00
print(f'O valor ficará por.: R$ {valorGaloes:.2f}, nescessário {quant_galoes} galões.')

'''Os dois'''

resto = litrosTinta % 18
mistura = math.ceil(resto / 3.6)

total = valorLata + (mistura * 25.00)

print(f'Se quiser, pode levar {quant_latas:.2f} latas e adicionar {mistura} galões, no valor de.: R$ {total} ')




