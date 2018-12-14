package projects;

class View
{
    void display(int gal,double l)
    {
        System.out.println(gal + " галонов = " + l + " литров");
    }
}
class Model
{
    public double l;
    public int gal;
}
class Controller
{
    double convert(int g)
    {
        return (double) 3.78 * g;
    }
}
public class dispatcher {
    public static void main(String[] args) {
        Model m1 = new Model();
        Controller c1 = new Controller();
        View v1 = new View();
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        m1.gal = 5;
        m1.l = c1.convert(m1.gal);
        v1.display(m1.gal,m1.l);
    }
}
