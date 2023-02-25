package Aula3;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
		double value, media;
		double total = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira uma cadeia de números reais e como último valor insira o inicial");
		double value1 = sc.nextDouble();
		double max = value1;
		double min = value1;
		double sum = value1;
		
		do {
			value = sc.nextDouble();
			
			sum += value;
			total += 1;
			
			if (value > max) {
				max = value;
			}
			if (value < min) {
				min = value;
			}
			
		} while(value!=value1);
		
		sc.close();
		media = sum / total;
		
		System.out.println("Número máximo: " + max);
		System.out.println("Número mínimo: " + min);
		System.out.println("Média: " + media);
		
	}
}
