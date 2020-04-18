package com.company.Abstract;

public class Rectangulo extends Figura{
    private float height;
    private float base;

    public Rectangulo(){};
    public Rectangulo(float height, float base){
        this.height = height;
        this.base = base;
    };

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    @Override
    public float calculateArea() {
        return (this.height * this.base);
    }

    @Override
    public float calculatePerimeter() {
        return ((this.base + this.height) * 2);
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "height=" + height +
                ", base=" + base +
                '}';
    }
}
