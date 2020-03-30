package com.company;
import java.util.Date;

public class Fecha {
    private int day;
    private long hour;


    public Fecha(){
        Date date = new Date();
        this.day = date.getDay();
        this.hour = date.getHours();

    }

//Constructor
    public Fecha(int day, long hour) {
        this.day = day;
        this.hour = hour;
    }

//Setters y getters

    public long getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }


//Methods
    @Override
    public String toString() {
        return "Fecha{" +
                "day=" + day +
                ", hour=" + hour +
                '}';
    }
}

