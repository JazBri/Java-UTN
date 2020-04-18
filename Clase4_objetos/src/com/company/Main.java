package com.company;
import com.company.Abstract.Cuadrado;
import com.company.Abstract.Rectangulo;
import com.company.Forms.Cilindro;
//import com.company.Forms.Circulo;
import com.company.Students.Persona;
import com.company.Students.Estudiente;
import com.company.Students.Staff;
import com.company.Abstract.Figura;
import com.company.Abstract.Circulo;


public class Main {

    public static void main(String[] args) {

        /////// HEREDITY EXAMPLE ///////

/*    Animal a = new Animal("animal");
        System.out.println(a.toString());
        Perro perro = new Perro();
        Perro perro1 = new Perro("perro", "Matu");
        System.out.println(perro1.toString());
        perro1.setNombre("Agustin");
        perro1.setEspecie("Salvage");
        System.out.println(perro1.toString());
        Gato gato = new Gato("gato", "Yun");
        System.out.println(gato.toString());
        gato.setNombre("Yuni");
        gato.setEspecie("Salvagaaaaa");
        System.out.println(gato.toString());

*/
        /////// /////// ///////

   /*     Circulo circulo = new Circulo();
        Cilindro cilindro = new Cilindro();
        System.out.println(circulo.toString());
        cilindro.setColor("Green");

        System.out.println(cilindro.toString());
        System.out.println(circulo.calculateArea());
        System.out.println(cilindro.calculateArea());
*/

        Estudiente estudiente1 = new Estudiente("12345678", "Jazmin", "Briasco", "jazmin@gmail.com", "Caleta", 2016, 123, "Sistemas");
        Estudiente estudiente2 = new Estudiente("12345678", "Marta", "Perez", "jazmin@gmail.com", "Caleta", 2016, 456, "Sistemas");
        Estudiente estudiente3 = new Estudiente("12345678", "José", "Ramirez", "jazmin@gmail.com", "Caleta", 2016, 789, "Sistemas");
        Estudiente estudiente4 = new Estudiente("12345678", "Juan", "Gonzales", "jazmin@gmail.com", "Caleta", 2016, 123, "Sistemas");
        Staff staff1 = new Staff("98765432", "Matilda", "Briasco", "Matu@gmail.com", "Cxaleta", 321, "Mañana");
        Staff staff2 = new Staff("98765432", "Jacinta", "Jimenez", "Matu@gmail.com", "Caleta", 321, "Mañana");
        Staff staff3 = new Staff("98765432", "Rosario", "Villarino", "Matu@gmail.com", "Caleta", 321, "Mañana");
        Staff staff4 = new Staff("98765432", "Mario", "Perez", "Matu@gmail.com", "Caleta", 321, "Mañana");
        Persona arrayPersona [] = new Persona[8];
        arrayPersona[0] = estudiente1;
        arrayPersona[1] = estudiente2;
        arrayPersona[2] = estudiente3;
        arrayPersona[3] = estudiente4;
        arrayPersona[4] = staff1;
        arrayPersona[5] = staff2;
        arrayPersona[6] = staff3;
        arrayPersona[7]= staff4;
        float sum = 0;
        for (Persona i: arrayPersona
        ) {
            System.out.println(i.getNombre());
            if( i instanceof Estudiente){
                System.out.println("ESTUDIANTE");
                sum += ((Estudiente) i).getCuota();
            }else{
                System.out.println("STAFF");
            }
            System.out.println(sum);
        }
        System.out.println(estudiente1.toString());
        System.out.println(staff1.toString());

        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        System.out.println(circulo.getRadius());
        System.out.println(circulo.toString());
        System.out.println(circulo.calculateArea());
        System.out.println(circulo.calculatePerimeter());
        circulo.setColor("Yellow");
        System.out.println(circulo.getColor());
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setBase(10);
        cuadrado.setHeight(2);
        System.out.println(cuadrado.toString());

    }

}
