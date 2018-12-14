package Static;

class Car
{
    static int count = 0;
    String model;
    int price;
}

public class Dispetcher {
    public static void main(String[] args) {
        Car c = new Car();
        c.model = "BMV";
        c.price = 5000;
        c.count  = 5;
        System.out.println(Car.count);
    }
}
