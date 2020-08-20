import java.util.Scanner;
class sumsqdig
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
        int r1,r;
        while(n!=0)
        {
            r1=n%10;
            r=r1*r1;
            sum+=r;
            n/=10;
        }
        System.out.println("Sum of the squares of the digits is "+sum);
    }
    public static void main()
    {
        sumsqdig obj=new sumsqdig();
        obj.input();
        obj.calc();
    }
}