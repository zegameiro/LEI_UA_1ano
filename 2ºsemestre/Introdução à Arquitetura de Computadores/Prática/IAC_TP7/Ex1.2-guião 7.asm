	.data
		prompt1: .asciiz "Introduza um n�mero: "
	.text

main:
	la $a0, prompt1
	li $v0, 4		#atribui��o da fun��o print_string(prompt1) a $v0
	syscall		#print_string(prompt1)
	
	li $v0, 5		#atribui��o da fun��o read_int() a $v0
	syscall		#read_int()
	
	move $t1,$v0
	
	addi $t0, $0, 0

for:	bge $t0, $t1, endfor	#Se $t0 >= $t1 avan�a para o passo endfor. Se $t0 <  $t1 continua no for
	li $a0, '-'		# $a0 = '-'
	li $v0, 11		#Atribui��o da fun��o print_char() a $v0
	syscall			#print_char($a0)
	addi $t0, $t0, 1            # i++
	j for
	
endfor:    #exit()
	
	

