package Aula2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Insira a temperatura inicial da água em graus Celsius - ");
        Double iTemp = myScanner.nextDouble();
        System.out.print("Insira a temperatura final da água em graus Celsius - ");
        Double fTemp = myScanner.nextDouble();
        System.out.print("Insira a quantidade de água utilizada em kg - ");
        Double M = myScanner.nextDouble();

        Double Q = M * (fTemp - iTemp) * 4184;

        System.out.print("A energia necessária para aquecer a água de " + iTemp + " C a " + fTemp + " C é de " + Q + " Joules.");

        myScanner.close();
    }

}
