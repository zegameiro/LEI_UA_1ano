package Aula8.Ex1;

public class Ex1 {
    
    public static void main(String[] args){

        Autoligeiro al1 = new Autoligeiro("ZX-34-AS", "Mercedez", "Classe A", 410, 6, 525);
        Motociclo m1 = new Motociclo("AD-37-EW", "Kawazaki", "Ninja 250SL", 28, "Desportiva");
        Taxi t1 = new Taxi("TB-63-FY", "Mercedes", "Classe E", 200, 7, 234, "JUEI193FBN2O99");
        Pesadomerc pm1 = new Pesadomerc("GH-KJ-78", "Tesla", "Model X", 680, 12, 30000, 90000);
        Pesadopass pp1 = new Pesadopass("ER-75-JG", "Renault", "JHL", 560, 12, 25000, 40);
        LigeiroEletrico lg1 = new LigeiroEletrico("RE-78-TR", "Fiat", "Punto XD", 453, 45, 340, 510);
        Empresa emp1 = new Empresa("RuralView Camping", "2932-590", "ruralview.camping@ua.pt");
        PesadoPassEletrico ppe1 = new PesadoPassEletrico("54-97-RD", "Tesla", "Model R", 683, 45, 85000, 100, 1000);

        emp1.addViatura(al1);
        emp1.addViatura(m1);
        emp1.addViatura(t1);
        emp1.addViatura(pm1);
        emp1.addViatura(pp1);
        emp1.addViatura(lg1);
        emp1.addViatura(ppe1);

        System.out.println(emp1);

        lg1.carregar(100);
        System.out.println("O carro encontra-se com " + lg1.autonomia() + " km de autonomia");



        al1.trajeto(67);
        al1.trajeto(24);

        m1.trajeto(120);
        m1.trajeto(93);

        t1.trajeto(84);
        t1.trajeto(62);

        pm1.trajeto(632);
        pm1.trajeto(57);

        pp1.trajeto(34);
        pp1.trajeto(64);

        lg1.trajeto(102);
        lg1.trajeto(234);

        ppe1.trajeto(354);
        ppe1.trajeto(753); 

        if(al1.distanciaTotal() > m1.distanciaTotal() && al1.distanciaTotal() > t1.distanciaTotal() && al1.distanciaTotal() > pm1.distanciaTotal() && al1.distanciaTotal() > pp1.distanciaTotal() && al1.distanciaTotal() > lg1.distanciaTotal() && al1.distanciaTotal() > ppe1.distanciaTotal()) {
            
            System.out.println("O veículo de matrícula " + al1.getMatricula() + " é o que tem mais quilómetros percorridos\n");

        } else if(m1.distanciaTotal() > al1.distanciaTotal() && m1.distanciaTotal() > t1.distanciaTotal() && m1.distanciaTotal() > pm1.distanciaTotal() && m1.distanciaTotal() > pp1.distanciaTotal() && m1.distanciaTotal() > lg1.distanciaTotal() && m1.distanciaTotal() > ppe1.distanciaTotal()){
            
            System.out.println("O veículo de matrícula " + m1.getMatricula() + " é o que tem mais quilómetros percorridos\n");

        } else if(t1.distanciaTotal() > al1.distanciaTotal() && t1.distanciaTotal() > m1.distanciaTotal() && t1.distanciaTotal() > pm1.distanciaTotal() && t1.distanciaTotal() > pp1.distanciaTotal() && t1.distanciaTotal() > lg1.distanciaTotal() && t1.distanciaTotal() > ppe1.distanciaTotal()){
            
            System.out.println("O veículo de matrícula " + t1.getMatricula() + " é o que tem mais quilómetros percorridos\n");

        }else if(pm1.distanciaTotal() > al1.distanciaTotal() && pm1.distanciaTotal() > t1.distanciaTotal() && pm1.distanciaTotal() > m1.distanciaTotal() && pm1.distanciaTotal() > pp1.distanciaTotal() && pm1.distanciaTotal() > lg1.distanciaTotal() && pm1.distanciaTotal() > ppe1.distanciaTotal()){

            System.out.println("O veículo de matrícula " + pm1.getMatricula() + " é o que tem mais quilómetros percorridos\n");

        } else if(pp1.distanciaTotal() > al1.distanciaTotal() && pp1.distanciaTotal() > t1.distanciaTotal() && pp1.distanciaTotal() > pm1.distanciaTotal() && pp1.distanciaTotal() > pm1.distanciaTotal() && pp1.distanciaTotal() > lg1.distanciaTotal() && pp1.distanciaTotal() > ppe1.distanciaTotal()){

            System.out.println("O veículo de matrícula " + pp1.getMatricula() + " é o que tem mais quilómetros percorridos\n");

        } else if(lg1.distanciaTotal() > al1.distanciaTotal() && lg1.distanciaTotal() > t1.distanciaTotal() && lg1.distanciaTotal() > pm1.distanciaTotal() && lg1.distanciaTotal() > pm1.distanciaTotal() && lg1.distanciaTotal() > pp1.distanciaTotal() && lg1.distanciaTotal() > ppe1.distanciaTotal()){

            System.out.println("O veículo de matrícula " + lg1.getMatricula() + " é o que tem mais quilómetros percorridos\n");

        } else if(ppe1.distanciaTotal() > al1.distanciaTotal() && ppe1.distanciaTotal() > t1.distanciaTotal() && ppe1.distanciaTotal() > pm1.distanciaTotal() && ppe1.distanciaTotal() > pm1.distanciaTotal() && ppe1.distanciaTotal() > pp1.distanciaTotal() && ppe1.distanciaTotal() > lg1.distanciaTotal()){

            System.out.println("O veículo de matrícula " + lg1.getMatricula() + " é o que tem mais quilómetros percorridos\n");

        } 
    }
}
