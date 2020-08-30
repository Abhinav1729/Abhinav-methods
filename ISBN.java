import java.util.Scanner;
class ISBN
{
    long n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ISBN number");
        n=sc.nextLong();
        sc.close();
    }
    boolean check()
    {
        int count=0;
        long n1=n;
        while(n1!=0)
        {
            n1/=10;
            count++;
        }
        if(count==10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void checksum()
    {
        int mul=10;
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            long rem=n%10;
            sum+=(rem*mul);
            n/=10;
            mul--;
        }
        if(sum%11==0)
        {
            System.out.println("ISBN number");
        }
        else
        {
            System.out.println("Not an ISBN number");
        }
    }
    public static void main()
    {
        ISBN obj=new ISBN();
        obj.input();
        boolean b=obj.check();
        if(b==true)
        {
            obj.checksum();
        }
        else
        {
            System.out.println("Not an ISBN number since it is not of 10 digits");
        }
    }
}