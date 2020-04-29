package com.company.obra;

import com.company.empleado.Empleado;

import java.util.ArrayList;

public class Comercial extends Obra {
    private String nameWork;
    private String business;

    public Comercial(String address, float meters, float estimatedTime, float costPerMeter, ArrayList<Empleado> employeesOnSite, String nameWork, String business) {
        super(address, meters, estimatedTime, costPerMeter, employeesOnSite);
        this.nameWork = nameWork;
        this.business = business;
    }

    public Comercial() {
    }

    public String getNameWork() {
        return nameWork;
    }

    public void setNameWork(String nameWork) {
        this.nameWork = nameWork;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    @Override
    public String toString() {
        return "Comercial{" +
                "nameWork='" + nameWork + '\'' +
                ", business='" + business + '\'' +
                '}';
    }
}
