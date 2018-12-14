package fractionCalc;

public class main {
    public static void main(String[] args) {
        drop d1 = new drop(10,3);
        drop d2 = new drop(10,3);
        view.showRes(calculatorrr.add(d1,d2));
        view.showRes(calculatorrr.subtract(d1,d2));
        view.showRes(calculatorrr.multiply(d1,d2));
        view.showRes(calculatorrr.divide(d1,d2));
    }
}
