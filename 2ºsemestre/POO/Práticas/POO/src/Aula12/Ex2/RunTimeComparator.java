package Aula12.Ex2;

import java.util.Comparator;

public class RunTimeComparator implements Comparator<Movie>{
    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.getRunningt() - m2.getRunningt(); 
    }
}
