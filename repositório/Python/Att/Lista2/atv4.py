letra = input('Digite uma letra.: ')

if letra.upper() == 'A' or letra.upper() == 'E' or letra.upper() == 'I' or letra.upper() == 'O' or letra.upper() == 'U':
    print(f'letra {letra} é uma vogal!') 
else:
    print(f'Letra {letra} é uma consoante')