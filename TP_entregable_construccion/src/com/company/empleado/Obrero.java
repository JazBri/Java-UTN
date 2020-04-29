package com.company.empleado;

public class Obrero extends Empleado {
    private int age;

    public Obrero(String name, String dni, long phone, float costPerDay, String work, int age) {
        super(name, dni, phone, costPerDay, work);
        this.setCostPerDay(1800);
        this.age = age;
        this.setWork(" Soy Obrero y construyo ");
    }
    public Obrero(){}

    public int getRegistrationNumber() {
        return age;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.age = registrationNumber;
    }

    @Override
    public String getWork() {
        return super.getWork();
    }

    @Override
    public void setWork(String work) {
        super.setWork(work);
    }

    @Override
    public String toString() {
        return "Obrero{" + super.toString() +
                "age=" + age +
                '}';
    }
}
