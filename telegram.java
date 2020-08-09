import java.util.Scanner;
class telegram
{
    int words;
    int bill;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of words?");
        words=sc.nextInt();
        sc.close();
    }
    void calc()
    {
        if((words>0)&&(words<=15))
        {
            bill=5;
        }
        else
        {
            bill=5+(words-15)*1;
        }
    }
    void printbill()
    {
        System.out.println("The bill is "+bill);
    }
    public static void main()
    {
        telegram obj=new telegram();
        obj.input();
        obj.calc();
        obj.printbill();
    }
}