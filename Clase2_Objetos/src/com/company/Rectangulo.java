package com.company;

//Class
public class Rectangulo {
    private double height = 1.0;
    private double with = 1.0;

//Empty constructor
    public Rectangulo(){
    }

//Constructor
    public Rectangulo(double height, double with){
        this.height = height;
        this.with = with;
    }

//Setters
    public void setHeight(double height){
        this.height = height;
    }

    public void setWith(double with){
        this.with = with;
    }

//Getters
    public double getHeight(){
        return this.height;
    }

    public double getWith(){
        return this.with;
    }

//Methods
    public double calculateArea(){
        return (this.with * this.height);
    }

    public double calculatePerimeter(){
        return (this.with + this.height) * 2;
    }
}
