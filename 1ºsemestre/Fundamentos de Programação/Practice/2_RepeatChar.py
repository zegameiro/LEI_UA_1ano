s = "abc"
n = 2
x =""

def repeatCharacters(s,n):
    
    x = s*n
    return x

print(repeatCharacters(s,n))

def repeatCharacters2(s,n):
    v=""
    for i in set(s):
        
        v += str(i)
 
    x = v*n   
    return x

print(repeatCharacters2(s,n))
