print("Cálculo dos valores de um polinómio")
def poli(x):
  px = x**2 + 2*x + 3
  return px
  
print("p(x) = x**2 + 2*x + 3")
  
print("p(0) = ", poli(0))

print("p(1) = ", poli(1))

print("p(2) = ", poli(2))

print("p(3) = ", poli(3))

print("p(p(1)) = ", poli(poli(1)))