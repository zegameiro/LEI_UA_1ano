s = "abc"
n = 4

def repeatCharacters(s,n):
    rep = s * n
    return rep

print(repeatCharacters(s,n))

def repeatCharacters2(b,n):
    s = ''
    for a in set(b):
        s += a
    sn = s * n
    return sn

print(repeatCharacters(s,n))