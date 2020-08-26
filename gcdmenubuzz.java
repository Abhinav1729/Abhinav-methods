import java.util.Scanner;
class gcdmenubuzz
{
    void input()
    {
        System.out.println("What would you like to do?");
        System.out.println("1. Find whether the given number is a buzz number or not");
        System.out.println("2. Find the HCF of the 2 given numbers");
        System.out.println("Type any number other than[1/2] to exit");
    }
    void buzz()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int last=n%10;
        if((n%7==0)||(last==7))
        {
            System.out.println("Buzz number");
        }
        else
        {
            System.out.println("Not a buzz number");
        }
    }
    void gcd()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int n1=sc.nextInt();
        System.out.println("Enter second number");
        int n2=sc.nextInt();
        int hcf=0;
        for(int i=1;i<=n1;i++)
        {
            if((n1%i==0)&&(n2%i==0))
            {
                hcf=i;
            }
        }
        System.out.println("The greatest common divisor of the 2 numbers is "+hcf);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        gcdmenubuzz obj=new gcdmenubuzz();
        char c;
        int opt;
        do
        {
            obj.input();
            System.out.println("Enter your selection[1/2]");
            opt=sc.nextInt();
            if(opt==1)
            {
                obj.buzz();
            }
            else if(opt==2)
            {
                obj.gcd();
            }
            else
            {
                return;
            }
            System.out.println("Would you like to continue?[y/n]");
            c=sc.next().charAt(0);
        }while(c=='y');
    }
}