interface Animal
{
    public void animalSound();
    public void sleep();
}
class Dog implements Animal
{
    public void animalSound()
    {
        System.out.println("Barking");
    }
    public void sleep()
    {
        System.out.println("Zzz");
    }
}
class Main
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.animalSound();
        d.sleep();
    }
}