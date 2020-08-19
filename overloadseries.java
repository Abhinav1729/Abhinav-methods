public class overloadseries
{
    double series(double n)
    {
        double sum=0;
        for(double i=1;i<=n;i++)
        {
            sum+=(1/i);
        }
        return sum;
    }
    double series(double a,double n)
    {
        double sum=0;
        int d=1;
        for(int i=1;i<=n;i++)
        {
            sum+=d/Math.pow(a,d+1);
            d+=3;
        }
        return sum;
    }
}