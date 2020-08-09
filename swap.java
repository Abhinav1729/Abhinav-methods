import java.util.Scanner;
class swap
{
    int a;
    int b;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        sc.close();
    }
    void sw()
    {
        a+=b;
        b=a-b;
        a-=b;
        System.out.println("Swapped a is "+a);
        System.out.println("Swapped b is "+b);
    }
    public static void main()
    {
        swap obj=new swap();
        obj.input();
        obj.sw();
    }
}