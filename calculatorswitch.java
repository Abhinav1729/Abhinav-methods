import java.util.Scanner;
class calculatorswitch
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
        calculatorswitch obj=new calculatorswitch();
        char c=obj.input();
        switch (c)
        {
            case '+':
            obj.add();
            break;
            case '-':
            obj.subtract();
            break;
            case '*':
            obj.multiply();
            break;
            case '/':
            obj.divide();
            break;
            default:
            System.out.println("Invalid operation");
            break;
        }

    }
}