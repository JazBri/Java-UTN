package com.company.Students;

import com.company.Students.Persona;

public class Staff extends Persona {
    private float salario;
    private String turno;

    public Staff(){}

    public Staff(String dni, String nombre, String apellido, String email, String direccion, float salario, String turno){
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "salario=" + salario +
                ", turno='" + turno + '\'' + super.toString() +
                '}';
    }
}
