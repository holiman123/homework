package packege;

public class tel implements buy_Sell {
    private int price;
    private int chargeTime;
    private int Size;
    private String model;

    public tel(int price, int chargeTime, int size, String model) {
        this.price = price;
        this.chargeTime = chargeTime;
        Size = size;
        this.model = model;
    }

    public tel() {

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getChargeTime() {
        return chargeTime;
    }

    public void setChargeTime(int chargeTime) {
        this.chargeTime = chargeTime;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void buy() {
        System.out.println(getModel() + "bought");
    }

    @Override
    public void sell() {
        System.out.println(getModel() + "sold");
    }
}
