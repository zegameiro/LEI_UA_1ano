	.text
	.globl main

main:
###Ex2.1-------------------------------
	#Mudar o valor de $t0 no register para funcionar
	
	sll $t1, $t0, 4    #$t1 = $t0 << Immediate = 4 (shift l�gico para a esquerda)
	sra $t2, $t0, 4    #$t2 = $t0 >> Immediate = 4 (shift aritm�tico para a direita)
	srl $t3, $t0, 4    #$t3 = $t0 >> Immediate = 4 (shift l�gico para a direita)