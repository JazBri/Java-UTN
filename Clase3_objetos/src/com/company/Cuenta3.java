package com.company;

public class Cuenta3 {

////////// CAMPUS RESOLVE //////////

    private static final int MAX_OPS = 10;
    private String operaciones[] = new String[MAX_OPS];
    private int contadorOperaciones = 0;
//////////   //////////   //////////

    private String id = generateID();
    private float balance;
    private Cliente3 client;
    private int count = 0;


//Empty constructor
    public Cuenta3() {
    }

//Constructor
    public Cuenta3(float balance, Cliente3 client) {
        this.balance = balance;
        this.client = client;
    }

//Setters nd Getters


////////// CAMPUS RESOLVE //////////
private void documentarDeposito(double monto) {
    if (this.contadorOperaciones == MAX_OPS) {
        this.contadorOperaciones = 0;
    }
    operaciones[contadorOperaciones] = "El cliente " + client.getName() + ", depositó " + monto;
    this.contadorOperaciones++;
}

    private void documentarRetiro(double monto) {
        if (this.contadorOperaciones == 10) {
            this.contadorOperaciones = 0;
        }
        operaciones[contadorOperaciones] = "El cliente" + client.getName() + ", retiró " + monto;
        this.contadorOperaciones++;
    }


    public String[] getOperaciones() {
    return operaciones;
}
    //////////   //////////   //////////
    public Cliente3 getClient() {
        return client;
    }

    public void setClient(Cliente3 client) {
        this.client = client;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
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

    public void addAmount(float add){
        count++;
        System.out.println(count);
        setBalance(this.balance + add);
    }

    public void lessAmount(float less) {
        count ++;
        if (this.balance - less >= -2000) {
            setBalance(this.balance - less);
        } else {
            System.out.println("You don't have enough money");
        }
    }
    @Override
    public String toString() {
        return "Cuenta3{" +
                "id='" + id + '\'' +
                ", balance=" + balance +
                ", client=" + client +
                '}';
    }
}

