import java.util.Scanner;
class table
{
    int n;
    int x;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of which you want the multiplication table");
        n=sc.nextInt();
        System.out.println("State the number of terms of the multiplication table");
        x=sc.nextInt();
        sc.close();
    }
    void calc()
    {
        int n1=n;
        for(int i=1;i<=x;i++)
        {
            n1=n;
            n1*=i;
            System.out.println(n1);
        }
    }
    public static void main()
    {
        table obj=new table();
        obj.input();
        obj.calc();
    }
}