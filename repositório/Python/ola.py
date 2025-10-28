import random


print("Olá")
print("Estou pensando em um número entre 1 e 100...")

num = random.randint(1,100)

palpite = int(input("qual o seu palpite?"))

while palpite != num:
 if palpite < num:
   print("Muito baixo! Tente novamente.")

else:
     print("Muito alto! Tente novamente.")
    
##
print("Parabéns, você acertouuu!! 🎉")
