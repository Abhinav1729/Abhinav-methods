import java.util.Scanner;
class series6
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
        if(n%2==0)
        {
            int sum=-1*(n/2);
            System.out.println(sum);
        }
        else
        {
            int sum=-1*((n-1)/2)+n;
            System.out.println(sum);
        }
    }
    public static void main()
    {
        series6 obj=new series6();
        obj.input();
        obj.calc();
    }
}