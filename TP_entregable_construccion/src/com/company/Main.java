package com.company;
import com.company.obra.Obra;
import com.company.obra.Domestica;
import com.company.obra.Comercial;
import com.company.obra.Hotel;
import com.company.obra.Comercio;
import com.company.empleado.Empleado;
import com.company.empleado.Arquitecto;
import com.company.empleado.Obrero;
import com.company.empleado.Maestro;

public class Main {

    public static void main(String[] args) {
	    Empleado empleado1 = new Arquitecto("Jazmin", "1234456788", 1552364898, 2800 ,"Creando mi proximo plano" , 223 );
        Empleado empleado2 = new Maestro("Nicolas", "98745632", 155236478, 3000, "Soy maestro y superviso las construcciones", 29);
        Empleado empleado3 = new Obrero("Matilda", "12549632", 155235647, 1200, "Soy obrro y construyo", 25);
        System.out.println(empleado1.getWork());
        System.out.println(empleado2.getWork());
        System.out.println(empleado3.getWork());

        Empresa empresa = new Empresa();

    }
}
