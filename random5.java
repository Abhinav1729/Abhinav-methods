class random5
{
    public static void main()
    {
        for(int i=1;i<=5;i++)
        {
            long x=Math.round(100*Math.random());
            System.out.println(x);
        }
    }
}