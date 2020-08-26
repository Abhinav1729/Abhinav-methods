import java.util.Scanner;
class menupalper
{
    void genmenu()
    {
        System.out.println("What would you like to do?");
        System.out.println("1. Check whether the number is a palindrome or not");
        System.out.println("2. Check whether the number is perfect or not");
        System.out.println("Press any other integer to exit");
    }
    void palin()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int n1=n;
        int rem;
        int rev=0;
        while(n1!=0)
        {
            rem=n1%10;
            rev=rev*10+rem;
            n1/=10;
        }
        if(rev==n)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
    void per()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n-1;i++)
        {
            if(n%i==0)
            {
                sum+=i;
                }
        }
        if(sum==n)
        {
            System.out.println("Perfect number");
        }
        else
        {
            System.out.println("Not a perfect number");
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        menupalper obj=new menupalper();
        char c;
        int opt;
        do
        {
            obj.genmenu();
            System.out.println("Enter your selection[1/2]");
            opt=sc.nextInt();
            if(opt==1)
            {
                obj.palin();
            }
            else if(opt==2)
            {
                obj.per();
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