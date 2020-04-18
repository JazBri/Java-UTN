package com.company.Forms;

public class Circulo {
    private double radius ;
    private String color ;

    public Circulo() {
        this.radius = 1.0f;
        this.color = "red";
    }

    public Circulo(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calculateArea(){
        return (this.radius * 2);
    }
    public double calculatePerimeter(){
        return this.radius * 2 * (Math.PI);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
