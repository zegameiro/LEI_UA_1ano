print("Tax payment")
r = float(input("r?"))   #Give a value to r so you can find out how much are you going to pay in youre taxes
def tax(r):
   if r <= 1000:
      tax1 = 0.1*r
      print("Tax:", tax1)
   elif 1000 < r <= 2000:
      tax1 = (0.2 * r) - 100
      print("Tax:", tax1)
   else:
      tax1 = (0.3 * r) - 300
      print("Tax:", tax1)
   return "Thank you"
    
print(tax(r))