import random

def main():
    secret = random.randrange(1, 101);
    print("Can you guess my secret?")
    number = int(input("Guess a number between 1 and 100."))
    tentativas = 0
    
    while number != secret:
        if number < secret:
            number = int(input("Youre to low! Try again."))
            tentativas += 1
        elif number > secret:
            number = int(input("Youre to high! Try again."))
            tentativas += 1
    
    print("You got it in", tentativas,"attempts!! Congradulations:)!")
        
     

main()
