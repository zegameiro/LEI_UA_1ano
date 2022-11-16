package Aula7.Ex3;

import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.System.*;

public class Ex3 {
    public static Scanner sc = new Scanner(System.in);
    public static AgenciadeViagens agc = new AgenciadeViagens("Agência", "teste", new ArrayList<Carro>(), new ArrayList<Alojamento>());

    public static void menu() {
		System.out.println("MENU DA AGENCIA");
		System.out.println("1 - Adicionar Apartamento");
		System.out.println("2 - Adicionar Quarto");
		System.out.println("3 - Adicionar Carro");
		System.out.println("4 - Listar Alojamento");
		System.out.println("5 - Listar Carros");
		System.out.println("6 - Emprestar Carro");
		System.out.println("7 - Reservar");
		System.out.println("8 - Sair");
		
		execMenu(sc.nextInt());
    }

    public static void main(String[] args) {
        menu();
    }

    public static void execMenu(int op) {
        switch (op) {
            case 1:
                agc.addAp();
                menu();
                break;
            case 2:
                agc.addQuarto();
                menu();
                break;
            case 3:
                agc.addCarro();
                menu();
                break;
            case 4:
                agc.listAloj();
                menu();
                break;
            case 5:
                agc.listCar();
                menu();
                break;
            case 6:
                agc.emprestarCarro();
                menu();
                break;
            case 7:
                agc.reservar();
                menu();
                break;
            case 8:
                exit(0);
                break;
            default:
                menu();
                op = sc.nextInt();
                break;
        }
    }
}
