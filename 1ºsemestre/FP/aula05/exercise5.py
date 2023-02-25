lst=[]
def footballclubes(lst):
    clube = input ("Football club?")
    while clube != "":
        lst.append(clube)
        clube = input("Football club?")
    return lst
    
def everyMatches(lst):
    games = []
    for a in lst:
        for b in lst:
            if a != b:
                games.append((a,b))
    return games
    
footballclubes(lst)
print(everyMatches(lst))