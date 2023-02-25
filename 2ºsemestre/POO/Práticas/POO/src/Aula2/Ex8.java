package Aula2;

import java.util.Scanner;
import java.lang.Math;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor do cateto A de um triângulo retângulo? ");
        Double catA = sc.nextDouble();
        System.out.println("Qual o valor do cateto B de um triângulo retângulo? ");
        Double catB = sc.nextDouble();
        Double hipotenusa = Math.sqrt((Math.pow(catA, 2)) + (Math.pow(catB, 2)));
        Double angulo = catA / hipotenusa;
        Double anggraus = Math.toDegrees(Math.acos(angulo));

        System.out.print("O valor da hipotenusa é " + hipotenusa + " e o valor do ângulo entre o cateto A e a hipotenusa é " + anggraus);
        sc.close();
    }

}
