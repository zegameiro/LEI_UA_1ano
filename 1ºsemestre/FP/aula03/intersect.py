def intersect(a1,b1,a2,b2):
    assert a1 < b1
    assert a2 < b2
    intervalo1 = [a1,b1]
    intervalo2 =[a2,b2]
    if (a1 < a2 and b1 < a2) or (b1 == a2):
       print("Estes intervalos não se interetam")
    else:
       print("Estes intervalos intersetam-se")
    return intervalo1, intervalo2
    
a1 = float(input("a1?"))
b1 = float(input("b1?"))
a2 = float(input("a2?"))
b2 = float(input("b2?")) 
   
print(intersect(a1, b1, a2, b2))