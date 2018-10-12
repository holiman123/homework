package n27;

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
        int[] num = new int[10];
        int max = 0;
        int min = 0;
        int max1 = 0;
        int min1 = 0;
        for(int i = 0; i < num.length; i++)
        {
            num[i] = readInt();
        }
        min = Math.min(num[9],num[8]);
        for (int i = 1; i < num.length; i++)
        {
            max = Math.max(num[i - 1],max);
            min = Math.min(num[i - 1],min);
        }
        for(int i = 1; i < num.length; i++)
        {

            if(num[i - 1] == min) {
                System.out.println(i - 1 + " min");
                min1 = num[i - 1];
            }
            if(num[i - 1] == max) {
                System.out.println(i + " max");
                max1 = num[i];
            }
        }
        System.out.println(max1 - min1);
    }
}
