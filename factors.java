import java.util.Scanner;
class factors
{
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        sc.close();
    }
    void calc()
    {
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
    }
    public static void main()
    {
        System.out.println("The factors are:");
        factors obj=new factors();
        obj.input();
        obj.calc();
    }
}