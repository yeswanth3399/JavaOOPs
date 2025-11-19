public class pratice3 
{
    void sum(int a,int b)
    {
        int sum=a+b;
        System.out.println("This method is declared with two arguments");
        System.out.println("Addition is "+sum);
    }    
    void sum(int a,int b,int c)
    {
        int sum=a+b+c;
        System.out.println("This method is declared with three arguments");
        System.out.println("Addition is "+sum);
    }
    void sum(int a,float b)
    {
        float sum=a+b;
        System.out.println("This method is declared with two differet type of arguments");
        System.out.println("Addition is "+sum);
    }
    void sum(float a,int b)
    {
        float sum=a+b;
        System.out.println("This *****");
        System.out.println("addition is "+sum);
    }
    public static void main(String[] args)
    {
        pratice3 m=new pratice3();
        m.sum(10,20);
        m.sum(10,20,30);
        m.sum(10,2.3f);
        m.sum(3.4f,20);
    }
}
