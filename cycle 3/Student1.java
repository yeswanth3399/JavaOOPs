class Student1
{
    int sid;
    String sname;
    int age;
    String address;
    Student1(int id ,String name)
    {
        sid=id;
        sname=name;
    }   
    Student1(int id,int ages)
    {
        sid=id;
        age=ages;
    }
    Student1(int id,String name, int ages,String addrs)
    {
        sid=id;
        sname=name;
        age=ages;
        address=addrs;
    }
    public void display()
    {
        System.out.println("student id is:"+sid);
        System.out.println("student name is:"+sname);
        System.out.println("student age is:"+age);
        System.out.println("student address is:"+address);
    }
    public static void main(String args[])
    {
        Student1 m=new Student1(10,"Yeswanth");
        Student1 m1=new Student1(10,20);
        Student1 m2=new Student1(10,"Yeswanth",20,"Attili");
        m.display();
        m1.display();
        m2.display();

    }
}