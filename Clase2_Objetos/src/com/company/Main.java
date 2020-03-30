package com.company;
import java.util.Scanner;

public class Main {
    static void exercise1() {
        Rectangulo rectangle = new Rectangulo(20, 82.1);
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("With: " + rectangle.getWith());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        Rectangulo rectangle1 = new Rectangulo();
        System.out.println("With new rectangle: " + rectangle1.getWith());
        System.out.println("Height new rectangle: " + rectangle1.getHeight());
    }
    static void exercise2() {
        Empleado employed0 = new Empleado(23456345, "Carlos", "Gutierrez", 25000);
        System.out.println(employed0.toString());
        Empleado employed1 = new Empleado(34234123, "Ana", "Sanchez", 27500);
        System.out.println(employed1.toString());
        employed0.calculate_percentage_salary(15);
        System.out.println(employed0.calculate_annual_salary());
    }

    static void exercise3() {
        Venta sale = new Venta("#2-ac", "Great Item", 28, 200);
        System.out.println(sale.toString());
    }

    static void exercise4() {
        HomeBanking homeBanking = new HomeBanking("214a-a", "Jaz", 15000);
        homeBanking.credit(2500);
        homeBanking.debit(1500);
        homeBanking.debit(30000);
        System.out.println(homeBanking.toString());
    }

    static void exercise5() {
        Hora hour = new Hora();
        hour.setHour(22);
        hour.setMinute(48);
        hour.setSecond(4);
        System.out.println(hour.toString());
        System.out.println(hour.go_one_second());
        System.out.println(hour.return_one_second());
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What exercise do you want to do, 1 - 5 = ");
        int option = scanner.nextInt();
        System.out.println("Exercise " + option);

        switch ( option ) {
            case 1:
                exercise1();
                break;
            case 2:
                exercise2();
                break;
            case 3:
                exercise3();
                break;
            case 4:
                exercise4();
                break;
            case 5:
                exercise5();
                break;
            default:
                System.out.println("Choose a correct exercise");
        }
    }
    }

