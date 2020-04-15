package com.company;

public class Gato extends Animal{
    private String nombre;

    public Gato(){
        this.setEspecie("b");
        this.nombre = "a";
    }

    public Gato(String especie, String nombre){
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
        return "Gato{" +
                "nombre='" + nombre + '\'' + super.toString() +
                '}';
    }
}
