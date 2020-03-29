package com.company;

public class Person {
    private String name;
    private String lastName;


    public void setName(String name){
        this.name = name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }


    public void introduce(){
        System.out.println("My name is " + this.name + " and my last name is " + this.lastName);
    }
}
