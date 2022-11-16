def positionDifferenceFirstLastLargest(lst):
    maxi = lst[0]

    for x in lst:
        if x > maxi:
            maxi = x

    for a in range(len(lst)):
        if lst[a] == maxi:
            f = a
            break

    for a in range(len(lst) - 1, -1, -1):
        if lst[a] == maxi:
            l = a
            break
    total = f - l
                
    return total

lst = [5,12,12,5,12]

print(positionDifferenceFirstLastLargest(lst))