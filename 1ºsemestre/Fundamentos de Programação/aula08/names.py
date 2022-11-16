d = {}

def names():
    fil = open('names.txt', 'r')
    fil.readline()
    for line in fil:
        line = line.split()
        firstname = line[0]
        lastname = line[-1]
        if lastname not in d:
              d[lastname] = set()
        d[lastname].add(firstname)

    for a,b in d.items():
        print('{}:{}'.format(a,b))


names()
