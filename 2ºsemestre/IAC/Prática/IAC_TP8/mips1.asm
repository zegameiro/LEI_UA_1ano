	.data
minus: .asciiz "texto em minusculas"
maius: .space 20
	.text
	.globl main
	#i->$t0,
	#&minus[i]->$a0
	#&maius[i]->$a1 & maius[i]->$t3
	
main: la $a0, minus	#$a0 = minus[]   simboliza o endereço de memória
      li $t0, 0
      
while: addu $t1, $a0, $t0   #$t1 = minus + i*1    multiplica por 1 pois é 1 byte para cada caractér
       lb $t2, 0($t1)  #$t2 = minus[i]
       beq $t2, '\0', endwhile
       
       addi $t4, $t2, 'A'
       subi $t4,$t4,'a'    #$t4 = minus[i] + 'A' - 'a'
       
       la $t6, maius
       addu $t3, $t6, $t0
       
       sb $t4, 0($t3)
       addi $t0, $t0, 1  #i++
       
       j while
       
                  
endwhile: la $a0, maius
          li $v0, 4
          syscall
          
          li $v0,10
          syscall
      
      
      

