#int - inteiros
#float - reais ( possui ponto)
#bool - lógicos ( True, False)
#Str - conj. caracteres ('pshiu')

import datetime
ano = int(input('Digite o ano de seu nascimento: '))
ano_atual = datetime.datetime.now().year

idade = ano_atual - ano

print(type(idade))