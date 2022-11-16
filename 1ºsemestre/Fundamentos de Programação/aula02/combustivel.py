combus = float(input("Quantidade de combustível?"))
if combus > 40:
  preco = (combus*1.40)*0.9
  print("Tem de pagar", preco)
else:
  preco2 = combus*1.40
  print("Tem de pagar", preco2)