package prac;

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
        String num = read();
        boolean flag = false;
        char[] first = new char[num.length()];
        for(int i = 0 ; i < num.length(); i++)
        {
            if(num.charAt(i)%2 == 0)
            flag = true;
        }
        System.out.println(flag);
    }
}
