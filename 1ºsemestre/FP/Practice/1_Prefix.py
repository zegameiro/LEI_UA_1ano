x = "abcdabe"

def longestPrefixRepeated(s):
    ret1=""
    ret2=""
    for i in range(1, len(s)):
        for x in range(i+1, len(s)+1):

            prefix = s[0:x - i]
            substr = s[i:x]

            if prefix == substr:
                ret1 = substr 
                if len(ret1) >= len(ret2):
                    ret2 = ret1
            else:
                break
    return ret2    
    
print(longestPrefixRepeated(x))
