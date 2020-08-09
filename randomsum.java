import java.util.Scanner;
class randomsum
{
    int input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        sc.close();
        return num;
    }
    public static void main()
    {
        randomsum obj=new randomsum();
        int sumpe=0;
        int sumpo=0;
        int sumn=0;
        int n=obj.input();
        while(n!=0)
        {
            if(n<0)
            {
                sumn+=n;
            }
            else if(n>0)
            {
                if(n%2==0)
                {
                    sumpe+=n;
                }
                else
                {
                    sumpo+=n;
                }
            }
            else
            {
            }
            n=obj.input();
        }
        System.out.println("Sum of negative numbers is "+sumn);
        System.out.println("Sum of positive odd numbers is "+sumpo);
        System.out.println("SUm of positive even numbers is "+sumpe);
    }
}