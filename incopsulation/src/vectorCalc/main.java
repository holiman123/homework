package vectorCalc;

public class main {
    public static void main(String[] args) {
        int cos = 45;
        vector v1 = new vector(5,7);
        vector v2 = new vector(8,2);
        view.show(controler.add(v1,v2));
        view.show(controler.subtruct(v1,v2));
        view.show(controler.multiplyStandart(v1,v2));
        view.show(controler.multiplayskalyr(v1,v2,cos));
    }
}
