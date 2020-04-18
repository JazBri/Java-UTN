package com.company.Abstract;

public class Circulo extends Figura{
    private float radius ;

    public Circulo() {
        this.radius = 1.0f;

    }

    public Circulo(float radius) {
        this.radius = radius;
    }

    @Override
    public float calculateArea() {
            return (this.radius * 2);
        }

    @Override
    public float calculatePerimeter() {
            return (float) (this.radius * 2 * (Math.PI));
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "Circulo{" +
                "radius=" + radius +
               // ", color='" + color + '\'' +
                '}';
    }
}

