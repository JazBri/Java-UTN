package com.company.empleado;

public class Maestro extends Empleado {
    private int age;

    public Maestro(String name, String dni, long phone, float costPerDay, String work, int age) {
        super(name, dni, phone, costPerDay, work);
        this.setCostPerDay(1800);
        this.setWork(" Soy Maestro y superviso las construcciones ");
        this.age = age;
    }
    public Maestro(){}

    public int getRegistrationNumber() {
        return age;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.age = registrationNumber;
    }

    @Override
    public String toString() {
        return "Maestro{" + super.toString() +
                "age=" + age +
                '}';
    }
}
