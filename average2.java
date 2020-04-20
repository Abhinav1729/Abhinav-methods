class average2
{
    double maths,science,computer,average;
    void input()
    {
        maths=100;
        science=99;
        computer=99;
    }
    void calc()
    {
        average=(maths+science+computer)/3;
    }
    void display()
    {
        System.out.println("the average is"+average);
    }
    public static void main()
    {
        average2 obj=new average2();
        obj.input();
        obj.calc();
        obj.display();
    }
}