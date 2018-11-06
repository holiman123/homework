package num11;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] sr = new int[10];
        for (int i = 0; i < 10; i++) {
            sr[i] =0;
        }
        int[][] numbers = new int[10][10];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                Random r = new Random();
                numbers[i][j] = r.nextInt(10);
                System.out.print(" " + numbers[i][j]);
            }
            System.out.println();
        }
        //==================================================
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                sr[i] = sr[i] + numbers[i][j];
            }
            sr[i] = sr[i]/10;
            System.out.println(sr[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                numbers[i][j] = numbers[i][j] - sr[i];
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
