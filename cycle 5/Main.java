public class Main 
{
    public static void validity(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("Person is not eligible to vote");
        }
        else
        {
            System.out.println("Person is eligible to vote");
        }
    }
    public static void main(String[] args)
    {
        validity(18);
        System.out.println("rest of the code..");
    }
}
