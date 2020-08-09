import java.util.Scanner;
class composite
{
    int n;
    int count=0;
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
                count++;
            }
        }
        if(count>2)
        {
            System.out.println("Composite number");
        }
        else
        {
            System.out.println("Prime number");
        }
    }
    public static void main()
    {
        composite obj=new composite();
        obj.input();
        obj.calc();
    }
}