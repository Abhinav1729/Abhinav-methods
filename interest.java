class interest
{
    double P,R,T,SI;
    void input()
    {
        P=2000;
        R=2.5;
        T=5;
    }
    void calc()
    {
        SI=(P*R*T)/100;
    }
    void display()
    {
        System.out.println("the interest is"+SI);
    }
}