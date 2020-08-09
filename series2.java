import java.util.Scanner;
class series2
{
    int n;
    int x;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base");
        x=sc.nextInt();
        System.out.println("Enter number of terms");
        n=sc.nextInt();
        sc.close();
    }
    void sums()
    {
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum+=Math.pow(x,i);
        }
        System.out.println("The sum of the series is "+sum);
    }
    public static void main()
    {
        series2 obj=new series2();
        obj.input();
        obj.sums();
    }
}