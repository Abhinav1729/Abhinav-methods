import java.util.Scanner;
class menuvol
{
    void generateMenu()
    {
        System.out.println("What would you like to do?");
        System.out.println("1. Calculate Volume of Sphere");
        System.out.println("2. Calculate Volume of Cylinder");
        System.out.println("3. Calclate Volume of Cone");
        System.out.println("Press any integer other than 1/2/3 to exit");
    }
    void calcSphere()
    {
        Scanner sc=new Scanner(System.in);
        double v;
        int r;
        System.out.println("Enter radius");
        r=sc.nextInt();
        v=(4/3)*Math.PI*r*r*r;
        System.out.println("The Volume is "+v);
    }
    void calcCylinder()
    {
        Scanner sc=new Scanner(System.in);
        double v;
        int r;
        int h;
        System.out.println("Enter radius");
        r=sc.nextInt();
        System.out.println("Enter height");
        h=sc.nextInt();
        v=Math.PI*r*r*h;
        System.out.println("The volume is "+v);
    }
    void calcCone()
    {
        Scanner sc=new Scanner(System.in);
        double v;
        double r;
        double h;
        System.out.println("Enter radius");
        r=sc.nextDouble();
        System.out.println("Enter height");
        h=sc.nextDouble();
        v=(Math.PI*r*r*h)/3;
        System.out.println("The volume is "+v);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        menuvol obj=new menuvol();
        char c;
        int opt;
        do
        {
            obj.generateMenu();
            System.out.println("Enter your selection[1/2/3]:");
            opt=sc.nextInt();
            if(opt==1)
            {
                obj.calcSphere();
            }
            else if(opt==2)
            {
                obj.calcCylinder();
            }
            else if(opt==3)
            {
                obj.calcCone();
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