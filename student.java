public class student//board7
{
    void name(String name)
    {
        System.out.println("Name:"+name);
    }
    void rollno(byte rollno)
    {
        System.out.println("Roll number:"+rollno);
    }
    void marks(int maths,int science,int languages,int computer,int sst)
    {
        int average=(maths+science+languages+computer+sst)/5;
        if(average>=90)
        {
            System.out.println("Science with Computers is available for you");
        }
        else if((average<90)&&(average>=80))
        {
            System.out.println("Science without is available for you");
        }
        else if((average<80)&&(average>=70))
        {
            System.out.println("Commerce with Maths is available for you");
        }
        else if((average<70)&&(average>=60))
        {
            System.out.println("Commerce without Maths is available for you");
        }
    }
}