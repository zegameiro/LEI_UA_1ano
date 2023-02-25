lst=[5,12,12,5,12]

def positionDifferenceFirstLastLargest(arr):
    max = 0
    x=0
    last =0 
    first =0
    
    for i in arr:
        if i >= x:
            max=i
            x=i
        else:
            break
    
    for i in range(0, len(arr)):
        if arr[i] == max:
            last = i
           
    for i in range(0, len(arr)):
        if arr[i] == max:
            first = i
            break
    
    dif = last - first
    
    return dif

    # l = None
    # f = None
      
    # for i in range(0, len(arr)):
    #     if arr[i] == max:
    #         l = i
        
    #     if arr[i] == max and f == None:
    #         f = i

           
    

print(positionDifferenceFirstLastLargest(lst))