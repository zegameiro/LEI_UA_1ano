.data
	prompt1 : .asciiz "Introduza um n�mero: "
	strpar: .asciiz "O n�mero � par"
	strimpar: .asciiz "O n�mero � �mpar"
	
	.text
	
main:
	la $a0, prompt1
	li $v0, 4	#atribui��o da fun��o print_string(prompt1) a $v0
	syscall    #print_string(prompt1)
	
	li $v0, 5		#atribui��o da fun��o read_int a $v0
	syscall		#read_int()
	
	andi $t0, $v0, 1
	
if:	bne $t0, $0, else   #Se $t0 != 0 ir� saltar para o passo else; Se $t0 == 1 ir� avan�ar no passo if
	la $a0, strpar	
	li $v0,4         	#atribui��o da fun��o print_string(prompt1) a $v0
	syscall            #print_string(strpar)
	j endif            #Avan�a para o passo endif
	
else:	la $a0, strimpar
	li $v0, 4        	#atribui��o da fun��o print_string(prompt1) a $v0
	syscall            #print_string(strimpar)

endif:
	
	
