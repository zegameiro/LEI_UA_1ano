import turtle

t = turtle.Turtle()

# Use t.up(), t.down() and t.goto(x, y)

# Put your code here
wn = turtle.Screen()
wn.setworldcoordinates(-300, -300, 300, 300)

f = open('drawing.txt')

for x in f:
    coor = x.split()
    if coor[0] =="UP":
        t.up()
    elif coor[0] =="DOWN":
        t.down()
    else:
        t.goto(int(coor[0]), int(coor[1]))

f.close

turtle.Screen().exitonclick()



