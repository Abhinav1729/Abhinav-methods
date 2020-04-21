class armstrong
{
    int t1;
    int n0;
    int t2;
    int len=0;
    int arm;
    void digit(int n)
    {
        t1=n;
        n0=n;
        t2=n;
        while(t1!=0)
        {
            t1/=10;
            len+=1;
        }
    }
    void arm()
    {
        arm=0;
        int rem;
        while(t2!=0)
        {
            int mul=1;
            rem=t2%10;
            for(int i=1;i<=len;i++)
            {
                mul*=rem;
            }
            arm+=mul;
            t2/=10;
        }
    }
    void check()
    {
        if(arm==n0)
        {
            System.out.println("armstrong number");
        }
        else
        {
            System.out.println("not an armstrong number");
        }
    }
}