package Aula3;

import java.util.Scanner;
import java.util.Random;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int guess;
        int number;
        String res; 
        do {
			int tentativas = 0;
            number = ran.nextInt(101);
			do {
				System.out.println("Insira um numero entre 1 e 100");
				guess = sc.nextInt();
				tentativas++;
				
				if(guess > number) {
					System.out.println("Inseriu um numero maior");
				} else if(guess < number) {
					System.out.println("Inseriu um numero menor");
				}
				
			}while( guess != number); 
			
			System.out.println("Acertou no número com " + tentativas + " tentativas");
			System.out.println("Pretende continuar? Prima (S)im");
			res = sc.next();
			
		}while(res.equals("S") || res.equals("Sim"));
        sc.close();
    }
    
}
