class average1
{
    double maths,science,computer,average;
    void input(double maths1,double science1,double computer1)
    {
        maths=maths1;
        science=science1;
        computer=computer1;
    }
    void calc()
    {
        average=(maths+science+computer)/3;
    }
    void display()
    {
        System.out.println("the average is"+average);
    }
}