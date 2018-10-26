package num10;

import java.util.Random;
// не готово!
public class Main {
    public static void main(String[] args) {
        int[][] numbers = new int[10][10];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                Random r = new Random();
                numbers[i][j] = r.nextInt(10);
                System.out.print(" " + numbers[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 2; j < 10; j++) {
                numbers[i][j] = numbers[i][j - 2];
            }
        }



        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(" " + numbers[i][j]);
            }
            System.out.println();
        }
    }
}
