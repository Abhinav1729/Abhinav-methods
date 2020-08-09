import java.util.Scanner;
class personalinfo
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter your zodiac sign");
        String zodiac=sc.nextLine();
        System.out.println("Enter your weight");
        double weight=sc.nextDouble();
        System.out.println("Enter your lucky number");
        int luck=sc.nextInt();
        sc.close();
        System.out.println("Name: "+name);
        System.out.println("Zodiac sign: "+zodiac);
        System.out.println("Weight: "+weight+" kg");
        System.out.println("Lucky number: "+luck);
    }
}