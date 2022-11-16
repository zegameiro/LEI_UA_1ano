# Complete o programa!

# a)
def loadFile(fname, lst):
    fi = open(fname, 'r')
    fi.readline()
    for line in fi:
        line = line.strip("\n")
        l = line.split('t')
        reg = (int(l[0]), l[1], float(l[5]), float(l[6]), float(l[7]))
        lst.append(reg)
    fi.close()
    return lst
    
# b) Crie a função notaFinal aqui...
def notaFinal(l):
    return (l[2] + l[3] + l[4])/3

# c) Crie a função printPauta aqui...
def printPauta(lst, ficheiro="none"):
    if ficheiro == "none":
        print('{:7s}{:^60s}{:>5s}'.format('Número', 'Nome', 'Nota'))
        for l in lst:
            print('{:6d}{:^60s}{:>5}'.format(l[0],l[1],notaFinal(l)))
        return
    else:
        fout = open(ficheiro,"w")
        fout.write("{:6d}{:^60s}{:>5s}\n".format("Número2","Nome","Nota"))
        for l in lst:
            fout.write("{:6d}{:^60s}{:>5s}\n".format(l[0],l[1],notaFinal(l)))
        return
        fout.close()

# d)
def main():
    lst = []
    # ler os ficheiros
    loadFile("school1.csv", lst)
    loadFile("school2.csv", lst)
    loadFile("school3.csv", lst)
    
    # ordenar a lista
    lst.sort()
    
    # mostrar a pauta
    printPauta(lst)
    printPauta(lst,'dados.txt')


# Call main function
if __name__ == "__main__":
    main()
