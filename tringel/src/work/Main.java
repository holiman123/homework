package work;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();//////////////////////////////////////// 1
        for(int i = 0; i < 10; i++) {
            for(int p = 0; p<i; p++)
                System.out.print(" ");
            for (int j = 0; j < 10 - i; j++)
            {
                System.out.print("*");
            }
            for(int p = 0; p < i; p++)
                System.out.print(" ");
            System.out.println();
        }
        System.out.println();///////////////////////////////////// 2
        for(int i = 0; i < 10; i++) {
            for(int p = 10; p > i; p--)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(); //////////////////////////////// 3
        for(int i = 0; i < 10; i++) {
            for(int p = 0; p<i; p++)
                System.out.print(" ");
            for (int j = 0; j < 10 - i; j++)
            {
                System.out.print("*");
            }
            for(int p = 0; p < i; p++)
                System.out.print(" ");
            System.out.println();
        }
        System.out.println(); //////////////////////////////// 4
        for(int i = 0; i < 10; i++) {
            for(int p = 10; p > i; p--)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < 10; i++) {
            for(int p = 0; p<i; p++)
                System.out.print(" ");
            for (int j = 0; j < 10 - i; j++)
            {
                System.out.print("*");
            }
            for(int p = 0; p < i; p++)
                System.out.print(" ");
            System.out.println();
        }
        System.out.println(); /////////////////////////////5
        for(int i = 0; i < 10; i++)
        {
            for(int p = 0; p < 10 - i; p++)
                System.out.print(" ");
            for (int j = 0; j < i * 2; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("          *");
        for(int i = 0; i < 10; i++)
        {
            for(int p = 0; p < 10 - i; p++)
                System.out.print(" ");
            for (int j = 0; j < i * 2; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(); ////////////////////////////////// 6
        for(int i = 0; i < 10; i++)
        {
            System.out.print("                     ");
            for(int p = 0; p < 10 - i; p++)
                System.out.print(" ");
            for (int j = 0; j < i * 2; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 3; i < 10; i++)
        {
            System.out.print("           ");
            for(int p = 0; p < 10 - i; p++)
                System.out.print("  ");
            for (int j = 0; j < i * 2; j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i = 3; i < 10; i++)
        {
            for(int p = 0; p < 10 - i; p++)
                System.out.print("   ");
            for (int j = 0; j < i * 2; j++)
            {
                System.out.print("  *");
            }
            System.out.println();
        }
    }
}
