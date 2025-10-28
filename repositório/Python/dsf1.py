print("Calculator in Python!")

def operacao (op, valor1, valor2):
        match op:
            case "soma":
             result = valor1 + valor2
             print("o resultado foi ", result)
        
            case "subt":
                result = valor1 - valor2
                print("O resultado foi ", result)
        
            case "multi":
                result = valor1 * valor2
                print("O resultado foi ", result)
        
            case "div":
                 if valor1 == 0 or valor2 == 0: 
                    print("Divisão inválida")
                 else:
                    result = valor1 / valor2
                    print("O resultado foi ", result)
            case _: #captura qualquer op inválida
                print ("Op, inválida!")
                
try: #validar
    
    valor1 = int(input("Digite um número:"))
    valor2 = int(input("Digite um segundo número:"))
    op = input("qual operação? soma - subt - multi - div ")
    
    #chamar func == def
    operacao(op, valor1, valor2)
    
except ValueError: 
    print("Erro: digite números válidos") 
    
###################################

#Chat
  print("Calculator in Python!")

def operacao(op, valor1, valor2):
    match op:
        case "soma":
            result = valor1 + valor2
            print("O resultado foi", result)

        case "subt":
            result = valor1 - valor2
            print("O resultado foi", result)

        case "multi":
            result = valor1 * valor2
            print("O resultado foi", result)

        case "div":
            if valor2 == 0:
                print("Divisão inválida: não é possível dividir por zero.")
            else:
                result = valor1 / valor2
                print("O resultado foi", result)

        case _:
            print("Operação inválida!")

try:
    valor1 = int(input("Digite um número: "))
    valor2 = int(input("Digite um segundo número: "))
    op = input("Qual operação? soma - subt - multi - div ")

    operacao(op, valor1, valor2)

except ValueError:
    print("Erro: digite números válidos.")
