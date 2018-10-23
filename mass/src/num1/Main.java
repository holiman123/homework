package num1;

import java.lang.invoke.ConstantCallSite;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
         int [] numbers = new int[10];
         int max = 0;
         int min = 100;
        for (int i = 0; i < numbers.length; i++)
        {
            Random r = new Random();
            numbers[i] = r.nextInt(100);
            System.out.println(numbers[i]);
            if(numbers[i] > max)
                max = numbers[i];
        }
        for (int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] < min)
                min = numbers[i];
        }
        System.out.println("max = " + max + "\nmin = " + min);
    }
}
