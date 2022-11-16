seconds = int(input("Quanto tempo decorreu, em segundos?"))
hours = seconds // 3600   
minutes = (seconds % 3600)//60
seconds1 = (seconds % 3600) % 60
print("{hours:02d}:{minutes:02d}:{seconds1:02d}".format(hours = hours, minutes = minutes, seconds1 = seconds1))