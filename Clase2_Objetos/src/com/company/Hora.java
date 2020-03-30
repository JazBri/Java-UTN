package com.company;

public class Hora {
    private int hour;
    private int minute;
    private int second;

//Empty constructor
    public Hora() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

//Setters
    public void setHour(int hour) {
     //   int flag = 0;
     //   do {
            if (hour >= 0 && hour < 24) {
     //           flag = 1;
                this.hour = hour;
            } else {
                System.out.println("Try again");
            }
     //   }while(flag == 0);
    }

    public void setMinute(int minute) {
     //   int flag = 0;
     //   do {
            if (minute >= 0 && minute < 60) {
     //           flag = 1;
                this.minute = minute;
            } else {
                System.out.println("Try again");
            }
     //   }while(flag == 0);
    }

    public void setSecond(int second) {
     //   int flag = 0;
     //   do {
            if (second >= 0 && second < 60) {
     //           flag = 1;
                this.second = second;
            } else {
                System.out.println("Try again");
            }
     //   }while(flag == 0);
    }

//Getters
    public int getHour() {
        return this.hour;
    }
    public int getMinute() {
        return this.minute;
    }
    public int getSecond() {
        return this.second;
    }

//Methods
    public int go_one_second(){
        return (this.getSecond() + 1);
    }

    public int return_one_second(){
        return (this.getSecond() - 1);
    }



    public String toString(){
        return  this.getHour() + ":" + this.getMinute() + ":" + this.getSecond();
    }

}
