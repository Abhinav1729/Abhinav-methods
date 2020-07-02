class testasin
{
    double val;
    double rel;
    void init(double inputval)
    {
        val=inputval;
    }
    void calc()
    {
        double ang=Math.asin(val);
        rel=ang;
    }
    void out()
    {
        System.out.println(rel);
    }
    static void main()
    {
        testasin obj=new testasin();
        obj.init(0.5);
        obj.calc();
        obj.out();
    }
}