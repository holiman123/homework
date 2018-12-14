package vectorCalc;

public class controler {
    public static vector add(vector v1,vector v2)
    {
        return new vector((v1.X + v2.X),(v1.Y + v2.Y));
    }
    public static vector subtruct(vector v1,vector v2)
    {
        return new vector((v1.X - v2.X),(v1.Y - v2.Y));
    }
    public static vector multiplyStandart(vector v1,vector v2)
    {
        return new vector((v1.X * v2.X),(v1.Y * v2.Y));
    }
    public static int multiplayskalyr(vector v1,vector v2,int alfa)
    {
        return (v1.X * v2.X + v1.Y * v2.Y);
    }
}
