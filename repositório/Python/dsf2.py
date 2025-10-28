#criação de uma calculadora de idade

#simple
print("Calculadora de idade")

ano = int(input("Qual foi o ano que você nasceu?"))
anoAtual = int(input("Qual é o ano atual?"))

idade = anoAtual - ano 

print("Sua idade é ", idade)

#####______________________________________________________
#add 
from datetime import datetime

ano = int(input("qual seu ano de nascimento?"))
anoAtual = datetime.now().year

idade = anoAtual - ano

print("Sua idade é... ", idade)