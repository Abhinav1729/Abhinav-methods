import java.util.Scanner;
class sumdiv
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
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        int n1=2*n;
        if(sum<n1)
        {
            System.out.println("Deficient number");
        }
        else if(sum>n1)
        {
            System.out.println("Abundant number");
        }
        else
        {
            System.out.println("Pefect number");
        }
    }
    public static void main()
    {
        sumdiv obj=new sumdiv();
        obj.input();
        obj.calc();
    }
}