package com.oop.tutorial5.appointments;

import java.util.Date;
import java.util.GregorianCalendar;

public class Appointment {
    private String description;
    private Date date;

    public Appointment(String description, Date date) {
        this.description = description;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    protected boolean occursOn(int year, int month, int day) {
        return true;
    }

    protected String dayOfTheWeek(Date date) {
        GregorianCalendar.getInstance();
        return "";
    }

    protected void displayAll() {
        System.out.println("Appointments");
    }
}
