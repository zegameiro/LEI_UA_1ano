def factorial(n):
   assert isinstance(n, int)
   assert n >= 0
   x = 1
   fat  = x * x
   while x != n:
       x += 1
       fat  *= x
   return fat

n = int(input("Value?"))
print(factorial(n))