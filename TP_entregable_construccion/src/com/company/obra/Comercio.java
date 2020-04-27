package com.company.obra;

import com.company.empleado.Empleado;
import com.company.obra.Comercial;

import java.util.ArrayList;

public class Comercio extends Comercial {
    private String business;

    public Comercio(String address, float meters, float estimatedTime, float costPerMeter, ArrayList<Empleado> employeesOnSite, String nameWork, String business, String business1) {
        super(address, meters, estimatedTime, costPerMeter, employeesOnSite, nameWork, business);
        this.business = business1;
    }

    public Comercio() {
    }

    @Override
    public String getBusiness() {
        return business;
    }

    @Override
    public void setBusiness(String business) {
        this.business = business;
    }

    @Override
    public String toString() {
        return "Comercio{" +
                "business='" + business + '\'' +
                '}';
    }
}
