from tkinter import filedialog

def main():
    name = filedialog.askopenfilename(title="Choose File") 
    filename = open(name,"r")
    filesum(filename)
    filename.close
       
def filesum(filename):
    sum = 0
    for line in filename:
        sum += float(line)
    print("Sum:", sum)

if __name__ == "__main__":
    main()

