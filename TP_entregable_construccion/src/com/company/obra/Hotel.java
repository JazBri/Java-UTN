package com.company.obra;

import com.company.empleado.Empleado;
import com.company.obra.Comercial;

import java.util.ArrayList;

public class Hotel extends Comercial {
    private String numbersOfFloors;

    public Hotel(String address, float meters, float estimatedTime, float costPerMeter, ArrayList<Empleado> employeesOnSite, String nameWork, String business, String numbersOfFloors) {
        super(address, meters, estimatedTime, costPerMeter, employeesOnSite, nameWork, business);
        this.numbersOfFloors = numbersOfFloors;
    }

    public Hotel() {
    }

    public String getNumbersOfFloors() {
        return numbersOfFloors;
    }

    public void setNumbersOfFloors(String numbersOfFloors) {
        this.numbersOfFloors = numbersOfFloors;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "numbersOfFloors='" + numbersOfFloors + '\'' +
                '}';
    }
}

