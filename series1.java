import java.util.Scanner;
class series1
{
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms");
        n=sc.nextInt();
        sc.close();
    }
    void sums()
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("The sum of the series is "+sum);
    }
    public static void main()
    {
        series1 obj=new series1();
        obj.input();
        obj.sums();
    }
}