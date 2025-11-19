public class pratice2
{
    int pid;
    String pname;
    int page;
    String paddress;
    pratice2(int id,String name)
    {
        pid=id;
        pname=name;
    }
    pratice2(int id,int age)
    {
        pid=id;
        page=age;
    }
    pratice2(int id,String name,int age,String address)
    {
        pid=id;
        pname=name;
        page=age;
        paddress=address;
    }
    void display()
    {
        System.out.println("Id id "+pid);
        System.out.println("Name is "+pname);
        System.out.println("Age is "+page);
        System.out.println("Address is "+paddress);
    }
    public static void main(String[] args)
    {
        pratice2 m=new pratice2(10,"Yeswanth");
        pratice2 m1=new pratice2(10, 20);
        pratice2 m2=new pratice2(10, "Yeswanth", 20, "Attili");
        m.display();
        m1.display();
        m2.display();
    }
}