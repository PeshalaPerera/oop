package com.oop.tutorial2;

public class Director {
    private String name;
    private String surname;
    private int numDirectedMovie;
    private Date dob;

    public Director(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumDirectedMovie() {
        return numDirectedMovie;
    }

    public void setNumDirectedMovie(int numDirectedMovie) {
        this.numDirectedMovie = numDirectedMovie;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return String.format("Director [name = %s, surname = %s, numDirectedMovie = %d, dob = %s]", name, surname, numDirectedMovie, dob.getDate());
    }
}
