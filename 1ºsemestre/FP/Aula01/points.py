import math

x1 = float(input("x1?"))
y1 = float(input("y1?"))
x2 = float(input("x2?"))
y2 = float(input("y2?"))
a1 = (x1 - x2)**2
a2 = (y1 - y2)**2
b = a1 + a2
c = math.sqrt(b)
print("A distância entre os dois pontos é de", c)