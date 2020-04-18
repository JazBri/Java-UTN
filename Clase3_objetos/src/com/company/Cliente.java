package com.company;
import java.util.UUID;

public class Cliente {
    //private String id = generateID();
    private UUID id = UUID.randomUUID();
    private String name;
    private String email;
    private float discount;


//Empty constructor
    public Cliente() {
    }

//Constructor
    public Cliente(String name, String email, float discount) {
        this.name = name;
        this.email = email;
        this.discount = discount;
    }

//Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
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
        return "Cliente " +
                "id = '" + id + '\'' +
                ", name = '" + name + '\'' +
                ", email = '" + email + '\'' +
                ", discount = " + discount +
                '}';
    }
}
