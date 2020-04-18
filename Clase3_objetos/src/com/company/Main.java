package com.company;
import java.util.Scanner;
import java.util.Date;

//TO FIX: SEPARATE INTO PACKAGES

/*ejercicio3
*Analice cómo implementaría con las herramientas conocidas hasta el
*momento, llevar un registro de como máximo 10 operaciones de depósito y
*extracción que se realizaron en la cuenta. En donde se almacene en
*memoria de alguna forma la siguiente cadena de texto:
*i. Depósito: "El {NombreCliente}, depositó {MontoDepositado}"
*ii. Extracción: "El {NombreCliente}, retiró {MontoRetirado}"
* */


public class Main {
    static void exercise1() {
        Autor autor = new Autor( "Joshua", "Bloch", "joshua@email.com", 'm');
        Autor autor1 = new Autor( "Jazmin", "Briasco", "jazmin@email.com", 'f');
        Autor autor2 = new Autor( "Florencia", "Gonzalez", "flor@email.com", 'f');
        Autor arrayAutor[] = new Autor[3];
        arrayAutor[0] = autor;
        arrayAutor[1] = autor1;
        arrayAutor[2] = autor2;
        for (Autor i : arrayAutor){
            System.out.println(i);
        }

        Libro book = new Libro("“Effective Java”", 450, 150, arrayAutor);

        System.out.println(book.toString());
        book.setPrice(500);
        book.setMoreStock(50);
        System.out.println(book.toString());
    }

    static void exercise2() {
        Cliente client = new Cliente("Jazmin", "jazmin@mail", 1500);
        System.out.println(client.toString());
        //Fecha date = new Fecha();

        ItemVenta item = new ItemVenta("Mouse", "To a comfortable work", 650);
        ItemVenta item1 = new ItemVenta("Switch", "To enjoy the moment", 30000);
        ItemVenta item2 = new ItemVenta("Monitor", "LMFAO", 2000);

        ItemVenta[] arrayItemVenta = new ItemVenta[3];
        arrayItemVenta[0] = item;
        arrayItemVenta[1] = item1;
        arrayItemVenta[1] = item2;

        Factura bill = new Factura(25000, client, arrayItemVenta);
        bill.finalAmount(client.getDiscount());
        System.out.println(bill.toString());
    }

    static void exercise3() {
        Cliente3 client3 = new Cliente3("Jaz", 'f');
        Cuenta3 account = new Cuenta3(10000, client3);
        account.addAmount(0);
        account.lessAmount(12000);

        System.out.println(account.toString());

        System.out.println("\nOperaciones realizadas:");
        for (String ops : account.getOperaciones()) {
            if (ops != null) System.out.println(ops);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What exercise do you want to do, 1 - 3 = ");
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

            default:
                System.out.println("Choose a correct exercise");
        }
    }
}
