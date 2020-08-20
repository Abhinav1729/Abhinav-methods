import java.util.Scanner;
class proddig
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
        int sum=1;
        int r;
        while(n!=0)
        {
            r=n%10;
            sum*=r;
            n/=10;
        }
        System.out.println("Product of digits is "+sum);
    }
    public static void main()
    {
        proddig obj=new proddig();
        obj.input();
        obj.calc();
    }
}