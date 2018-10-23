package num6;

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
        int[] numbers = new int[10];
        int max = 0;
        int min = 20;
        int maxID = 0;
        int minID = 0;
        int cup = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = readInt();
        }
        for (int i = 0; i < numbers.length; i++)
        {
            if(numbers[i]>max)
            {
                max = numbers[i];
                maxID = i;
            }
        }
        for (int i = 0; i < numbers.length; i++)
        {
            if(numbers[i]<min)
            {
                min = numbers[i];
                minID = i;
            }
        }
        cup = numbers[maxID];
        numbers[maxID] = numbers[minID];
        numbers[minID] = cup;
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
    }
}
