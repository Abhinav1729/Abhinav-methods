class rectangle1
{
    int num1,num2,ans;
    void input(int n1,int n2)
    {
        num1=n1;
        num2=n2;
    }
    void calc()
    {
        ans=num1*num2;
    }
    void display()
    {
        System.out.println("the area is "+ans);
    }
}