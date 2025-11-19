class one implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++){
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println("e");
        }
        System.out.println("Welcome");
    }
    }
}
class two implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++){
        try
        {
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            System.out.println("e");
        }
        System.out.println("hi");
    }
    }
}
class three implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++){
        try
        {
            Thread.sleep(3000);
        }
        catch(Exception e)
        {
            System.out.println("e");
        }
        System.out.println("good morining");
    }
    }
}
public class pratice
{
    public static void main(String[] args)
    {
        one o1=new one();
        two o2=new two();
        three o3=new three();
        Thread t1=new Thread(o1);
        Thread t2=new Thread(o2);
        Thread t3=new Thread(o3);
        t1.start();
        t2.start();
        t3.start();
    }
}