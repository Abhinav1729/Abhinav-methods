import java.util.Scanner;
class temperature
{
    double f;
    double c;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in fahrenhiet scale");
        f=sc.nextDouble();
        sc.close();
    }
    void convert()
    {
        c=((f-32)*5)/9;
        System.out.println("Temperature in celsius is "+c+" °C");
    }
    public static void main()
    {
        temperature obj=new temperature();
        obj.input();
        obj.convert();
    }
}