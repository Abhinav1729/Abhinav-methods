import java.util.Scanner;
class series7
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
        int s1=0;
        int s2=0;
        int k=2*n;
        int f1=1;
        int f2=1;
        if(n%2==0)
        {
            for(int i=2;i<=k;i+=4)
            {
                for(int j=1;j<=i;j++)
                {
                    f1*=j;
                }
                s1+=f1;
            }
            for(int i=4;i<=k;i+=4)
            {
                for(int j=1;j<=i;j++)
                {
                    f2*=j;
                }
                s2+=f2;
            }
            sum=s1-s2;
            System.out.println(sum);
        }
        else
        {
            for(int i=2;i<=k;i+=4)
            {
                for(int j=1;j<=i;j++)
                {
                    f1*=j;
                }
                s1+=f1;
            }
            for(int i=4;i<=k;i+=4)
            {
                for(int j=1;j<=i;j++)
                {
                    f2*=j;
                }
                s2+=f2;
            }
            sum=s1-s2;
            System.out.println(sum);
        }
    }
    public static void main()
    {
        series7 obj=new series7();
        obj.input();
        obj.calc();
    }
}