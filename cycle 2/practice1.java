public class practice1 
{
    public static void main(String[] args)
    {
        StringBuffer sb=new StringBuffer("Initial String");
        System.out.println("this is string buffer "+sb);
        System.out.println("The capacity of sb is "+sb.capacity());
        System.out.println("the length of sb is "+sb.length());
        System.out.println("character at index 3 in sb is "+sb.charAt(3));
        sb.setCharAt(3,'x');
        System.out.println("After setting char at index 3 is "+sb);
        sb.append(" I'm appended");
        System.out.println("After appending string is "+sb);
        sb.insert(14," I'm inserted");
        System.out.println("After inserting string is "+sb);
        sb.delete(14,28);
        System.out.println("After deleting is "+sb);
        sb.reverse();
        System.out.println("After reversing is "+sb);
    }    
}
