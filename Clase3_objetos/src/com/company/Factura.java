package com.company;

import java.util.Arrays;
import java.util.UUID;
import java.time.LocalDateTime;
//TO FIX : DELETE THE FECHA CLASS AND USE import java.time.LocalDateTime;

public class Factura {
    //private String id = generateID();
    private UUID id = UUID.randomUUID();
    private float totalAmount;
//    private Fecha date;
    private LocalDateTime date;
    private Cliente client;
    private ItemVenta[] arrayItemVenta;

//Empty constructor
    public Factura() {
    }

//Constructor
    public Factura(float totalAmount, Cliente client, ItemVenta[] arrayItemVenta){
        this.totalAmount = totalAmount;
        this.date = LocalDateTime.now();
        this.client = client;
        this.arrayItemVenta = arrayItemVenta;
    }

//Getters y Setters
    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public UUID getId() {
        return id;
    }


    public ItemVenta[] getItems() {
        return arrayItemVenta;
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
                 ", Items = " + Arrays.toString(arrayItemVenta) + '}';
    }
}
