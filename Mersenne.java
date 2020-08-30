import java.util.Scanner;
class Mersenne
{
    int l,u;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two limits between which you want the Mersenne numbers");
        System.out.println("Enter the lower limit");
        l=sc.nextInt();
        System.out.println("Enter the upper limit");
        u=sc.nextInt();
        sc.close();
    }
    void calc()
    {
        double mer;
        for(int i=l;i<=u;i++)
        {
            int j=1;
            mer=Math.pow(2,j)-1;
            if(i==mer)
            {
                    System.out.println(i+" is a Mersenne number");
            }
            while(mer<=u)
            {
                j++;
                mer=Math.pow(2,j)-1;
                if(i==mer)
                {
                    System.out.println(i+" is a Mersenne number");
                }
            }
        }
    }
    public static void main()
    {
        Mersenne obj=new Mersenne();
        obj.input();
        obj.calc();
    }
}