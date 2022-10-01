package com.oop.tutorial1.movie;

public class Main {

    public static void main(String[] args) {
        Date dob = new Date(24, 10, 2000);

        Director director = new Director("David", "Fincher");
        director.setDob(dob);
        director.setNumDirectedMovie(14);

        Movie movie = new Movie("Fight Club", "Action", director);
        movie.setNumAwards(8);

        System.out.println(movie);
    }

}
