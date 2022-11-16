package Aula3;

import java.util.Random;
import java.lang.Math;

public class Ex8 {
    public static void main(String[] args){
        Random rand = new Random(); 
        Double pauta[][] = new Double[16][3];
        System.out.printf ("%8s %8s %8s \n","NotaT","NotaP","Pauta");
        Double notaT, notaP, notaF;
        for (int i = 0; i < 16; ++i) {
            notaT = rand.nextDouble(20);
            notaT = (double) (Math.round(notaT*10)) / 10;
            pauta[i][0] = notaT;

            notaP = rand.nextDouble(20);
            notaP = (double) (Math.round(notaP*10)) / 10;
            pauta[i][1] = notaP;

            if (notaT < 7.0 || notaP < 7.0) {
                notaF = 66.0;
            } else {
                notaF = notaT * 0.4 + notaP * 0.6;
                notaF = (double) Math.round(notaF);
            }
            pauta[i][2] = notaF;
            
            System.out.printf("%8s %8s %8.0f\n", pauta[i][0], pauta[i][1],pauta[i][2]);            
        }
    }
}