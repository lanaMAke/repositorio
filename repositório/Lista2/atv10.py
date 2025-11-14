turno = input('Qual o seu turno? Digite uma letra (M: Matutino  - V: Vespertino - N: Noturno).: ')

if turno.upper() == 'M':
    print('Good Morning !!')
elif turno.upper() == 'V':
    print('Good Afternoon!!')
elif turno.upper() == 'N':
    print('Good night!')
else:
    print('Letra inválida! Turno não identificado.')