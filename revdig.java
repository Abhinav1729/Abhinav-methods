import java.util.Scanner;
class revdig
{
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to be reversed");
        n=sc.nextInt();
        sc.close();
    }
    void calc()
    {
        int r;
        int rev=0;
        while(n!=0)
        {
            r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        System.out.println("The reversed number is "+rev);
    }
    public static void main()
    {
        revdig obj=new revdig();
        obj.input();
        obj.calc();
    }
}