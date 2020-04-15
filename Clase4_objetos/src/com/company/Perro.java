package com.company;

public class Perro extends Animal{
    private String nombre;

    public Perro(){
        this.setEspecie("b");
        this.nombre = "a";
    }

    public Perro(String especie, String nombre){
        super(especie);
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' + super.toString() +
                '}';
    }
}
