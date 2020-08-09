import java.util.Scanner;
class circle
{
    double r;
    double area;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        r=sc.nextDouble();
        sc.close();
    }
    void area()
    {
        area=Math.PI*r*r;
        System.out.println("The area is "+area);
    }
    public static void main()
    {
        circle obj=new circle();
        obj.input();
        obj.area();
    }
}