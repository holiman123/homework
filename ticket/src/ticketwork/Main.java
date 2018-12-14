package ticketwork;

import java.io.*;
import java.util.Scanner;

public class Main {

    static int convInt(String a)
    {
        int b = java.lang.Integer.parseInt(a);
        return b;
    }

    public static void main(String[] args) throws IOException {
        PrintWriter pw;
        pw = new PrintWriter(new File("src/ticketwork/output.txt"));
        Scanner sc = new Scanner(new File("src/ticketwork/input.txt"));
        int nomber = sc.nextInt();
        String b = String.valueOf(nomber);
        String[] a = b.split("");
        if(convInt(a[0])+convInt(a[1])+convInt(a[2]) == convInt(a[3])+convInt(a[4])+convInt(a[5]))
        {
            pw.print("YES");
            System.out.println("YES");
        }
        else
        {
            pw.print("NO");
            System.out.println("NO");
        }
        pw.close();
    }
}
