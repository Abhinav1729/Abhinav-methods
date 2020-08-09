import java.util.Scanner;
class busfare
{
    double distance;
    double fare;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Distance travelled?");
        distance=sc.nextDouble();
        sc.close();
    }
    void calc()
    {
        if((distance>0)&&(distance<=1))
        {
            fare=4;
        }
        else if((distance>1)&&(distance<=5))
        {
            fare=4+(distance-1)*4;
        }
        else if((distance>5)&&(distance<=15))
        {
            fare=4+4*4+(distance-5)*6;
        }
        else
        {
            fare=4+4*4+10*6+(distance-15)*8;
        }
    }
    void printfare()
    {
        System.out.println("The bus fare is "+fare+"Rs.");
    }
    public static void main()
    {
        busfare obj=new busfare();
        obj.input();
        obj.calc();
        obj.printfare();
    }
}