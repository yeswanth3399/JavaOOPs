import java.io.*; 
class One implements Runnable 
{ 
    public void run() 
    { 
        for(int i=0;i<5;i++) 
        {    
            try
            { 
                Thread.sleep(1000); 
            } 
            catch(InterruptedException e)
            { 
                System.out.println(e); 
            } 
            System.out.println("Good Morning");
        }
    }
} 
class Two implements Runnable 
{ 
    public void run() 
    { 
        for(int i=0;i<5;i++) 
        { 
            try
            { 
                Thread.sleep(2000); 
            } 
            catch(InterruptedException e) 
            { 
                System.out.println(e); 
            } 
            System.out.println("Hello "); 
        }
    }
} 
class Three implements Runnable 
{ 
public void run() 
{ 
    for(int i=0;i<5;i++) 
    { 
        try
        { 
            Thread.sleep(3000);
 	    } 
        catch(InterruptedException e)
        { 
            System.out.println(e); 
        } 
        System.out.println("Wel come"); 
    }
}
} 
public class ThreadEx3 
{
    public static void main(String[] args) 
    { 
        One ob1=new One(); 
        Two ob2=new Two(); 
        Three ob3=new Three(); 
        Thread t1=new Thread(ob1); 
        Thread t2=new Thread(ob2); 
        Thread t3=new Thread(ob3); 
        t1.start(); 
        t2.start(); 
        t3.start(); 
}
} 
