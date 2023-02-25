.data
	prompt1 : .asciiz "Introduza um número: "
	strpar: .asciiz "O número é par"
	strimpar: .asciiz "O número é ímpar"
	
	.text
	
main:
	la $a0, prompt1
	li $v0, 4	#atribuição da função print_string(prompt1) a $v0
	syscall    #print_string(prompt1)
	
	li $v0, 5		#atribuição da função read_int a $v0
	syscall		#read_int()
	
	andi $t0, $v0, 1
	
if:	bne $t0, $0, else   #Se $t0 != 0 irá saltar para o passo else; Se $t0 == 1 irá avançar no passo if
	la $a0, strpar	
	li $v0,4         	#atribuição da função print_string(prompt1) a $v0
	syscall            #print_string(strpar)
	j endif            #Avança para o passo endif
	
else:	la $a0, strimpar
	li $v0, 4        	#atribuição da função print_string(prompt1) a $v0
	syscall            #print_string(strimpar)

endif:
	
	
