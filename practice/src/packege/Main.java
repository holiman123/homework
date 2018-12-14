package packege;

public class Main {

    public static void main(String[] args) {
        IphoneTel Iph = new IphoneTel(15000, 2, 13, "10X",16);
        nokiaTel nokia = new nokiaTel(500,999,9,"3310",3);

        System.out.println(Iph.getModel());
        System.out.println(nokia.getModel());
        Iph.buy();
        nokia.sell();
    }
}
