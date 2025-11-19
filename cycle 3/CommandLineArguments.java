class CommandLineArguments
{
    public static void main(String args[])
    {
        int subject1,subject2,total;
        System.out.println("name is "+args[0]);
        subject1 = Integer.parseInt(args[1]);
        subject2 = Integer.parseInt(args[2]);
        total = subject1+subject2;
        System.out.println("Total marks = "+total);
    }
}