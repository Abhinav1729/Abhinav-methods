import java.util.Scanner;
class avedig
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
        double sum=0;
        int r;
        double count=0;
        while(n!=0)
        {
            r=n%10;
            sum+=r;
            n/=10;
            count++;
        }
        double average=sum/count;
        System.out.println("Average of digits is "+average);
    }
    public static void main()
    {
        avedig obj=new avedig();
        obj.input();
        obj.calc();
    }
}