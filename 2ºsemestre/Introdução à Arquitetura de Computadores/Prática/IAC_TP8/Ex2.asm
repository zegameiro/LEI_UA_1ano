	.data
	
lista: .space 6
str: .asciiz "Insira 6 números\n"

	.text
	.globl main
	
	
main: la $a0, str
      li $v0, 4
      syscall	#print_str(str)
      
      li $v0, 5
      syscall
      move $t0, $v0
      
      li $v0, 5
      syscall
      move $t1, $v0
      
      li $v0, 5
      syscall
      move $t2, $v0
      
      li $v0, 5
      syscall
      move $t3, $v0
      
      li $v0, 5
      syscall
      move $t4, $v0
      
      li $v0, 5
      syscall
      move $t5, $v0
      
      la $a0, lista
	      
      