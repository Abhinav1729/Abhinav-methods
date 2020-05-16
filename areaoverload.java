public class areaoverload
{
    void area(int s)
    {
        System.out.println(s*s);
    }
    void area(int l,int b)
    {
        System.out.println(l*b);
    }
    void area(double r)
    {
        double pi=3.14;
        System.out.println(pi*r*r);
    }
}