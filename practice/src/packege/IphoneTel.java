package packege;

public class IphoneTel extends tel {
    private int countOfApps;

    public IphoneTel(int price, int chargeTime, int size, String model, int countOfApps) {
        super(price, chargeTime, size, model);
        this.countOfApps = countOfApps;
    }

    public int getCountOfApps() {
        return countOfApps;
    }

    public void setCountOfApps(int countOfApps) {
        this.countOfApps = countOfApps;
    }

    @Override
    public String getModel() {
        return "Iphone " + super.getModel();
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
