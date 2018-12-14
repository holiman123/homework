package packege;

public class CarBMV extends Car {
    private String weel;

    public CarBMV(int price, int speed, String model, int lenght, String weel) {
        super(price, speed, model, lenght);
        this.weel = weel;
    }

    public String getWeel() {
        return weel;
    }

    public void setWeel(String weel) {
        this.weel = weel;
    }

    @Override
    public String toString() {
        return "CarBMV{" +
                "weel='" + weel + '\'' +
                '}';
    }

    @Override
    public String getModel() {
        return "BMV " + super.getModel();
    }
//-----------------------
    @Override
    public void sell() {
        System.out.println("BMW sold");
    }

    @Override
    public void buy() {
        System.out.println("BMW bought");
    }
}
