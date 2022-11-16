
def main():
    A = "reading"
    B = "eating"
    C = "traveling"
    D = "writing"
    E = "running"
    F = "music"
    G = "movies"
    H = "programming"

    interests = {
        "Marco": {A, D, E, F},
        "Anna": {E, A, G},
        "Maria": {G, D, E},
        "Paolo": {B, D, F},
        "Frank": {D, B, E, F, A},
        "Teresa": {F, H, C, D}
        }


    print("a) Table of common interests:")
    commoninterests = {(x,y):(k & z) for x, k in interests.items() for y,z in interests.items() if x < y}
    print(commoninterests)

    print("b) Maximum number of common interests:")
    maxCI = max( len(z) for x,z in commoninterests.items())
    print(maxCI)

    print("c) Pairs with maximum number of matching interests:")
    maxmatches = [l for l,j in commoninterests.items() if len(j) == maxCI]
    print(maxmatches)

    print("d) Pairs with low similarity:")
    lowJaccard = [(x,y) for x,y in commoninterests.items()]
    lowJaccard = [(x,y) for x, k in interests.items() for y, z in interests.items() if x<y and (len(k & z)/len(k.union(z)))<0.25]
    print(lowJaccard)


# Start program:
main()

