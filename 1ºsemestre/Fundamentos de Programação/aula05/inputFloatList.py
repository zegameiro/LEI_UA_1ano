num = float(input("Number?"))

lst = [num]

while True:
    num = input("Number?")
    if not num.isdigit():
        print(lst)
        break
    lst.append(float(num))
               