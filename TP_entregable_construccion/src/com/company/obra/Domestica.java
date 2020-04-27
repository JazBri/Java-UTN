package com.company.obra;

import com.company.empleado.Empleado;

import java.util.ArrayList;

public class Domestica extends Obra {
    private int rooms;

    public Domestica(){}

    public Domestica(String address, float meters, float estimatedTime, float costPerMeter, ArrayList<Empleado> employeesOnSite, int rooms) {
        super(address, meters, estimatedTime, costPerMeter, employeesOnSite);
        this.rooms = rooms;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Domestica{" +
                "rooms=" + rooms +
                '}';
    }

}
