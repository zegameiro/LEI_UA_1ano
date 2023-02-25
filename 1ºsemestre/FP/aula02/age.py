# This program outputs the age category for a given input age.
# It has a semantic error.  Can you find it?
# Which values of age produce the output "adult"?
# Correct the error.
# Can you simplify the code to avoid redundant conditions?

age = int(input("Age? "))

if age < 0:
    print("ERROR: invalid age!")
    exit(1)     # this terminates the program

print("Age:", age)

if age <= 13 :
    cat = "child"
elif 13 < age < 18:
    cat = "teenager"
else:
    cat = "adult"

print("Category:", cat)

