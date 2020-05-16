public class board10_1
{
    public static void main()
    {
        int j,c;
        for(j=1;j<=5;j++)
        {
            System.out.print(j+" ");
            c=j;
            for(c=1;c<=j;c++)
            {
                if(c%2 == 0)
                {
                    System.out.print("# ");
                }
                else
                {
                    System.out.print("* ");
                }    
            }
            System.out.println();
        }
    }
}              
