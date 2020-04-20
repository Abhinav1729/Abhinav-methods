class interest2
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
        System.out.println("the interest is "+SI);
    }
    public static void main()
    {
        interest2 obj=new interest2();
        obj.input();
        obj.calc();
        obj.display();
    }
}