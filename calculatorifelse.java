import java.util.Scanner;
class calculatorifelse
{
    double n1;
    double n2;
    char ch;
    char input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        n1=sc.nextDouble();
        System.out.println("Enter second number");
        n2=sc.nextDouble();
        System.out.println("Enter operation");
        ch=sc.next().charAt(0);
        sc.close();
        return ch;
    }
    void add()
    {
        double a=n1+n2;
        System.out.println(a);
    }
    void subtract()
    {
        double s=n1-n2;
        System.out.println(s);
    }
    void multiply()
    {
        double m=n1*n2;
        System.out.println(m);
    }
    void divide()
    {
        double d=n1/n2;
        System.out.println(d);
    }
    public static void main()
    {
        calculatorifelse obj=new calculatorifelse();
        char c=obj.input();
        if(c=='+')
        {
            obj.add();
        }
        else if(c=='-')
        {
            obj.subtract();
        }
        else if(c=='*')
        {
            obj.multiply();
        }
        else if(c=='/')
        {
            obj.divide();
        }
        else
        {
            System.out.println("Invalid operation");
        }
    }
}