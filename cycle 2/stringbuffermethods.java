public class stringbuffermethods 
{
    public static void main(String[] args)
    {
        StringBuffer sb=new StringBuffer("InitialString");
        System.out.println("This string sb is : "+sb);
        System.out.println("The capacity of the string sb is :"+sb.capacity());
        System.out.println("The length of the sitting sb is : "+sb.length());
        System.out.println("The character at an index of 6 is : "+sb.charAt(6));
        sb.setCharAt(3,'x');
        System.out.println("after setting char X at position 3 : "+sb);
        sb.append(" Im appended ");
        System.out.println("after appending : "+sb);
        sb.insert(13," Hai Inserted ");
        System.out.println("after inserting : "+sb);
        sb.delete(13,17);
        System.out.print("After deleting : "+sb);
        sb.reverse();
        System.out.println("After reversing : "+sb);
    }    
}