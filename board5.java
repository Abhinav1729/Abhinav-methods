public class board5
{
    public static void main(String a,int n)
    {
        if(a=="numerect")
        {
            for(int i=1;i<=n;i++)
            {
                int count=1;
                for(int j=1;j<=i;j++)
                {
                    System.out.print(count+" ");
                    count++;
                }
                System.out.println("");
            }
        }
        else if(a=="charinverse")
        {
            for(int i=n-1;i>=0;i--)
            {
                int alphabet=97;
                for(int j=0;j<=i;j++)
                {
                    System.out.print((char)(alphabet+j)+" ");
                }
                System.out.println("");
            }
        }
        else
        {
            System.out.println("Invalid pattern");
        }
    }
}