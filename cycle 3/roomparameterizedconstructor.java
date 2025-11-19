public class roomparameterizedconstructor 
{
    int l,b;
    roomparameterizedconstructor(int l1,int b1)
    {
        l=l1;
        b=b1;
    }
    public void result()
    {
        double area=l*b;
        System.out.println("Area "+area);
    }    
    public static void main(String args[])
    {
        roomparameterizedconstructor m=new roomparameterizedconstructor(10, 20);
        roomparameterizedconstructor m1=new roomparameterizedconstructor(100, 120);
        m.result();
        m1.result();
    }
}
