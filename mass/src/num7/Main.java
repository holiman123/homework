package num7;

import java.util.Random;

public class Main {

    // -------------------------------------

    static String read()
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String b = sc.next();
        return b;
    }

    static int readInt()
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int b = sc.nextInt();
        return b;
    }

    static int convInt(String a)
    {
        int b = java.lang.Integer.parseInt(a);
        return b;
    }

    // -------------------------------------

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int min = 100;
        int max = 0;
        int idM = 0;
        int idm = 0;
        System.out.println("апишите 10 чисел меньше 100");
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = readInt();
        }
        for (int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] < min)
            {
                min = numbers[i];
                idM = i;
            }
        }
        for (int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] > max)
            {
                max = numbers[i];
                idm = i;
            }
        }
        numbers[idM] = 0;
        numbers[idm] = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
        }
        System.out.println("\nmax = " + max + "\nmin = " + min);
    }
}
