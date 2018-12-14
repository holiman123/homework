package packege;

public class nokiaTel extends tel {
    private int Width;

    public nokiaTel(int price, int chargeTime, int size, String model, int width) {
        super(price, chargeTime, size, model);
        Width = width;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }

    @Override
    public String getModel() {
        return "Nokia " + super.getModel();
    }

    @Override
    public void buy() {
        super.buy();
    }

    @Override
    public void sell() {
        super.sell();
    }
}
