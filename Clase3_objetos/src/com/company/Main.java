package com.company;
import java.util.Scanner;
import java.util.Date;


/* ejercicio 1
*Modificar la clase Libro, para que acepte más de 1 Autor. Y realizar los
*cambios necesarios en el método del punto g, para imprimir un nuevo
*mensaje que liste los autores que contribuyeron a ese libro.
*/
/*ejercicio 2
*Analizar de agregar el tipo ItemVenta, que representa un producto que
*forma parte de la venta. El mismo contiene un id, un nombre, descripción y
*precio unitario. Considere las modificaciones necesarias en el tipo Factura
*para que el mismo pueda almacenar múltiples Ítems de venta y a su vez
*calcular los montos totales con y sin el descuento aplicado.
 */
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

        Libro book = new Libro("“Effective Java”", 450, 150, autor);
        System.out.println(book.toString());
        book.setPrice(500);
        book.setMoreStock(50);
        System.out.println(book.toString());
        System.out.println(book.getAutor());

    }
    static void exercise2() {
        Cliente client = new Cliente("Jazmin", "jazmin@mail", 1500);
        System.out.println(client.toString());
        Fecha date = new Fecha();
        Factura bill = new Factura(25000, date, client);
        bill.finalAmount(client.getDiscount());
        System.out.println(bill.toString());
    }

    static void exercise3() {
        Cliente3 client3 = new Cliente3("Jaz", 'f');
        Cuenta3 account = new Cuenta3(10000, client3);
        account.addAmount(0);
        account.lessAmount(12000);
        System.out.println(account.toString());

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

            default:
                System.out.println("Choose a correct exercise");
        }
    }
}
