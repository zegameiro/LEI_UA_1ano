# Exercise 5 on "How to think like a computer scientist", ch. 11.

import turtle

t = turtle.Turtle()

# Use t.up(), t.down() and t.goto(x, y)

# Put your code here
wn = turtle.Screen()
wn.setworldcoordinates(-300, -300, 300, 300)

f = open('drawing.txt')

for line in f:
    items = line.split()
    if items[0] == "UP":
        t.up()
    else:
        if items[0] == "DOWN" :
            t.down()
        else:
            t.goto(int(items[0]), int(items[1]))
f.close

# wait
turtle.Screen().exitonclick()

