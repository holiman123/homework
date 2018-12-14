package calculator;

import javax.jws.WebParam;
import java.util.Scanner;

class Model
{
    int x;
    int y;
    int sum_xy;
    int subs_xy;
    int mult_xy;
    double div_xy;
}
class View
{
    void write(String s)
    {
        System.out.println(s);
    }
}
class Controler
{
    static int add(int x, int y)
    {
        return x + y;
    }
    int subtuct ( int x, int y)
    {
        return x - y;
    }
    int multiply ( int x, int y)
    {
        return x * y;
    }
    double divide ( int x, int y)
    {
        return x / y;
    }
}
public class dispatcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Model m = new Model();
        View v = new View();
        Controler c = new Controler();
        System.out.println("напишите первое число");
        m.x = sc.nextInt();
        System.out.println("напишите второе число");
        m.y = sc.nextInt();
        m.sum_xy = c.add(m.x,m.y);
        m.subs_xy = c.subtuct(m.x,m.y);
        m.div_xy = c.divide(m.x,m.y);
        m.mult_xy = c.multiply(m.x,m.y);
        v.write("Summ = " + m.sum_xy + ";\n" + "Substruct = " + m.subs_xy + ";\n" + "Multiply = " + m.mult_xy + ";\n" + "Divide = " + m.div_xy + ";");
    }
}
