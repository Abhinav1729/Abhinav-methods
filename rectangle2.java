class rectangle2
{
    int length,breadth,area;
    void init()
    {
        length=10;
        breadth=20;
    }
    void calc()
    {
        area=length*breadth;
    }
    void display()
    {
        System.out.println("The area is "+area);
    }
    public static void main()
    {
        rectangle2 obj=new rectangle2();
        obj.init();
        obj.calc();
        obj.display();
    }
}