
# This program generates 20 terms of a sequence by a recurrence relation.
Un = 100
n = -1
                    # Un = each term of the sequence. Initially = U0
while Un > 0:
    print(Un)
    Un = 1.01*Un - 1.01
    n += 1
print("Foram imprimidos", n, "termos.")
    
    
         # Set Un to the next term of the sequence
        