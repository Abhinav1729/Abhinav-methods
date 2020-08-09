import java.util.Scanner;
public class oddevemain
{
    String dec;
    String init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bat or Bowl?");
        dec=sc.nextLine();
        sc.close();
        return dec;
    }
    public static void main()
    {
        oddevemain obj=new oddevemain();
        String bob=obj.init();
        String a1="Bat";
        String a2="Bowl";
        if(bob.compareTo(a1)==0)
        {
            oddeve obj1=new oddeve();
            int runsplay=0;
            int play=0;
            int comp=1;
            while(play!=comp)
            {
                play=obj1.input();
                comp=obj1.calc();
                System.out.println("The computer's response is "+comp);
                runsplay+=play;
            }
            runsplay-=play;
            System.out.println("Your score is "+runsplay);
            bowl obj2=new bowl();
            int runscomp=0;
            int play1=1;
            int comp1=0;
            while(play1!=comp1)
            {
                play1=obj2.input();
                comp1=obj2.calc();
                System.out.println("The computer's response is "+comp1);
                runscomp+=comp1;
            }
            runscomp-=comp1;
            System.out.println("Computer's score is "+runscomp);
            if(runsplay>runscomp)
            {
                System.out.println("You win");
            }
            else if(runsplay<runscomp)
            {
                System.out.println("You lose");
            }
            else
            {
                System.out.println("Its a tie");
            }
        }
        else
        {
            bowl obj2=new bowl();
            int runscomp=0;
            int play1=1;
            int comp1=0;
            while(play1!=comp1)
            {
                play1=obj2.input();
                comp1=obj2.calc();
                System.out.println("The computer's response is "+comp1);
                runscomp+=comp1;
            }
            runscomp-=comp1;
            System.out.println("Computer's score is "+runscomp);
            oddeve obj1=new oddeve();
            int runsplay=0;
            int play=0;
            int comp=1;
            while(play!=comp)
            {
                play=obj1.input();
                comp=obj1.calc();
                System.out.println("The computer's response is "+comp);
                runsplay+=play;
            }
            runsplay-=play;
            System.out.println("Your score is "+runsplay);
            if(runsplay>runscomp)
            {
                System.out.println("You win");
            }
            else if(runsplay<runscomp)
            {
                System.out.println("You lose");
            }
            else
            {
                System.out.println("Its a tie");
            }
        }
    }
}