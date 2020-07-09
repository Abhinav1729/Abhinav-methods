import java.util.Scanner;
public class marks
{
    String name;
    int rn;
    double mat;
    double sci;
    double sst;
    double com;
    double eng;
    double hin;
    double avg;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your full name");
        name=sc.nextLine();
        System.out.println("Enter your roll number");
        rn=sc.nextInt();
        System.out.println("Enter your Maths marks");
        mat=sc.nextInt();
        System.out.println("Enter your Science marks");
        sci=sc.nextInt();
        System.out.println("Enter your Sst marks");
        sst=sc.nextInt();
        System.out.println("Enter your Computer marks");
        com=sc.nextInt();
        System.out.println("Enter your English marks");
        eng=sc.nextInt();
        System.out.println("Enter your Hindi marks");
        hin=sc.nextInt();
        sc.close();
    }
    void calc()
    {
        avg=(mat+sci+sst+com+eng+hin)/6;
        System.out.println("Your average is "+avg);
    }
    public static void main()
    {
        marks obj=new marks();
        obj.init();
        obj.calc();
    }
}