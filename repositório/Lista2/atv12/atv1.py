num_semana = int(input("Digite um número de 1 á 7: "))

if num_semana <8:
    match num_semana:
        case 1:
            print('Domingo!')
        case 2:
            print('Segunda!')
        case 3:
            print('Terça!')
        case 4:
            print('Quarta!')
        case 5:
            print('Quinta!')
        case 6:
            print('Sexta!')
        case 7:
            print('Sábadoou!')
else:
    print('Valor inválido!!')
