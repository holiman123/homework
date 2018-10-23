package num2;

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
        int [] numbers = new int[10];
        int found = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            Random r = new Random();
            numbers[i] = r.nextInt(20);
            System.out.println(numbers[i]);
        }
        System.out.println("какое число вы хотите найти?");
        found = readInt();
        for (int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] == found)
                count++;
        }
        if(count > 0)
            System.out.println("Есть такое. их всего " + count);
        else
            System.out.println("К сожилению такого нет.");
    }
}
