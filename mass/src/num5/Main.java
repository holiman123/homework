package num5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] first = new int[10];
        int[] second = new int[15];
        int[] konk = new int[(first.length + second.length)];
        for (int i = 0; i < first.length ; i++)
        {
            Random r = new Random();
            first[i] = r.nextInt(100);
        }
        for (int i = 0; i < second.length ; i++)
        {
            Random r = new Random();
            second[i] = r.nextInt(100);
        }
        int j = 0;
        int p = 0;
        for(j= 0; j < first.length; j++)
        {
            konk[j] = first[j];
        }
        for (j = 10; j < konk.length; j++)
        {
            konk[j] = second[p];
            p++;
        }
        for (int i = 0; i < konk.length; i++)
        {
            System.out.println((i+1) + " " + konk[i]);
        }
    }
}
