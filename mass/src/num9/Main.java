package num9;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] numbers = new int[10];
        int max = 0;
        int min = 20;
        boolean flagM = false;
        boolean flagm=false;

        for (int i = 0; i < numbers.length; i++)
        {
            Random r = new Random();
            numbers[i] = r.nextInt(20);
            System.out.println(numbers[i]);
        }


        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max)
                max = numbers[i];
        }
        for (int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] < min)
                min = numbers[i];
        }
        System.out.println("max = " + max + "\nmin = " + min);

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == max && flagM == true) {
                numbers[i] = 0;
            }
            if(numbers[i] == max)
                flagM = true;


            if(numbers[i] == min && flagm ==true) {
                numbers[i] = 0;
            }
            if(numbers[i] == min)
                flagm = true;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
        }
    }
}
