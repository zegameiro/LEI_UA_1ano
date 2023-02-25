.data
	prompt1: .asciiz "Introduza um número: "
	result: .asciiz "O fatorial do número inserido é: "
	
.text

main: 	la $a0, prompt1
	li $v0, 4		#atribuição da função print_string(prompt1) a $v0
	syscall		#print_string(prompt1)
	
	li $v0, 5		#atribuição da função read_int() a $v0
	syscall		#read_int()
		
	li $t2, 1		#f = 1
	move $t0, $v0	#$t0 = $v0

for:	ble  $t0, 0, endfor	#Se $t0 < 0 irá avançar para o passo endfor. Se $t0 > 0 continuará no ciclo for
	mul $t2, $t2, $t0		#t2 = $t2 * $t0 (f = f * n)
	subi $t0,$t0,1		#i--
	j for			#Retorna ao início do ciclo for

endfor:
	la $a0, result
	li $v0, 4		#atribuição da função print_string(result) a $v0
	syscall		#print_string(result)
	
	move $a0, $t2	#$a0 = $t2
	
	li $v0,1		#Atribuição da função print_int($a0)
	syscall		#print_int($a0)