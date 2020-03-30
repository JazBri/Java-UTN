package com.company;

public class Autor {
    private String name;
    private String lastName;
    private String email;;
    private char gender;


//Empty constructor
    public Autor() {
    }

//Constructor
    public Autor(String name, String lastName, String email, char gender){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

//Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

//Getters
    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

//Methods
@Override
    public String toString() {
        return "Autor{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
