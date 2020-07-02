import java.util.Scanner;
public class mathclasstest
{
    double n1;
    double n2;
    double min;
    double max;
    double abs;
    double rou;
    double sqrt;
    double h;
    double i;
    double j;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        n1=sc.nextDouble();
        System.out.println("Enter second number");
        n2=sc.nextDouble();
        sc.close();
    }
    double minimum()
    {
        min=Math.min(n1,n2);
        return min;
    }
    double maximum()
    {
        max=Math.max(n1,n2);
        return max;
    }
    double absolute1()
    {
        double abs1=Math.abs(n1);
        abs=abs1;
        return abs;
    }
    double absolute2()
    {
        double abs2=Math.abs(n2);
        abs=abs2;
        return abs;
    }
    double round1()
    {
        double rou1=Math.round(n1);
        rou=rou1;
        return rou;
    }
    double round2()
    {
        double rou2=Math.round(n2);
        rou=rou2;
        return rou;
    }
    double squareroot1()
    {
        double sqrt1=Math.sqrt(n1);
        sqrt=sqrt1;
        return sqrt;
    }
    double squareroot2()
    {
        double sqrt2=Math.sqrt(n2);
        sqrt=sqrt2;
        return sqrt;
    }
    public static void main()
    {
        mathclasstest obj=new mathclasstest();
        obj.init();
        double mini=obj.minimum();
        System.out.println("The smaller number is "+mini);
        double maxi=obj.maximum();
        System.out.println("The bigger number is "+maxi);
        double abso1=obj.absolute1();
        System.out.println("The absolute value of n1 is "+abso1);
        double abso2=obj.absolute2();
        System.out.println("The absolute value of n2 is "+abso2);
        double ro1=obj.round1();
        System.out.println("The nearest integer to n1 is "+ro1);
        double ro2=obj.round2();
        System.out.println("The nearest integer to n2 is "+ro2);
        double sqrrt1=obj.squareroot1();
        System.out.println("The square root of n1 is "+sqrrt1);
        double sqrrt2=obj.squareroot2();
        System.out.println("The square root of n2 is "+sqrrt2);
    }
}