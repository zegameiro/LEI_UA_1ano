

num = float(input("Number?"))

lst = [num]

while True:
    num = input("Number?")
    if not num.isdigit():
        print(lst)
        break
    lst.append(float(num))
    
v = float(input("Value?"))    

def countlower(lst,v):
    low = 0
    for num in lst:
        while num < v:
            low = low + 1
            break
    print(low," numbers are lower than",v)
print(countlower(lst,v))    

            
                

