#1
num_str = input("Digite um número")
convert = int(num_str)

result = convert*2
print(result)
print("")

##################################
#2
altura_str = "1.75"
convert = float(altura_str)

soma = convert+0.15
print(soma)
print("")

###################################
#3
import math

num = 81
 
print(math.sqrt(num))
print("")

###################################
#4
import random

print(random.randint(10,20))
print("")

######################################
#5
import random

nomes = ["Alana", "Amabile", "Ana"]
escolha = random.choice(nomes)

print(escolha)
print("")


#######################################
#6
import time

print("Iniciando a contagem...")
print("")
time.sleep(3)

for i in range(11):
    print("Estou aprendendo python!")
    print("")
print("")



