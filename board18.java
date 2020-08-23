import java.util.Scanner;
class board18
{
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        sc.close();
    }
    int primesumcalc()
    {
        int sum=0;
        int rem;
        int j;
        int n1=n;
        for(int i=2;i<=n-1;i++)
        {
            int count=0;
            while(n1%i==0)
            {
                j=i;
                while(j!=0)
                {
                    rem=j%10;
                    sum+=rem;
                    j/=10;
                }
                n1/=i;
                count++;
            }
            if(count>0)
            {
                n1=n/(i*count);
            }
        }
        return sum;
    }
    int sumcalc()
    {
        int sum=0;
        int n1=n;
        int rem;
        while(n1!=0)
        {
            rem=n1%10;
            sum+=rem;
            n1/=10;
        }
        return sum;
    }
    public static void main()
    {
        board18 obj=new board18();
        obj.input();
        int prsum=obj.primesumcalc();
        int disum=obj.sumcalc();
        if(prsum==disum)
        {
            System.out.println("Smith number");
        }
        else
        {
            System.out.println("Not a Smith number");
        }
    }
}