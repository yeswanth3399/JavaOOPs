class Parent
{
    public void m1()
    {
        System.out.println("Parent Class");
    }
}
class Child extends Parent
    {
    public void m2()
    {
        System.out.println("Child Class");
    }
}
class Single_Inheritance
{
    public static void main(String args[])
    {
        Child c =new Child();
        c.m1();
        c.m2();
    }
}