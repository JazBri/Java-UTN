package com.company;

public class Animal {
    private String especie;

    public Animal(){}

    public Animal(String especie){
        this.especie = especie;
    }

    public String getEspecie(){
        return especie;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + this.especie + '\'' +
                '}';
    }
}
