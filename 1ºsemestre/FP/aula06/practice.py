print("Este programa serve para calcular as soluções de um equação do segundo grau")
a = int(input("Digite aqui um valor"))
if a==0:
  print("Esta equação não é do segundo grau")
else:
  b = int(input("Digite aqui um valor"))
  c = int(input("Digite aqui um valor"))
  delta = (b**2)-(4*a*c)
  if delta<0:
    print("Esta equação é impossível")
  else:
    if delta==0:
      x1 = (-1*b)//(2*a)
      print("Esta equação só tem uma solução que é", x1)
    else:
      raiz_quadrada = delta**(1/2)
      x2 = ((-1*b)-raiz_quadrada)/(2*a)
      x3 = ((-1*b)+raiz_quadrada)/(2*a)
      print("Esta equação tem duas soluções que são", x2, "e", x3)