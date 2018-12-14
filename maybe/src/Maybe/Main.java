package Maybe;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sr = new Scanner(new File("input.txt"));
        PrintWriter sr_out = new PrintWriter(new File("output.txt"));
        int a = sr.nextInt();
        int b = sr.nextInt();
        int nok = 0;
        for (int i = (a * b); i > 0; i = i - a) {
            if(i % a == 0 && i % b ==0)
            {
                nok = i;
            }
        }
        //System.out.println(nok);
        sr_out.print(nok);
        sr_out.close();
    }
}
