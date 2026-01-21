public class c6
{
    static void add(int a)
    {
        System.out.println("Integer value is "+a);
    }
    static void add(char a)
    {
        System.out.println("Character value is "+a);      //method overloading..  if we give char or integer.it will automatically choose class
    }                                                     //runtime polymorphism

    public static void main(String[] args) {
        add(24);
    }
}
