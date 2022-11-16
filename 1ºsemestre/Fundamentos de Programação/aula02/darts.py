# You throw a dart that hits coordinates (x, y) on a dartboard.
# Create a program that gives you the score.
# See:
#   https://en.wikipedia.org/wiki/Darts#Dartboard
#   https://www.dimensions.com/element/dartboard

print("Enter the coordinates in mm from the center of the board.")
x = float(input("x? "))
y = float(input("y? "))


# Points of the sectors, clockwise from the top
# Example: the sector right from the center is POINTS[5] == 6.
POINTS = (20, 1, 18, 4, 13, 6, 10, 15, 2, 17, 3, 19, 7, 16, 8, 11, 14, 9, 12, 5)

import math

r = math.sqrt(x**2 + y**2)

ang = atan(y/x)
math.degrees = (ang)

if  0 < ang < 9:
   points = 6
elif 9 < ang < 27:
   points = 13
elif 27 < ang < 45:
   points = 4
elif 45 < ang < 63:
   points = 18
elif 63 < ang < 81:
   points = 1
elif 81 < ang < 99:
   points = 20
elif 99 < ang < 
 

print(score)
