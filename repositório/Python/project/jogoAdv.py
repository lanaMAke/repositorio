import random
#Validar e fazer um loop
        
print("Bem-vindo(a) ao Jogo de Adivinhação!")
print("")
print("Tente adivinhar um número entre 1 e 50")


num_ran = random.randint(1, 50)
tentativas = 0
palpite = 0

while palpite != num_ran:

    palpite = int(input("Seu palpite: "))
    tentativas += 1

    if palpite < num_ran:
        print("Muito baixo! Tente um número maior.")
    elif palpite > num_ran:
        print("Muito alto! Tente um número menor.")
    else:
     print("Parabéns, você acertou em",tentativas," tentativas!")
                




