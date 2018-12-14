package packege;

public class Main {

    public static void main(String[] args) {
        CarBMV Bexa = new CarBMV(50000,300, "10V",3,"rounded");

        Car car = new Car(40000,250,"Tavria", 5);

        CarBMV Bexa2 = new CarBMV(50000,300, "154V",3,"ro345unded");

        System.out.println(car.getModel());
        System.out.println(Bexa.getModel());
        System.out.println(Bexa2.getModel());
        TeslaCar T = new TeslaCar(60000, 250, "new Tesla", 3, 100);

        System.out.println(T.getModel());
        Bexa.buy();
        car.sell();
    }
}
