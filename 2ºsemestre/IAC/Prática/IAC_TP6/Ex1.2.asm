	.text
	.globl main

main:
###Ex1.2-------------------------------
	#Mudar os valores no register de $t0 e $t1 para funcionar
	
	or $t2, $t0,$t1      #$t2 = $t0 or $t1
	and $t3, $t0, $t1    #$t3 = $t0 and $t1
	nor $t4, $t0, $t1    #$t4 = $t0 nor $t1
	xor $t5, $t0, $t1    #$t5 = $t0 xor $t1