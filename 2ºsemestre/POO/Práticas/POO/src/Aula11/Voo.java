package Aula11;

import java.util.Map;

public class Voo {
    private String hora,voo,origem;
    private String atraso, previsto;
    private static Map<String,String> siglasCompanhias;

    public Voo(String hora, String voo, String origem) {
        this.hora = hora;
        this.voo = voo;
        this.origem = origem;
        this.atraso = "";
        this.previsto = "";
    }

    public Voo(String hora, String voo, String origem, String atraso) {
        this.hora = hora;
        this.voo = voo;
        this.origem = origem;
        this.atraso = atraso;
        this.previsto = horaPrevista(hora, atraso);
    }

    private String horaPrevista(String h, String a) {
        String[] hm = h.split(":");
        int hm1 = 60 * Integer.parseInt(hm[0]) + Integer.parseInt(hm[1]);

        String[] ahm = a.split(":");
        int ahm1 = 60 * Integer.parseInt(ahm[0]) + Integer.parseInt(hm[1]);

        int phm = hm1 + ahm1;

        return String.format("%02d:%02d", phm / 60, phm % 60);
    }

    public static int stringTominutes (String s) {
        String[] h_m = s.split(":");
        int seconds = Integer.parseInt(h_m[0]) * 60 + Integer.parseInt(h_m[1]);

        return seconds;
    }

    public static String minutesTostring(int m) {
        return String.format("%02d : %02d", (int) m / 60, m % 60);
    }

    public String getHora() {
        return hora;
    }
    
    public void setHora(String h) {
        hora = h;
    }

    public String getVoo() {
        return voo;
    }

    public void setVoo(String v) {
        voo = v;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String o) {
        origem = o;
    }

    public String getAtraso() {
        return atraso;
    }

    public void setAtraso(String a) {
        atraso = a;
    }

    public String getPrevisto() {
        return previsto;
    }

    public void setPrevisto(String p) {
        previsto = p;
    }

    public static void setSiglasCompanhias(Map<String,String> sC) {
        siglasCompanhias = sC;
    }

    @Override
    public String toString() {
        if (atraso.contentEquals("")) {
            return String.format("%-15s %-15s %-20s %-20s", hora,voo,siglasCompanhias.get(voo.substring(0, 2).trim()),origem);
        } else {
            return String.format("%-15s %-15s %-20s %-20s %-15s %-15s", hora,voo,siglasCompanhias.get(voo.substring(0, 2).trim()),origem,atraso, "Previsto: " + previsto);
        }
    }
}
