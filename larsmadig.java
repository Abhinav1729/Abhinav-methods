import java.util.Scanner;
class larsmadig
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
        int rem;
        int min;
        int max;
        rem=n%10;
        min=rem;
        max=rem;
        n/=10;
        while(n!=0)
        {
            rem=n%10;
            if(rem<min)
            {
                min=rem;
            }
            else
            {
            }
            if(rem>max)
            {
                max=rem;
            }
            else
            {
            }
            n/=10;
        }
        System.out.println("The largest digit is "+max);
        System.out.println("The smallest digit is "+min);
    }
    public static void main()
    {
        larsmadig obj=new larsmadig();
        obj.input();
        obj.calc();
    }
}