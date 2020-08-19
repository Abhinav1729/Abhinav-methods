import java.util.Scanner;
public class oddeve
{
    int num;
    int count=0;
    int compch;
    static int runsplay;
    int input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Which number(1,2,3,4,5,6)?");
        num=sc.nextInt();
        sc.close();
        count++;
        return num;
    }
    int calc()
    {
        double y=Math.random()*100;
        double x=Math.round(y);
        compch=0;
        while(compch==0)
        {
            if(x<=96)
            {
                if(x%6==0)
                {
                    compch=1;
                }
                else if(x%6==1)
                {
                    compch=2;
                }
                else if(x%6==2)
                {
                    compch=3;
                }
                else if(x%6==3)
                {
                    compch=4;
                }
                else if(x%6==4)
                {
                    compch=5;
                }
                else
                {
                    compch=6;
                }
            }
            else
            {
            }
        }
        return compch;
    }
    public static void main()
    {
        oddeve obj=new oddeve();
        runsplay=0;
        int play=0;
        int comp=1;
        while(play!=comp)
        {
            play=obj.input();
            comp=obj.calc();
            System.out.println("The computer's response is "+comp);
            runsplay+=play;
        }
        runsplay-=play;
        System.out.println("Your score is "+runsplay);
    }
}