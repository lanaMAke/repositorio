import datetime

ano = int(input("Digite o ano do seu nascimento :)... "))
ano_atual = datetime.datetime.now().year

idade = ano_atual - ano

if idade >= 65:
    print("Pode se aposentar!")
else:
    print("Não pode se aposentar.. muito novo")

##

