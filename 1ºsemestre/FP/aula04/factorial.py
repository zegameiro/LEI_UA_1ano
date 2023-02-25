#Complete a função factorial(n) para calcular e devolver o factorial de n.
#Use uma instrução de repetição for ou while.
#Recorde que n! = 1*2*3*...*n, para n>=1, e 0! = 1, por definição.
#A função só aceita argumentos inteiros não negativos.
print("Factorial of a number = n!")

n = int(input("n?"))

def factorial(n):
   assert isinstance(n, int) 
   assert n >= 0 
   i = 1
   fact = 1    
   while i <= n:
     fact = fact * i
     i = i + 1
     print(fact)
     
   return ("Factorial of", n, "is", fact)

print(factorial(n))
