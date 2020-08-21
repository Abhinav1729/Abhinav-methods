import java.util.Scanner;
class areas
{
    void area()
    {
        System.out.println("Enter [1/2/3] for:");
        System.out.println("1) Calculate area of circle");
        System.out.println("2) Calculate area of square");
        System.out.println("3) Calculate area of rectangle");
        System.out.println("Press any other number to exist");
    }
    void area(int radius)
    {
        double a=Math.PI*radius*radius;
        System.out.println("The area is "+a);
    }
    void area(double side)
    {
        double a=side*side;
        System.out.println("The area is "+a);
    }
    void area(double length,double breadth)
    {
        double a=length*breadth;
        System.out.println("The area is "+a);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        areas obj=new areas();
        char c;
        int opt;
        do
        {
            obj.area();
            System.out.println("Enter your selection [1/2/3]");
            opt=sc.nextInt();
            if(opt==1)
            {
                System.out.println("Enter the radius");
                int r=sc.nextInt();
                obj.area(r);
            }
            else if(opt==2)
            {
                System.out.println("Enter the side");
                double s=sc.nextDouble();
                obj.area(s);
            }
            else if(opt==3)
            {
                System.out.println("Enter length");
                double l=sc.nextDouble();
                System.out.println("Enter breadth");
                double b=sc.nextDouble();
                obj.area(l,b);
            }
            else
            {
                return;
            }
            System.out.println("Would you like to continue[y/n]");
            c=sc.next().charAt(0);
        }while(c=='y');
    }
}