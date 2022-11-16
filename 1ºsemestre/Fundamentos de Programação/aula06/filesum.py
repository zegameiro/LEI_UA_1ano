from tkinter import filedialog

def main():
    name = filedialog.askopenfilename(title="Choose File") 
    filename = open(name, 'r')
    fileSum(filename) 
    filename.close()   

def fileSum(filename):
    total = 0
    for line in filename:
        total += float(line)
    print("Sum:", total) 

if __name__ == "__main__":
    main()

