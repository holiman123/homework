package num7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int count =0;
        for (int i = 0; i < numbers.length ; i++)
        {
            Random r = new Random();
            numbers[i] = r.nextInt(20) - 10;
            System.out.println(numbers[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > 0)
            count++;
        }
        int[] positive = new int[count];
        int[] negetive = new int[10 - count];
        for (int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] > 0)
                positive[i] = numbers[i];
            else
                negetive[i] = numbers[i];
        }
        for (int i = 0; i < positive.length; i++) {
            System.out.println(positive[i]);
        }
        for (int i = 0; i < negetive.length; i++) {
            System.out.println(negetive[i]);
        }
    }
}
