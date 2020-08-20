import java.util.Scanner;
class sumdig
{
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
        sc.close();
    }
    void calc()
    {
        int sum=0;
        int r;
        while(n!=0)
        {
            r=n%10;
            sum+=r;
            n/=10;
        }
        System.out.println("Sum of digits is "+sum);
    }
    public static void main()
    {
        sumdig obj=new sumdig();
        obj.input();
        obj.calc();
    }
}