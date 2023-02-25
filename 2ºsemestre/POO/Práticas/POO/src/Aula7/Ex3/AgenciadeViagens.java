package Aula7.Ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class AgenciadeViagens {
    private ArrayList<Alojamento> alojamentos;
    private ArrayList<Carro> carros;
    private String nome;
    private String endereco;
    private static Scanner sc = new Scanner(System.in);

    public AgenciadeViagens(String nome, String endereco, ArrayList<Carro> carros, ArrayList<Alojamento> alojamentos){
        this.nome = nome;
        this.endereco = endereco;
        this.alojamentos = alojamentos;
        this.carros = carros;
    }
    
    public String getNome(){
        return nome;
    }

    public String getEndereço(){
        return endereco;
    }
    
    public void setNome(String n) {
        nome = n;
    }

    public void setEndereço(String e) {
        endereco = e;
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public ArrayList<Alojamento> getAlojamentos() {
        return alojamentos;
    }

    public void setCarros(ArrayList<Carro> c) {
        carros = c;
    }
    public void setAlojamentos(ArrayList<Alojamento> a) {
        alojamentos = a;
    }

    private void add(Alojamento obj) {
        alojamentos.add(obj);
    }

    public void addAp() {
        System.out.println("Código: ");
        String cd = sc.next();
        sc.nextLine();

        System.out.println("Nome: ");
        String nm = sc.next();
        sc.nextLine();

        System.out.println("Local: ");
        String lc = sc.next();
        sc.nextLine();

        System.out.println("Preço da noite: ");
        double pn = sc.nextDouble();
        
        System.out.println("Disponibilidade(Y/N): ");
        boolean dsp = askDisponibilidade(sc.next());

        System.out.println("Avaliação: ");
        double avl = sc.nextDouble();

        this.add(new Alojamento(cd, nm, lc, pn, dsp, avl));
    }

    public void addQuarto() {
        System.out.println("Código: ");
        String cd = sc.next();
        sc.nextLine();

        System.out.println("Nome: ");
        String nm = sc.next();
        sc.nextLine();

        System.out.println("Local: ");
        String lc = sc.next();
        sc.nextLine();

        System.out.println("Preço da noite: ");
        double pn = sc.nextDouble();

        System.out.println("Disponibilidade (Y/N): ");
        boolean dsp = askDisponibilidade(sc.next());

        System.out.println("Avaliação: ");
        double avl = sc.nextDouble();
        
        System.out.println("Tipo: ");
        String t = sc.next();
        sc.nextLine();

        this.add(new Quarto(cd, nm, lc, pn, dsp, avl, t));
    }

    public boolean askDisponibilidade(String s) {
        return s.equals("y") || s.equals("Y");
    }

    public void addCarro() {
        System.out.println("Classe: ");
        char c = (char) sc.next().charAt(0);
        sc.nextLine();

        System.out.println("Motorização: ");
        String mt = sc.next();
        sc.nextLine();

        carros.add(new Carro(c, mt));
    }

    public void listAloj() {
        for (Alojamento a: alojamentos) {
            System.out.println(a.toString());
        }
    }

    public void listCar() {
        for (Carro c : carros) {
            System.out.println(c.toString());
        }
    }

    public void emprestarCarro() {
        System.out.println("Código: ");
        int cd = sc.nextInt();

        if(carros.get(findCarro(cd)).isDisponivel()) {
            carros.get(findCarro(cd)).setDisponivel(false);
            System.out.println("Carro emprestado com sucesso!");
        } else {
            System.out.println("O carro não está disponível!");
        }
    }

    private int findCarro(int id) {
        int i = 0;
        for (Carro c : carros) {
            if(c.getId() == id) {
                break;
            }
            i++;
        }
        return i;
    }

    public void reservar() {
        System.out.println("Código: ");
        int id = sc.nextInt();

        if(alojamentos.get(findAloj(id)).getDisp()) {
            alojamentos.get(findAloj(id)).setDisp(false);
            System.out.println("Reserva efetuada com sucesso!");
        } else {
            System.out.println("O alojamento não está disponível!");
        }
    }

    public int findAloj(int id) {
        int i = 0;
        for(Alojamento a : alojamentos) {
            if(Integer.parseInt(a.getCodigo()) == id) {
                break;
            }
            i++;
        }
        return i;
    }
}
