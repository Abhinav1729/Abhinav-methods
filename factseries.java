import java.util.Scanner;
class factseries
{
    int n;
    int x;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base");
        x=sc.nextInt();
        System.out.println("Enter power");
        n=sc.nextInt();
        sc.close();
    }
    double fact()
    {
        double sum=0;
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f*=i;
            sum+=Math.pow(x,i)/f;
        }
        return sum;
    }
    public static void main()
    {
        factseries obj=new factseries();
        obj.input();
        double total=obj.fact();
        System.out.println(total);
    }
}