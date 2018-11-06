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
        //===============================================
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 9; j > 1; j--) {
                numbers[i][j] = numbers[i][j - 2];
            }
        }
        for (int i = 0; i <10 ; i++) {
            numbers[i][0] = 0;
            numbers[i][1] = 0;
        }
        //==============================================
        for (int i = 0; i < 8; i++) {
            for (int j = 9; j > 1; j--) {
                numbers[i][j] = numbers[i+2][j];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[8][i] = 0;
            numbers[9][i] = 0;
        }
        //==============================================
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(" " + numbers[i][j]);
            }
            System.out.println();
        }
    }
}
