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

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
        Scanner scann = new Scanner(System.in);
        String a = scann.nextLine();
        System.out.println(a);
*/


//Empleado
        Empleado arquitecto1 = new Arquitecto("Arq 1", "1", 1, 1 ,"1" , 1 );
        Empleado arquitecto2 = new Arquitecto("Arq 2", "2", 2, 2 ,"2" , 2 );
        Empleado arquitecto3 = new Arquitecto("Arq 3", "3", 3, 3 ,"3" , 3 );
        Empleado maestro1 = new Maestro("Mae 1", "1", 1, 1, "1", 1);
        Empleado maestro2 = new Maestro("Mae 2", "2", 2, 2, "2", 2);
        Empleado maestro3 = new Maestro("Mae 3", "3", 3, 3, "3", 3);
        Empleado obrero1 = new Obrero("Obr 1", "1", 1, 1, "1", 1);
        Empleado obrero2 = new Obrero("Obr 2", "2", 2, 2, "2", 2);
        Empleado obrero3 = new Obrero("Obr 3", "3", 3, 3, "3", 3);
//Empresa
    //Lista de Empelado en donde van a estar los empleados de toda la empresa
        ArrayList<Empleado> totalEmployeesOnSite = new ArrayList<>();
        totalEmployeesOnSite.add(arquitecto1);
        totalEmployeesOnSite.add(maestro1);
        totalEmployeesOnSite.add(obrero1);
    //Lista de obreros en la obra
        ArrayList<Obra> activeWorks = new ArrayList<>();

    //Lista ed Obras realizadas
        ArrayList<Obra> doneWorks = new ArrayList<>();
        Obra obra1 = new Obra();
        doneWorks.add(obra1);
        Empresa empresa1 = new Empresa("Empresa 1", totalEmployeesOnSite, doneWorks);

        System.out.println(empresa1.toString());

//Arquitecto
	   /* Empleado arquitecto1 = new Arquitecto("Jazmin", "1234456788", 1552364898, 2800 ,"Creando mi proximo plano" , 223 );
        Empleado arquitecto2 = new Arquitecto("Jazmin", "1234456788", 1552364898, 2800 ,"Creando mi proximo plano" , 223 );
//Maestro
	    Empleado maestro1 = new Maestro("Nicolas", "98745632", 155236478, 3000, "Soy maestro y superviso las construcciones", 29);
        Empleado maestro2 = new Maestro("Nicolas", "98745632", 155236478, 3000, "Soy maestro y superviso las construcciones", 29);
//Obrero
	    Empleado obrero1 = new Obrero("Matilda", "12549632", 155235647, 1200, "Soy obrro y construyo", 25);
        Empleado obrero2 = new Obrero("Matilda2", "125496322", 155235647, 1200, "Soy obrro y construyo", 25);
//Array Empleado que va a ir a
        ArrayList<Empleado> totalEmployeesOnSite = new ArrayList<>();
        totalEmployeesOnSite.add(empleado4);

        System.out.println(empleado1.getWork());
        System.out.println(empleado2.getWork());
        System.out.println(empleado3.getWork());

        ArrayList<Empleado> totalEmployees = new ArrayList<>();
        ArrayList<Obra> activeWorks = new ArrayList<>();

        Obra obra1 = new Obra("Lo De Jaz", 2, 54, 7, totalEmployeesOnSite );

        activeWorks.add(obra1);

        totalEmployees.add(empleado1);
        totalEmployees.add(empleado2);

        Empresa empresa = new Empresa("Lo de Jaz", totalEmployees, activeWorks);

        System.out.println(empresa.toString());
    */

    }
}
