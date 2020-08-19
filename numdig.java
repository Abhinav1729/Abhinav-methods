import java.util.Scanner;
class numdig
{
    int a;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        a=sc.nextInt();
        sc.close();
    }
    int calc()
    {
        int c=0;
        while(a!=0)
        {
            a/=10;
            c++;
        }
        return c;
    }
    public static void main()
    {
        numdig obj=new numdig();
        obj.input();
        int count=obj.calc();
        System.out.println("The number of digits are "+count);
    }
}