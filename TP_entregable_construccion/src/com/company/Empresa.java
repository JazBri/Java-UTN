package com.company;
import com.company.empleado.Empleado;
import com.company.obra.Obra;
import java.util.ArrayList;

public class Empresa {
    private String name;
    private ArrayList<Empleado> totalEmployees;
    private ArrayList<Obra> activeWorks;

    public Empresa(String name, ArrayList<Empleado> totalEmployees, ArrayList<Obra> activeWorks) {
        this.name = name;
        this.totalEmployees = totalEmployees;
        this.activeWorks = activeWorks;
    }

    public Empresa() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Empleado> getTotalEmployees() {
        return totalEmployees;
    }

    public void setTotalEmployees(ArrayList<Empleado> totalEmployees) {
        this.totalEmployees = totalEmployees;
    }

    public ArrayList<Obra> getActiveWorks() {
        return activeWorks;
    }

    public void setActiveWorks(ArrayList<Obra> activeWorks) {
        this.activeWorks = activeWorks;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "name='" + name + '\'' +
                ", totalEmployees=" + totalEmployees +
                ", activeWorks=" + activeWorks +
                '}';
    }
}
