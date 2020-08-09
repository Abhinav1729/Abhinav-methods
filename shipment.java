import java.util.Scanner;
public class shipment
{
    int units;
    char s;
    int cost;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of units");
        units=sc.nextInt();
        System.out.println("Are you a special customer?");
        s=sc.next().charAt(0);
        sc.close();
    }
    void calc()
    {
        if(units<=15)
        {
            cost=units*150;
        }
        else if((units>15)&&(units<=20))
        {
            cost=units*145;
        }
        else if((units>20)&&(units<=30))
        {
            cost=units*140;
        }
        else if((units>30)&&(units<=50))
        {
            cost=units*135;
        }
        else
        {
            cost=units*130;
        }
        if((s=='Y')||(s=='y'))
        {
            cost-=(10/100)*cost;
            System.out.println("You got 10% discount!!!");
        }
        else if((s=='N')||(s=='n'))
        {
        }
        else
        {
            System.out.println("Invalid character");
        }
    }
    void printbill()
    {
        System.out.println("The total shipment cost is "+cost);
    }
    public static void main()
    {
        shipment obj=new shipment();
        obj.input();
        obj.calc();
        obj.printbill();
    }
}