word = str(input("Word?"))

def ispalindrome(word):
    n = len(word)
    for x in range(n):
        if word[x] != word[(n-1) - x]:
            return False
    return True
    
print(ispalindrome(word))