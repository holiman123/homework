package packege;

public class Car implements Shop{
    private int price;
    private int speed;
    private String model;
    private int lenght;

    public Car(int price, int speed, String model, int lenght) {
        this.price = price;
        this.speed = speed;
        this.model = model;
        this.lenght = lenght;
    }

    public Car() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", speed=" + speed +
                ", model='" + model + '\'' +
                ", lenght=" + lenght +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    public int getLenght() {
        return lenght;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }


    @Override
    public void sell() {
        System.out.println(getModel() + " sold");
    }

    @Override
    public void buy() {
        System.out.println(getModel() + " bought");
    }
}
