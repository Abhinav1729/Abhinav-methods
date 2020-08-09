import java.util.Scanner;
public class rps
{
    String c;
    double x;
    String res;
    String input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Rock, Paper or Scissors?");
        c=sc.nextLine();
        sc.close();
        return c;
    }
    String compran()
    {
        double y=100*Math.random();
        x=Math.round(y);
        if(x%3==0)
        {
            res="Rock";
        }
        else if(x%3==1)
        {
            res="Scissors";
        }
        else
        {
            res="Paper";
        }
        return res;
    }
    public static void main()
    {
        rps obj=new rps();
        String c1=obj.input();
        String d1=obj.compran();
        System.out.println("Computer's choice:"+d1);
        String c2=obj.input();
        String d2=obj.compran();
        System.out.println("Computer's choice:"+d2);
        String c3=obj.input();
        String d3=obj.compran();
        System.out.println("Computer's choice:"+d3);
        String c4=obj.input();
        String d4=obj.compran();
        System.out.println("Computer's choice:"+d4);
        String c5=obj.input();
        String d5=obj.compran();
        System.out.println("Computer's choice:"+d5);
        String a1="Rock";
        String a2="Scissors";
        String a3="Paper";
        int countcomp=0;
        int countplay=0;
        if(c1.compareTo(a1)==0)
        {
            if(d1.compareTo(a1)==0)
            {
            }
            if(d1.compareTo(a2)==0)
            {
                countplay++;
            }
            if(d1.compareTo(a3)==0)
            {
                countcomp++;
            }
        }
        if(c1.compareTo(a2)==0)
        {
            if(d1.compareTo(a2)==0)
            {
            }
            if(d1.compareTo(a3)==0)
            {
                countplay++;
            }
            if(d1.compareTo(a1)==0)
            {
                countcomp++;
            }
        }
        if(c1.compareTo(a3)==0)
        {
            if(d1.compareTo(a3)==0)
            {
            }
            if(d1.compareTo(a1)==0)
            {
                countplay++;
            }
            if(d1.compareTo(a2)==0)
            {
                countcomp++;
            }
        }
        if(c2.compareTo(a1)==0)
        {
            if(d2.compareTo(a1)==0)
            {
            }
            if(d2.compareTo(a2)==0)
            {
                countplay++;
            }
            if(d2.compareTo(a3)==0)
            {
                countcomp++;
            }
        }
        if(c2.compareTo(a2)==0)
        {
            if(d2.compareTo(a2)==0)
            {
            }
            if(d2.compareTo(a3)==0)
            {
                countplay++;
            }
            if(d2.compareTo(a1)==0)
            {
                countcomp++;
            }
        }
        if(c2.compareTo(a3)==0)
        {
            if(d2.compareTo(a3)==0)
            {
            }
            if(d2.compareTo(a1)==0)
            {
                countplay++;
            }
            if(d2.compareTo(a2)==0)
            {
                countcomp++;
            }
        }
        if(c3.compareTo(a1)==0)
        {
            if(d3.compareTo(a1)==0)
            {
            }
            if(d3.compareTo(a2)==0)
            {
                countplay++;
            }
            if(d3.compareTo(a3)==0)
            {
                countcomp++;
            }
        }
        if(c3.compareTo(a2)==0)
        {
            if(d3.compareTo(a2)==0)
            {
            }
            if(d3.compareTo(a3)==0)
            {
                countplay++;
            }
            if(d3.compareTo(a1)==0)
            {
                countcomp++;
            }
        }
        if(c3.compareTo(a3)==0)
        {
            if(d3.compareTo(a3)==0)
            {
            }
            if(d3.compareTo(a1)==0)
            {
                countplay++;
            }
            if(d3.compareTo(a2)==0)
            {
                countcomp++;
            }
        }
        if(c4.compareTo(a1)==0)
        {
            if(d4.compareTo(a1)==0)
            {
            }
            if(d4.compareTo(a2)==0)
            {
                countplay++;
            }
            if(d4.compareTo(a3)==0)
            {
                countcomp++;
            }
        }
        if(c4.compareTo(a2)==0)
        {
            if(d4.compareTo(a2)==0)
            {
            }
            if(d4.compareTo(a3)==0)
            {
                countplay++;
            }
            if(d4.compareTo(a1)==0)
            {
                countcomp++;
            }
        }
        if(c4.compareTo(a3)==0)
        {
            if(d4.compareTo(a3)==0)
            {
            }
            if(d4.compareTo(a1)==0)
            {
                countplay++;
            }
            if(d4.compareTo(a2)==0)
            {
                countcomp++;
            }
        }
        if(c5.compareTo(a1)==0)
        {
            if(d5.compareTo(a1)==0)
            {
            }
            if(d5.compareTo(a2)==0)
            {
                countplay++;
            }
            if(d5.compareTo(a3)==0)
            {
                countcomp++;
            }
        }
        if(c5.compareTo(a2)==0)
        {
            if(d5.compareTo(a2)==0)
            {
            }
            if(d5.compareTo(a3)==0)
            {
                countplay++;
            }
            if(d5.compareTo(a1)==0)
            {
                countcomp++;
            }
        }
        if(c5.compareTo(a3)==0)
        {
            if(d5.compareTo(a3)==0)
            {
            }
            if(d5.compareTo(a1)==0)
            {
                countplay++;
            }
            if(d5.compareTo(a2)==0)
            {
                countcomp++;
            }
        }
        System.out.println("Computer's score is "+countcomp);
        System.out.println("Your score is "+countplay);
        if(countcomp>countplay)
        {
            System.out.println("You lose");
        }
        else if(countcomp<countplay)
        {
            System.out.println("You win");
        }
        else
        {
            System.out.println("Its a tie");
        }
    }
}