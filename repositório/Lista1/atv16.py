
metros_quadrados = int(input("Digite a área para pintura.: "))

litrosTinta = metros_quadrados / 3
latas = litrosTinta / 18
quant_latas = (round(latas)) 

if quant_latas == 1:
    print(f'Será nescessário {quant_latas} lata no valor de R$ 80.00')
else:
    valorFinal = quant_latas * 80.00
    print(f'Serão nescessários {quant_latas} no valor final de R$ {valorFinal}')

print('Obrigada pela compra :)')


