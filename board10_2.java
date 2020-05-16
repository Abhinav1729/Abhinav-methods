public class board10_2
{
    public static void main(String args[])
    {
        for(int i=5;i>=1;i--)
        {
            int count=5;
            for(int j=1;j<=i;j++)
            {
                System.out.print(count+" ");
                count--;
            }
            System.out.println("");
        }
    }
}