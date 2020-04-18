package com.company.Students;

public class Estudiente extends Persona {
    private int anioEgreso;
    private float cuota;
    private  String carrera;

    public Estudiente() {}

    public Estudiente(String dni, String nombre, String apellido, String email, String direccion, int anioEgreso, float cuota, String carrera) {
        super(dni, nombre, apellido, email, direccion);
        this.anioEgreso = anioEgreso;
        this.cuota = cuota;
        this.carrera = carrera;
    }

    public int getAnioEgreso() {
        return anioEgreso;
    }

    public void setAnioEgreso(int anioEgreso) {
        this.anioEgreso = anioEgreso;
    }

    public float getCuota() {
        return cuota;
    }

    public void setCuota(float cuota) {
        this.cuota = cuota;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiente{" +
                "anioEgreso=" + anioEgreso +
                ", cuota=" + cuota +
                ", carrera='" + carrera + '\'' + super.toString() +
                '}';
    }
}
