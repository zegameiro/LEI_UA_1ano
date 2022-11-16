import math
a = float(input("Qual a medida do cateto A?"))
b = float(input("Qual a medida do cateto B?"))
c = math.sqrt((a**2) + (b**2))
tg = b/a
ang = math.atan(tg)
angd = math.degrees(ang)
print("A medida da hipotenusa é {c:02f} e a amplitude do ângulo entre o lado A e a hipotenusa é{angd:02f}".format(c = c, angd = angd))
 