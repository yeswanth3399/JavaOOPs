class roomdefaultconstructor
{
    int l,b;
    roomdefaultconstructor()
    {
        l=10;
        b=20;
    }
    public void result()
    {
        double area=l*b;
        System.out.println("Area is "+area);
    }
    public static void main(String args[])
    {
        roomdefaultconstructor m=new roomdefaultconstructor();
        m.result();
    }
}