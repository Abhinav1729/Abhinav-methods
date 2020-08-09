import java.util.Scanner;
class telebill
{
    int call;
    double bill;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of phone calls?");
        call=sc.nextInt();
        sc.close();
    }
    void cost()
    {
        if((call>0)&&(call<=100))
        {
            bill=100;
        }
        else if((call>100)&&(call<=150))
        {
            bill=100+(call-100)*2;
        }
        else
        {
            bill=100+50*2+(call-150)*2.5;
        }
    }
    void printbill()
    {
        System.out.println("The total telephone bill is "+bill);
    }
    public static void main()
    {
        telebill obj=new telebill();
        obj.input();
        obj.cost();
        obj.printbill();
    }
}