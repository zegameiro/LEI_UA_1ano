package Aula2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        Double distance;

        System.out.println("Insira uma distância em km: ");
        distance = myObj.nextDouble();

        Double mile = distance / 1.609;

        System.out.print("A distância em milhas é de " + mile);

        myObj.close();
    }
    
};
