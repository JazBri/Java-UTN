package com.company.obra;
import com.company.empleado.Empleado;

import java.util.ArrayList;

public class Obra {
    private String Address;
    private float meters;
    private float estimatedTime;
    private float costPerMeter;
    private ArrayList <Empleado> employeesOnSite;

    public Obra(String address, float meters, float estimatedTime, float costPerMeter, ArrayList<Empleado> employeesOnSite) {
        Address = address;
        this.meters = meters;
        this.estimatedTime = estimatedTime;
        this.costPerMeter = costPerMeter;
        this.employeesOnSite = employeesOnSite;
    }

    public Obra(){}

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public float getMeters() {
        return meters;
    }

    public void setMeters(float meters) {
        this.meters = meters;
    }

    public float getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(float estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public float getCostPerMeter() {
        return costPerMeter;
    }

    public void setCostPerMeter(float costPerMeter) {
        this.costPerMeter = costPerMeter;
    }

    public ArrayList<Empleado> getEmployeesOnSite() {
        return employeesOnSite;
    }

    public void setEmployeesOnSite(ArrayList<Empleado> employeesOnSite) {
        this.employeesOnSite = employeesOnSite;
    }

    @Override
    public String toString() {
        return "Obra{" +
                "Address='" + Address + '\'' +
                ", meters=" + meters +
                ", estimatedTime=" + estimatedTime +
                ", costPerMeter=" + costPerMeter +
                ", employeesOnSite=" + employeesOnSite +
                '}';
    }
}
