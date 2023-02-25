soma = 0

for i in range(0,5):
    num = int(input("Introduza um número: \n"))
    i += 1
    if num > 0:
        soma += num
    else:
        continue

print("A soma dos números introduzidos é \n ", soma)
