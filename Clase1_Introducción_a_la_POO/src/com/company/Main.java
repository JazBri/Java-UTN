package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    static void exercise1(){
        int n = 1;
        double a = 11;
        char c = 'c';
        System.out.println("int N" + ' ' + n + "\n double A " + a + "\n char C " + c);
        System.out.println("A - N = " + (a - n));
        System.out.println("C " + (int)c);
    }

    static void exercise2(){
        int x = 1;
        int y = 2;
        double n = 5000;
        double m = 6000;

        int sum = x + y;
        double substraction = m - n;
        float div = (float) (substraction / sum);
        System.out.println("\n" + sum);
        System.out.println("\n" + substraction);
        System.out.println("\n" + div);
    }

    static void exercise3(){
        int n = 23;
        int res = (n + 77 - 97) * 2;
        System.out.println("\n" + res);
    }

    static void exercise4(){
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        b = c;
        c = a;
        a = d;
        d = b;
    }

    static void isEven(int num){
        // int flag = 0;
        if( num % 2 == 0){
            System.out.println("It's even");
            //flag = 1;
        }else{
            System.out.println("Not even");
        }
    }

    static void exercise5(){
        int a = 20;
        isEven(a);
    }

    static void isPositive (int num) {
        if( num < 0){
            System.out.println("Not positive");
        }else{
            System.out.println("Positive");
        }
    }

    static void exercise6(){
        int b = 2;
      isPositive(b);
    }

    static void isMultiple(int num){
        if((num / 5) == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    static void isHigLow(int num){
        if(num > 101 ){
            System.out.println("Higher");
        }else{
            System.out.println("Lower");
        }
    }

    static void exercise7(){
        int c = 5;
        isPositive(c);
        isEven(c);
        isMultiple(c);
        isHigLow(c);
    }

    static void exercise8(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Buenos días, " + name);
    }

    static void exercise9(){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int double_num = (num * 2);
        int triple_num = (num * 3);
        System.out.println(double_num);
        System.out.println(triple_num);
    }

    static void exercise10(){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        float celcius = (num - 32) * 5/9;
        System.out.println(celcius);
    }

    static void exercise11(){
        Scanner scan = new Scanner(System.in);
        int radio = scan.nextInt();
        float length = (float) (2 * Math.PI * radio);
        float area = (float) (Math.PI * (Math.pow(radio, 2)));
    }

    static void exercise12() {
        Scanner scan = new Scanner(System.in);
        int km = scan.nextInt();
        float mts = km * 1000;
        System.out.println("mts: " + mts);
    }

    static void exercise13(){
        Scanner scan = new Scanner(System.in);
        System.out.println("A: ");
        int a = scan.nextInt();
        System.out.println("B: ");
        int b = scan.nextInt();
        float hr = (float) (Math.pow(a, 2) + Math.pow(b, 2));
        float h =  (float) Math.sqrt(hr);
        System.out.println(h);
    }

    static void exercise14(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Radio: ");
        int radio = scan.nextInt();
        float vol = (float) ((4/3) * Math.PI * (Math.pow(radio, 3)));
        System.out.println("Volume " + vol);
    }

    static void exercise15(){
        Scanner scan = new Scanner(System.in);
        System.out.println("A: ");
        int a = scan.nextInt();
        System.out.println("B: ");
        int b = scan.nextInt();
        float area = (a * b) / 2;
        System.out.println("Area: " + area);
    }

    static void exercise16(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Number 3: ");
        int num = scan.nextInt();
        System.out.println("First: " + num / 100);
        System.out.println("Second: " + num / 10 % 10);
        System.out.println("Third: " + num % 10);
    }

    static void exercise17(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Number 5 : ");
        int num = scan.nextInt();
        int first = (num / 10);
        int second = (first / 10);
        int third = (second / 10);
        int fourth = (third / 10);
        isEven(first);
        isEven(second);
        isEven(third);
        isEven(fourth);
    }

   static void exercise18(){
       Scanner scan = new Scanner(System.in);
        int flag = 0;
        do{
            System.out.println("Insert you time: ");
            System.out.println("H");
            int h = scan.nextInt();
            System.out.println("M");
            int m = scan.nextInt();
            System.out.println("S");
            int s = scan.nextInt();

            if((h >= 0 ) && ( h <= 24 ) && ((m > 0  ) && ( m <= 60 )) && ((s > 0  ) && ( s <= 60 ))) {
               flag = 1;
               System.out.println(h + "° " + m + "' " + s + "'' ");
           }else {
               System.out.println("Time incorrect, try again");
            }
       }while(flag == 0);
   }

//Main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What exercise do you want to do, 1 - 18 = ");
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
            case 6:
                exercise6();
                break;
            case 7:
                exercise7();
                break;
            case 8:
                exercise8();
                break;
            case 9:
                exercise9();
                break;
            case 10:
                exercise10();
                break;
            case 11:
                exercise11();
                break;
            case 12:
                exercise12();
                break;
            case 13:
                exercise13();
                break;
            case 14:
                exercise14();
                break;
            case 15:
                exercise15();
                break;
                case 16:
                exercise16();
                break;
            case 17:
                exercise17();
                break;
                case 18:
                exercise18();
                break;
            default:
                System.out.println("Choose a correct exercise");
                 }
            }
     }
