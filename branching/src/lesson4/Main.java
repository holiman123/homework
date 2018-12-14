package lesson4;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("src/lesson4/input.txt"));
        double b = sc.nextInt();
        if(b < 500)
            System.out.println("вы слишком бедны! Вам скидок не будет.");
        if(b > 500 && b < 1000)
        {
            System.out.println(b - (b/100 * 3));
        }
        if(b > 1000 && b < 10000)
        {
            System.out.println(b - (b/100 * 5));
        }
        if(b > 10000)
        {
            System.out.println("извените сэр, но для вс нет СКИДОК!!!");
        }
    }
}
