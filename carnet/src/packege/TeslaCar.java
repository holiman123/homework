package packege;

public class TeslaCar extends Car {
    private  int capacity;

    public TeslaCar(int price, int speed, String model, int lenght, int capacity) {
        super(price, speed, model, lenght);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String getModel() {
        return "Tesla " + super.getModel();
    }
//---------------------------
    @Override
    public void sell() {
        System.out.println("Tesla sold");
    }

    @Override
    public void buy() {
        System.out.println("Tesla bought");
    }
}
