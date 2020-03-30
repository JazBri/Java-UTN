package com.company;

public class Factura {
    private String id = generateID();
    private float totalAmount;
    private Fecha date;
    private Cliente client;

//Empty constructor
    public Factura() {
    }

//Constructor
    public Factura(float totalAmount, Fecha date, Cliente client){
        this.totalAmount = totalAmount;
        this.date = date;
        this.client = client;
    }

//Getters y Setters
    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public Fecha getDate() {
        return date;
    }

    public void setDate(Fecha date) {
        this.date = date;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
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

    public void finalAmount(float discount){
        setTotalAmount(totalAmount - discount);
    }

    @Override
    public String toString() {
        return "Factura " +
                "id='" + id + '\'' +
                "date " + date +
                ", totalAmount = " + totalAmount +
                ", discount = " + client.getDiscount() +
                ", client = " + client.getId() + client.getName() + client.getEmail() + client.getDiscount() +
                '}';
    }
}
