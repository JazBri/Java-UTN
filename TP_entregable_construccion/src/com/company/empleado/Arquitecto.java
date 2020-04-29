package com.company.empleado;

public class Arquitecto extends Empleado {
    private int registrationNumber;

    public Arquitecto(String name, String dni, long phone, float costPerDay, String work, int registrationNumber) {
        super(name, dni, phone, costPerDay, work);
        this.setCostPerDay(2000);
        this.setWork(" Creando mi proximo plano ");
        this.registrationNumber = registrationNumber;
    }

    public Arquitecto(){}

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Arquitecto{" + super.toString() +
                "registrationNumber=" + registrationNumber +
                '}';
    }
}
