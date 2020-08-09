import java.util.Scanner;
class leapyear
{
    int year1;
    int year2;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start year");
        year1=sc.nextInt();
        System.out.println("Enter end year");
        year2=sc.nextInt();
        sc.close();
    }
    void calc()
    {
        for(int i=year1;i<=year2;i++)
        {
            if(i%4==0)
            {
                if(i%100==0)
                {
                   if(i%400==0)
                   {
                       System.out.println(i);
                   }
                   else
                   {
                   }
                }
                else
                {
                    System.out.println(i);
                }
            }
            else
            {
            }
        }
    }
    public static void main()
    {
        leapyear obj=new leapyear();
        obj.input();
        obj.calc();
    }
}