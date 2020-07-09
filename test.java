import java.util.Scanner;
public class test
{
    String c;
    String scan()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("R,P orS");
        c=sc.nextLine();
        sc.close();
        return c;
    }
    public static void main()
    {
        test obj=new test();
        String c1=obj.scan();
        String c2=obj.scan();
        String c3=obj.scan();
        String c4=obj.scan();
        String c5=obj.scan();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        String d="Rock";
        if(c1.compareTo(d)==0)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not equal");
        }
        if(c2.compareTo(d)==0)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not equal");
        }
    }
}