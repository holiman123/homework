package n17;

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

    public static void main(String[] args) {
        System.out.println("write nomber");
        int num = readInt();
        for(int i = 0; i < 9; i ++)
        {
            System.out.println(num + " * " + i + " = " + i*num);
        }
    }
}
