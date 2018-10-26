package num8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int count = 0;
        int Pcount = 0;
        int Ncount = 0;
        for (int i = 0; i < numbers.length ; i++)
        {
            Random r = new Random();
            numbers[i] = r.nextInt(20) - 10;
            System.out.println(numbers[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] >= 0)
                count = count + 1;
        }
        int[] pos = new int[count];
        int[] neg = new int[10 - count];



        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] >= 0) {
                pos[Pcount] = numbers[i];
                Pcount = Pcount + 1;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 0) {
                neg[Ncount] = numbers[i];
                Ncount = Ncount + 1;
            }
        }



        System.out.println();



        for (int i = 0; i < pos.length; i++) {
            System.out.print(" " + pos[i]);
        }
        System.out.println();
        for (int i = 0; i < neg.length; i++) {
            System.out.print(" " + neg[i]);
        }
    }
}
