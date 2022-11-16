name = str(input("First and last Name?"))
def shorten(name):
    nickname = ""
    for x in name:
        if x.isupper():
            nickname += x
    return nickname

print(shorten(name))
      
    
    