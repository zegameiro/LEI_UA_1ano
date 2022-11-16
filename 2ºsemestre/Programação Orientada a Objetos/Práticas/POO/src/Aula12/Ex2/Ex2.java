package Aula12.Ex2;

import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class Ex2  {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new FileReader("movies.txt"));

        Set<Movie> movies = new TreeSet<Movie>();

        input.nextLine();

        while(input.hasNext()) {
            String[] lines = input.nextLine().split("\t");
            movies.add(new Movie(lines[0], Double.parseDouble(lines[1]), lines[2], Type.valueOf(lines[3]), Integer.parseInt(lines[4])));
        }
        input.close();

        // b) Impressão das informações sobre os filmes em formato de uma tabela e ordenados pelo Nome de cada um
        System.out.printf("%-40s %-10s %-10s %-10s %-10s \n","Name","Score","Rating","Genre","Running Time");

        for(Movie m: movies) {
            System.out.println(m);
        }

        List<Movie> moviesList = movies.stream().collect(Collectors.toList());

        // c1) Ordenar os filmes por ordem decrescente do Score

        moviesList.sort(new ScoreComparator());
        System.out.println("---------------Movies ordenados pelo Score (decrescente)------------------");
        
        System.out.printf("%-40s %-10s %-10s %-10s %-10s \n","Name","Score","Rating","Genre","Running Time");

        for(Movie m: moviesList) {
            System.out.println(m);
        }

        // c2) Ordenar os filmes por ordem crescente do Running Time

        moviesList.sort(new RunTimeComparator());

        System.out.println("-------------Movies ordenados pelo Running Time (crescente)---------------");

        System.out.printf("%-40s %-10s %-10s %-10s %-10s \n","Name","Score","Rating","Genre","Running Time");

        for(Movie m: moviesList) {
            System.out.println(m);
        }

        // d) Impressão dos géneros existentes nos filmes

        Set<Type> genres = new HashSet<Type>();

        for(Movie m : moviesList) {
            genres.add(m.getGenre());
        }

        System.out.println("--------------------------Géneros existentes------------------------------");

        for(Type t : genres) {
            System.out.println(t);
        }
        System.out.println("--------------------------------------------------------------------------");

        //Criação de um ficheiro myselection que contém filmes com género comedy e score superior a 60
        PrintWriter pw = new PrintWriter("myselection.txt");
        
        for(Movie m : moviesList) {
            if(m.getGenre().name().equals("comedy") && m.getScore() > 60) {
                pw.println(m);
            }
        }
        System.out.println("Ficheiro myselection.txt criado e gravado com sucesso!");
        pw.close();
    }
}
