package com.oop.tutorial2;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Date dob = new Date(16, 8, 1954);
        System.out.println(dob);

        Director director = new Director("James", "Cameron");
        director.setDob(dob);
        director.setNumDirectedMovie(23);

        System.out.println(director);
        System.out.println("Name is: " + director.getName());
        System.out.println("Surname is: " + director.getSurname());
        System.out.println("Dob is: " + director.getDob().getDate());
        System.out.println("Number of directed movies is: " + director.getNumDirectedMovie());

        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Robert de niro"));
        actors.add(new Actor("James Franco"));
        System.out.println(actors);

        Movie movie = new Movie("Avatar", "Fantasy", director);
        movie.setNumAwards(50);
        movie.setActors(actors);

        System.out.println(movie);
        System.out.println("Title is: " + movie.getTitle());
        System.out.println("Category is: " + movie.getCategory());
        System.out.println("Name of	director is: " + movie.getDirector().getName());
        System.out.println("Surname	of director is:	" + movie.getDirector().getSurname());
        System.out.println("Number of awards is: " + movie.getNumAwards());
    }

}
