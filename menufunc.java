import java.util.Scanner;
class menufunc
{
    void input()
    {
        System.out.println("What would you like to do?");
        System.out.println("1. Find the natural logarithm of a number");
        System.out.println("2. Find the absolute value of a number");
        System.out.println("3. Find the square root of a number");
        System.out.println("4. Find a random number between 0 and 1");
        System.out.println("Press any integer other than [1/2/3/4] to exit");
    }
    void natlog()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of which you want the natural logarithm");
        double n=sc.nextDouble();
        double log=Math.log(n);
        System.out.println("The natural logarithm of the number is "+log);
    }
    void absval()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of which you want the absolute value");
        double n=sc.nextDouble();
        double abs=Math.abs(n);
        System.out.println("The absolute value of the number is "+abs);
    }
    void sqrt()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of which you want the square root");
        double n=sc.nextDouble();
        double sq=Math.sqrt(n);
        System.out.println("The square root of the number is "+sq);
    }
    void ran()
    {
        double r=Math.random();
        System.out.println("A random number between 0 and 1 is "+r);
    }
    public static void main()
    {
        menufunc obj=new menufunc();
        Scanner sc=new Scanner(System.in);
        char c;
        int opt;
        do
        {
            obj.input();
            System.out.println("Enter your selection [1/2/3/4]");
            opt=sc.nextInt();
            if(opt==1)
            {
                obj.natlog();
            }
            else if(opt==2)
            {
                obj.absval();
            }
            else if(opt==3)
            {
                obj.sqrt();
            }
            else if(opt==4)
            {
                obj.ran();
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