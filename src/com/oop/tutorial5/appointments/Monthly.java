package com.oop.tutorial5.appointments;

import java.util.Date;

public class Monthly extends Appointment {

    public Monthly(String description, Date date) {
        super(description, date);
    }

    @Override
    protected boolean occursOn(int year, int month, int day) {
        return super.occursOn(year, month, day);
    }
}
