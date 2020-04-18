package com.company.Abstract;

public abstract class Figura {
    private String color;
    public Figura(){};
//    public Figura(){};

    public abstract float calculateArea();
    public abstract float calculatePerimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
