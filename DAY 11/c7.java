class Demo
{
    void hi()
    {
        System.out.println("Hi in demo class");
    }
}
class Hall extends Demo 
{
    void hi()
    {
        System.out.println("hi in hall class");     //method overriding
    }
}
public class c7
{
    public static void main(String[]args)
    {
        Hall h = new Hall();
        h.hi();
    }
}