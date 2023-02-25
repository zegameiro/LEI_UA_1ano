package Aula12.Ex2;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Movie>{
    @Override
    public int compare(Movie m1, Movie m2) {
        if(m1.getScore() < m2.getScore()) {
            return 1;
        } else if(m1.getScore() > m2.getScore()) {
            return -1;
        } else {
            return 0;
        }
    }
}
