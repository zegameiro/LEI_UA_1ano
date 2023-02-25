print("This program will as you a sequence of numbers. When you want to stop it leave an empty line and press enter")
total = 0
while True:
    sequence = str(input("Number?"))
    total += 1
    if sequence == "":break
number = float(sequence)
soma = number + number
media = soma / total
print("A média dos valores que inseriu é", media)
                
  
       
    


