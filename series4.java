import java.util.Scanner;
class series4
{
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms");
        n=sc.nextInt();
        sc.close();
    }
    void calc()
    {
        int sum=0;
        int a=0;
        for(int i=1;i<=n;i++)
        {
            a+=i;
            sum+=a;
        }
        System.out.println(sum);
    }
    public static void main()
    {
        series4 obj=new series4();
        obj.input();
        obj.calc();
    }
}