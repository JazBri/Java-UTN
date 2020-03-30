package com.company;

public class Venta {
    private String id;
    private String description;
    private int quantity;
    private float unit_price;

//Empty constructor
    public Venta(){}

//Constructor
    public Venta(String id, String description, int quantity, float unit_price) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unit_price = unit_price;
    }

//Setters
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUnit_price(float unit_price) {
        this.unit_price = unit_price;
    }

//Getters
    public String getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getUnit_price() {
        return unit_price;
    }

    public String getDescription() {
        return description;
    }

//Methods
    public float getTotal_price(){
        return (this.unit_price * this.quantity);
    }

    public String toString(){
        return  "ItemVenta [id = " + this.getId() + ", descipcion = " + this.getDescription() + ", cantidad = " + this.getQuantity() + ", pUnitario = " + this.getUnit_price() + ", pTotal = " + this.getTotal_price();
    }
}