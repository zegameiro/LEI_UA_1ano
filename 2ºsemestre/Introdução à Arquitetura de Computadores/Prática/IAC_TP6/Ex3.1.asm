	.data
		mg1 : .asciiz "Introduza dois número:\n "
		mg3: .asciiz "A soma dos números é: "

	.text 
	.globl main

main:	
###Ex3.1-------------------------------
	
	#Impressão da mg1
	la $a0, mg1      
	li $v0, 4	     #atribuição da função print_string a $v0
	syscall       #print_string("Introduza um número:")
	
	#Leitura do valor do primeiro número introduzido
	li $v0, 5     #atribuição da função read_int a $v0
	syscall        #O valor lido é retornado para $v0
	move $t0, $v0   # $t0 = $v0

	li $v0, 5    #atribuição da função read_int a $v0
	syscall      #O valor lido é retornado para $v0
	move $t1, $v0    # $t1 = $v0
	
	#Adição dos números
	add $t2, $t0, $t1    #$t2 = $t0 + $t1
	
	#Impressão da mg3
	la $a0, mg3
	li $v0, 4     #atribuição da função print_string a $v0
	syscall       #print_string("A soma dos valores é: ")
	
	#Impressão do valor de $t2
	move $a0, $t2   #$a0 = $t2
	li $v0, 1      #atribuição da função print_int a $v0
	syscall         #print_int($a0)
	
	
	
	
	
	
	
	
