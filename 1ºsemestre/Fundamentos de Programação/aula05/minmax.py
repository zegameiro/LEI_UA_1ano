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
    return low
    
print(countlower(lst,v))

def minmax(lst):    
    mini = lst[0]
    maxi = lst[0]    
    for x in lst:
        if x > maxi:
            maxi = x
        elif x < mini:
            mini = x
        return maxi, mini
        
print(minmax(lst))
      