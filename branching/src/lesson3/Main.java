package lesson3;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    // -------------------------------------

    static String read()
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String b = sc.next();
        return b;
    }

    static int readInt()
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int b = sc.nextInt();
        return b;
    }

    static int convInt(String a)
    {
        int b = java.lang.Integer.parseInt(a);
        return b;
    }

    // -------------------------------------

    public static void main(String[] args)throws IOException {
                Scanner in = new Scanner(new File("src/lesson3/input.txt"));
                char b = in.next().charAt(0);
                switch (b) {
                    case 'd':
                        System.out.println("continue");
                        break;
                    case 'n':
                        System.exit(0);
                        break;
                    default:
                        System.out.println("nope");
                }
        }
    }
