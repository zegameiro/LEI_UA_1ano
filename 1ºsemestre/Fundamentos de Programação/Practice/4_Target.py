x = 5
y = 15
target = 20

def closerToTarget(x, y, target):
    nums =[x, y]
    perto = min(nums, key=lambda x: abs(x-target))
    
    return perto

print(closerToTarget(x, y, target))

# 5, 10, 8
# 3  2