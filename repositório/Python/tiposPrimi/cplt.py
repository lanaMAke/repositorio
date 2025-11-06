
#while idade : 
try:
    #while idade. :     
    idade = int(input('Digite sua idade <3 : '))


    if isinstance(idade, int) > 0:
        print(f'Idade Cadastrada com sucesso: {idade} anos')
    else:
        print('Entrada inválida. Digite um número interio positivo')

except ValueError:
        print('Erro ao digitar valor. Digite em número!')