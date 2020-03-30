package com.company;

public class Cliente3 {
    private String id = generateID();
    private String name;
    private char gender;


//Empty constructor
    public Cliente3() {
    }

//Constructor
    public Cliente3(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

//Setters nd Getters
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //Methods
        public String generateID() {
            String idRand = " ";
            int caracter = (int)Math.floor(Math.random()*(122 -  97)+97);
            idRand = idRand + (char)caracter;
            int number = (int)Math.floor(Math.random()*(122 -  97)+97);
            idRand = idRand + number;
            return idRand;
        }

    @Override
    public String toString() {
        return "Cliente3{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
