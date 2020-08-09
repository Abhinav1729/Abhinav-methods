import java.util.Scanner;
class addsum
{
    double a;
    double b;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextDouble();
        System.out.println("Enter second number");
        b=sc.nextDouble();
        sc.close();
    }
    double calc()
    {
        double s=a+b;
        return s;
    }
    public static void main()
    {
        addsum obj=new addsum();
        obj.input();
        double sum=obj.calc();
        System.out.println("The sum is "+sum);
    }
}