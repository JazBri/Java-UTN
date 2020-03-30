package com.company;

public class HomeBanking {
    private String id;
    private String name;
    private float balance;

    //Empty constructor
    public HomeBanking(){}

    //Constructor
    public HomeBanking(String id, String name, float balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

//Getters
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public float getBalance() {
        return this.balance;
    }

//Methods
    public float credit(float deposit){
        setBalance(this.balance + deposit );
        return this.balance;
    }

    public float debit(float deposit) {
        if (deposit <= this.balance) {
            setBalance(this.balance - deposit);
        } else {
            System.out.println("You don't have enough money un your account");
        }
        return this.balance;
    }

    public String toString(){
        return  "ItemVenta [id = " + this.getId() + ", name = " + this.getName() + ", balance = " + this.getBalance();
    }

}
