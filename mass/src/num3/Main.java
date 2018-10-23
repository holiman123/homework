package num3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] numbers = new int[10];
        int sr = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            Random r = new Random();
            numbers[i] = r.nextInt(100);
            System.out.println(numbers[i]);
        }
        for (int i = 0; i < numbers.length; i++)
        {
            sr = sr+numbers[i];
        }
        System.out.println();
        System.out.println("средние  - " + sr/numbers.length);
        for (int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] > sr/numbers.length)
            {
                count++;
            }
        }
        System.out.println("больше среднего - " + count);
    }
}
