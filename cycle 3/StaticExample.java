class StaticExample
{
    static int a=10,b=20;
    static void display()
    {
        int c=a+b;
    System.out.println("addition of two numbers is:"+c);
    }
    public static void main(String args[])
    {
        display();
        System.out.println("Value of A is "+a);
        System.out.println("Value of B is "+b);
    }
}