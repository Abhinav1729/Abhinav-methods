class interest1
{
    double P,R,T,SI;
    void init(double P1,double R1,double T1)
    {
        P=P1;
        R=R1;
        T=T1;
    }
    void calc()
    {
        SI=(P*R*T)/100;
    }
    void display()
    {
        System.out.println("Interest is "+SI);
    }
}