import java.util.Scanner;
class dice7
{
    int roll()
    {
        int rolldie=0;
        long y=Math.round(100*Math.random());
        while(rolldie==0)
        {
            if(y<=96)
            {
                if(y%6==0)
                {
                    rolldie=1;
                }
                else if(y%6==1)
                {
                    rolldie=2;
                }
                else if(y%6==2)
                {
                    rolldie=3;
                }
                else if(y%6==3)
                {
                    rolldie=4;
                }
                else if(y%6==4)
                {
                    rolldie=5;
                }
                else
                {
                    rolldie=6;
                }
            }
            else
            {
            }
        }
        return rolldie;
    }
    public static void main()
    {
        int sum=0;
        int tries=0;
        dice7 obj=new dice7();
        while(sum!=7)
        {
            int n1=obj.roll();
            int n2=obj.roll();
            sum=n1+n2;
            System.out.println(n1+"+"+n2+"="+sum);
            tries++;
        }
        System.out.println("you won after "+tries+" tries");
    }
}