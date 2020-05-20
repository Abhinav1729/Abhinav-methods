public class board18//cube no. condition not satisfied
{
    public static void main(int n)
    {
        int t1=n;
        int sum=0;
        int t2=n;
        for(int i=2;i<=t2-1;i++)
        {
            if(t1%i==0)
            {
                int j=i;
                int k=i;
                while(j!=0)
                {
                    int dig=j%10;
                    sum+=dig;
                    j/=10;
                }
                t1/=k;
                int t3=t1;
                if(t1%k==0)
                {
                    while(t3%k==0)
                    {
                        t3/=k;
                        int len=0;
                        int m=i;
                        int o=i;
                        while(m!=0)
                        {
                            m/=10;
                            len+=1;
                        }
                        for(int p=1;p<=len;p++)
                        {
                            int rem=o%10;
                            sum+=rem;
                            o/=10;
                        }
                        t1/=k;
                    }
                }
            }
        }
        int t4=n;
        int digsum=0;
        while(t4!=0)
        {
            int remdig=t4%10;
            digsum+=remdig;
            t4/=10;
        }
        if(sum==digsum)
        {
            System.out.println("Smith number");
        }
        else
        {
            System.out.println("not a Smith number");
        }
    }
}