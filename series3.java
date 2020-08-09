import java.util.Scanner;
class series3
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
        for(int i=1;i<=n;i++)
        {
            sum+=Math.pow(i,2)+1;
        }
        System.out.println(sum);
    }
    public static void main()
    {
        series3 obj=new series3();
        obj.input();
        obj.calc();
    }
}