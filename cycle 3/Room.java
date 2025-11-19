class Room
{
    int l,b;
    Room(int l1,int b1)
    {
        l=l1;
        b=b1;
    }
    void result()
    {
        double area=l*b;
        System.out.println("Area of the rectangle is:"+area);
    }
    public static void main(String args[])
    {
        Room m=new Room(10,20);
        Room m1=new Room(15,25);
        m.result();
    m1.result();
    }
}