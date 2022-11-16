inputStr = 'a1'

def chess (str):
    if str[0] in "ah" and str[1] in "18":
        return "corner"
    elif str[0] in "ah" or str[1] in "18":
        return "border"
    else:
        return "inside"
    
print(chess(inputStr))