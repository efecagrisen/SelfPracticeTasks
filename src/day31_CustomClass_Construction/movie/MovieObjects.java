package day31_CustomClass_Construction.movie;

import java.util.Arrays;

public class MovieObjects {
    public static void main(String[] args) {


        Movie movie1 = new Movie("Turkey", "Rafadan Tayfa", "01.01.2023", "Abdullah Ademoglu","Animation");

        movie1.addCast("Vahit Abdullah");

        String[] castList = {"ali","veli","ayşe","fatma"};

        movie1.addCasts(castList);

        System.out.println("Movie Details:");
        System.out.println("Country: " + movie1.country);
        System.out.println("Title: " + movie1.title);
        System.out.println("Release Date: " + movie1.releaseDate);
        System.out.println("Director: " + movie1.director);
        System.out.println("Cast Members: " + movie1.casts);

        System.out.println("Total number of cast members: " + movie1.casts.size());

    }
}
