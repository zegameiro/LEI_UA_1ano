def compareFiles(file1, file2):
    pos = 1024
    with open(file1, "rb") as f1:
        with open(file2, "rb") as f2:
            for x in range(len(f1.read())):
                if not(f1.read(pos) == f2.read(pos)):
                    print("Estes ficheiros são diferentes")
                    break;
                else:
                    pos += 1024
            print("Estes ficheiros são iguais")

compareFiles("File1.txt", "File2.txt")
