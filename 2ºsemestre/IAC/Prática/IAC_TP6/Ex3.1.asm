	.data
		mg1 : .asciiz "Introduza dois n�mero:\n "
		mg3: .asciiz "A soma dos n�meros �: "

	.text 
	.globl main

main:	
###Ex3.1-------------------------------
	
	#Impress�o da mg1
	la $a0, mg1      
	li $v0, 4	     #atribui��o da fun��o print_string a $v0
	syscall       #print_string("Introduza um n�mero:")
	
	#Leitura do valor do primeiro n�mero introduzido
	li $v0, 5     #atribui��o da fun��o read_int a $v0
	syscall        #O valor lido � retornado para $v0
	move $t0, $v0   # $t0 = $v0

	li $v0, 5    #atribui��o da fun��o read_int a $v0
	syscall      #O valor lido � retornado para $v0
	move $t1, $v0    # $t1 = $v0
	
	#Adi��o dos n�meros
	add $t2, $t0, $t1    #$t2 = $t0 + $t1
	
	#Impress�o da mg3
	la $a0, mg3
	li $v0, 4     #atribui��o da fun��o print_string a $v0
	syscall       #print_string("A soma dos valores �: ")
	
	#Impress�o do valor de $t2
	move $a0, $t2   #$a0 = $t2
	li $v0, 1      #atribui��o da fun��o print_int a $v0
	syscall         #print_int($a0)
	
	
	
	
	
	
	
	
