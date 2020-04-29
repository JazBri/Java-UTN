package com.company.empleado;

public class Empleado {
    private String name;
    private String dni;
    private long phone;
    private float costPerDay;
    private String work;

    public Empleado(String name, String dni, long phone, float costPerDay, String work) {
        this.name = name;
        this.dni = dni;
        this.phone = phone;
        this.costPerDay = costPerDay;
        this.work = work;
    }

    public Empleado() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public float getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(float costPerDay) {
        this.costPerDay = costPerDay;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                ", phone=" + phone +
                ", costPerDay=" + costPerDay +
                ", work='" + work + '\'' +
                '}';
    }
}
