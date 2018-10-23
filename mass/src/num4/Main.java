package num4;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int [] numbers1 = new int[10];
        int [] numbers2 = new int[10];
        int [] summ = new int[10];
        for (int i = 0; i < numbers1.length; i++)
        {
            Random r = new Random();
            numbers1[i] = r.nextInt(100);
            numbers2[i] = r.nextInt(100);
            System.out.println(numbers1[i] + "   " + numbers2[i]);
        }
        System.out.println();
        for (int i = 0; i < numbers1.length; i++)
        {

            System.out.println("сумма " + (i+1) + " рядка = " + summ[i]);
        }


    }
}
