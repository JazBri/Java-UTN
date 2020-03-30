package com.company;

//Class
public class Empleado {
    private int dni;
    private String name;
    private String lastName;
    private float salary;

//Empty constructor
    public Empleado(){
    }

//Constructor
    public Empleado(int dni, String name, String lastName, float salary){
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

//Setters
    public void setSalary(float salary){
        this.salary = salary;
    }

//Getters
    public int getDni(){
        return  this.dni;
    }

    public String getName(){
        return this.name;
    }

    public String getLastName(){
        return this.lastName;
    }

    public float getSalary(){
        return this.salary;
    }

//Methods
    public float calculate_annual_salary(){
        return (this.salary * 12);
    }

    public float calculate_percentage_salary(float percentage){
        float newSalary = this.salary +(this.salary * percentage/100);
        this.setSalary(newSalary);
        return newSalary;
    }

    public String toString(){
        return  "Empleado [dni = " + this.getDni() + ", nombre = " + this.getName() + ", apellido = " + this.getLastName() + ", salario = " + this.getSalary();
    }
}
