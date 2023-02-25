word = str(input("Input a word with numbers!!"))

def countDigits(word):
    count = 0
    for x in word:
        if x.isdigit():
            count += 1
    return count
    
print(countDigits(word))
    