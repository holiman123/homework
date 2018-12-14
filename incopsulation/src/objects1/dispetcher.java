package objects1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

class Car
{
 String color;
 int date;
 int distance;
 int price;
 double speed;
 double size;
 Engine eng;
 Wheel[] w;
 void move()
 {
     System.out.println("car is moving!");
 }
}
class Engine
{
    String model;
    int price;
    int power;
}
class Wheel
{
    double radius;
    String model;
}
class acount
{
    String name;
    double UAH;
    static double ToUSD;
}
public class dispetcher {
    public static void main(String[] args) {
        Car carr = new Car();
        carr.color = "Серо-буро- малиновый";
        System.out.println(carr.color);
        carr.move();
        acount a1 = new acount();
        a1.name = "HELLO";
        a1.UAH = 10.0;
        acount.ToUSD = 0.1;
        System.out.println(a1.UAH / acount.ToUSD + " баксов");
    }
}
