class Parent1
{
    int var=54;
    Parent1()
    {
        System.out.println("parent class constructor");
    }
    void print()
    {
        System.out.println("print method of parent class");
    }
}
public class Child1 extends Parent1
{
    int var=74;
    void print()
    {
        System.out.println("print method of child class");
    }
    void display()
    {
        System.out.println(var);
        System.out.println(super.var);
        print();
        super.print();
    }
    public static void main(String[] args)
    {
        Child1 obj = new Child1();
        obj.display();
    }
}