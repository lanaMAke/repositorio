nums = input('Digite três números ( separe - os por espaço ).: ')

nums_ord = [int(num) for num in nums.split()]
nums_ord.sort(reverse=True)

print('Aqui estão os números em ordem descrescente...', nums_ord)
