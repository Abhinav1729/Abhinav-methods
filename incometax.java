import java.util.Scanner;
class incometax
{
    double income;
    double tax;
    String name;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        name=sc.nextLine();
        System.out.println("Enter income");
        income=sc.nextDouble();
        sc.close();
    }
    void calc()
    {
        if((income>0)&&(income<=40000))
        {
            tax=0;
        }
        else if((income>40000)&&(income<=70000))
        {
            tax=(20*income)/100;
        }
        else if((income>70000)&&(income<=100000))
        {
            tax=(30*income)/100;
        }
        else
        {
            tax=(40*income)/100;
        }
    }
    void printtax()
    {
        System.out.println("Name:"+name);
        System.out.println("Income Tax:"+tax);
    }
    public static void main()
    {
        incometax obj=new incometax();
        obj.input();
        obj.calc();
        obj.printtax();
    }
}