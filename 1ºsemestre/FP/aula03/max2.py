x = float(input("x?"))
y = float(input("y?"))


def max2(x,y):
  
  if x > y:
    print(x, "é o maior de entre x e y.")
  else:
    print(y, "é o maior de entre x e y.")
  return "Obrigada"

print(max2(x,y))

z = float(input("z?"))

def max3(x,y,z):
   if x > y and x > z:
      print(x, "é o maior de entre x, y e z.")
   elif y > x and y > z:
      print(y, "é o maior de entre x, y e z.")
   else:
      print(z, "é o maior de entre x, y e z.")   
      
   return "Obrigada"
    
print(max3(x,y,z))

