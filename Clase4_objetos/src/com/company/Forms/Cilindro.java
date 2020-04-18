package com.company.Forms;

public class Cilindro extends Circulo{
     private double height;

     public  Cilindro(){
         this.height= 1.0f;
     }
        public Cilindro(float radius, String color, double height) {
            super(radius, color);
            this.height = height;
        }


    public double calculateVolume(){
        return this.height * (Math.PI) * Math.pow(this.getRadius(), 2);

    }

    @Override
    public double calculateArea() {
        return (2 * Math.PI * this.getRadius() * this.height) ;
    }

    @Override
    public String toString() {
        return "Cilindro{" + super.toString() +
                "height=" + height +
                '}';
    }
}

