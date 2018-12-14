package Test16;

import java.util.Scanner;

public class Main {
    // --------------------------------------

    static String read()
    {
        Scanner sc = new Scanner(System.in);
        String b = sc.next();
        return b;
    }

    static int readInt()
    {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        return b;
    }

    static int convInt(String a)
    {
        int b = java.lang.Integer.parseInt(a);
        return b;
    }

    // -------------------------------------
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Вычесление сопротивления эл. цепи.\n Введите исходные данные:\nВеличена первого сопротивления R1 (Ом) = ");
        float R1 = sc.nextFloat();
        System.out.print("Величена второго сопротивления R2 (Ом) = ");
        float R2 = sc.nextFloat();
        System.out.print("Тип соединения (1 - последованое, 2 - паралельное) = ");
        int TS = readInt();
        if(TS != 1 & TS != 2)
            System.out.println("Вы ввели не верный тип сопротивления");
        if(TS == 1)
        {
            System.out.println("Общее сопротивление цепи = " + (R1 + R2) + "Ом");
        }
        else
        {
            System.out.print("Общее сопротивление цепи = ");
            System.out.printf("%.2f", ((R1 * R2)/(R1 + R2)));
        }
    }
}
