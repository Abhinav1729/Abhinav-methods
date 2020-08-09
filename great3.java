import java.util.Scanner;
class great3
{
    int a;
    int b;
    int c;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number(a)");
        a=sc.nextInt();
        System.out.println("Enter second number(b)");
        b=sc.nextInt();
        System.out.println("Enter second number(c)");
        c=sc.nextInt();
        sc.close();
    }
    void calc()
    {
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is largest");
            }
            else if(c>a)
            {
                System.out.println("c is largest");
            }
            else
            {
                if(b>a)
                {
                    System.out.println("b is largest");
                }
                else if(a>b)
                {
                    System.out.println("a and c are largest");
                }
                else
                {
                    System.out.println("all are equal");
                }
            }
        }
        else if(b>a)
        {
            if(c>b)
            {
                System.out.println("c is largest");
            }
            else if(b>c)
            {
                System.out.println("b is largest");
            }
            else
            {
                if(a>b)
                {
                    System.out.println("a is largest");
                }
                else if(b>a)
                {
                    System.out.println("b and c are largest");
                }
                else
                {
                    System.out.println("all are equal");
                }
            }
        }
        else
        {
            if(c>a)
            {
                System.out.println("c is largest");
            }
            else if(a>c)
            {
                System.out.println("a and b are largest");
            }
            else
            {
                System.out.println("all are equal");
            }
        }
    }
    public static void main()
    {
        great3 obj=new great3();
        obj.input();
        obj.calc();
    }
}