package Aula12.Ex2;

public class Movie implements Comparable<Movie>{

    private String name, rating;
    private Type genre;
    private double score;
    private int runningt;

    public Movie(String name, double score, String rating, Type genre, int runningt) {
        this.name = name;
        this.score = score;
        this.rating = rating;
        this.genre = genre;
        this.runningt = runningt;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public String getRating() {
        return rating;
    }
    
    public Type getGenre() {
        return genre;
    }

    public int getRunningt() {
        return runningt;
    }

    @Override
    public int compareTo(Movie m) {
        return this.name.compareTo(m.getName());
    }

    @Override
    public String toString() {
        return String.format("%-40s %-10s %-10s %-10s %-10s\n", name, score, rating, genre, runningt);
    }
}
