class MethodOverloading
{
    void sum (int a, int b)
    {
        int sum = a+b;
        System.out.println("method sum declared with two integer arguments");
        System.out.println("sum is "+sum);
    }
    void sum (int a, int b, int c)
    {
        int sum= a+b+c;
        System.out.println("this method differs by number of arguments");
        System.out.println("sum is "+sum);  
    }
    void sum (int a, float b)
    {
        float sum= a+b;
        System.out.println("this method differs by type of arguments");
        System.out.println("sum is "+sum);
    }
    void sum (float b, int a)
    {
        float sum;
        sum = a+b;
        System.out.println("this method differs by order of arguments");
        System.out.println("sum is "+sum);
    }
    public static void main (String args[]) 
    {
        MethodOverloading m = new MethodOverloading();
        m.sum(10, 20);
        m.sum(10, 60, 20);
        m.sum(2, 3.4f);
        m.sum(3.6f, 2);
    }
}