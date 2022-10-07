package com.oop.tutorial2;

import java.util.List;

public class Movie {
    private String title;
    private String category;
    private Director director;
    private int numAwards;
    private List<Actor> actors;

    public Movie(String title, String category, Director director) {
        this.title = title;
        this.category = category;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public int getNumAwards() {
        return numAwards;
    }

    public void setNumAwards(int numAwards) {
        this.numAwards = numAwards;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return String.format("Movie [title = %s, category = %s, director = %s, numAwards = %d]", title, category, director, numAwards);
    }
}
