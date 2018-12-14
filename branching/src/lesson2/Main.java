package lesson2;

import java.util.Scanner;
import java.lang.Integer;

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
        int name = readInt();
        System.out.println(name);
    }
}
// read.
