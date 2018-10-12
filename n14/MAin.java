package n14;

public class MAin {

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
    static double readdouble()
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double b = sc.nextDouble();
        return b;
    }

    // -------------------------------------

    public static void main(String[] args) {
        int lenght = readInt();
        double[] num = new double[lenght];
        for(int i = 0; i < lenght; i++)
        {
            num[i] = readdouble();
        }
        double end = 0;
        for(int i = 0; i < lenght; i ++)
        {
            end = num[i] + end;
        }
        System.out.println(end/lenght);
    }
}
