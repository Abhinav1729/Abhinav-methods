import java.util.Scanner;
class bintodec
{
    long n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number in binary notation");
        n=sc.nextLong();
        sc.close();
    }
    void calc()
    {
        int count=0;
        long r;
        int sum=0;
        while(n!=0)
        {
            r=n%10;
            sum+=r*Math.pow(2,count);
            count++;
            n/=10;
        }
        System.out.println("The binary number in decimal base system is "+sum);
    }
    public static void main()
    {
        bintodec obj=new bintodec();
        obj.input();
        obj.calc();
    }
}