public class board9
{
    static void series1()
    {
        int s1=0;
        int s2=0;
        for(int i=2;i<=18;i+=4)
        {
            s1+=i;
        }
        for(int i=4;i<=20;i+=4)
        {
            s2+=i;
        }
        System.out.println(s1-s2);
    }
    static void series2(double x)
    {
        double s=0;
        for(double i=2;i<=20;i+=3)
        {
            s+=(x/i);
        }
        System.out.println(s);
    }
}