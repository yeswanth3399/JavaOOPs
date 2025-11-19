class Student
{
    int id;
    String name;
    int age;
    Student(int id ,String name , int age)
    {
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public void display()
    {
        System.out.println("Roll Number:"+id);
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
    public static void main(String args[])
    {
        Student s1=new Student(111,"Vasavi",30);
        Student s2=new Student(123,"Yeswanth",25);
        s1.display();
        s2.display();   
    }
}
