
class Father  //walk
{
    void walk()
    {
        System.err.println("walk");
    }
}
class Child1 extends Father  //walk cook
{
    void cook()
    {
        System.err.println("Cook");                //multiple inheritance  
    }
}
class Child2 extends Father   //walk game
{
    void game()
    {
         System.err.println("Free fire");      //if we take only two classes ,it is hybrid interitance...
    }
}
 public class c5
{
    public static void main(String[] args) {
        System.out.println("child1: ");
        Child1 c1 = new Child1();
        c1.walk();
        c1.cook();
        System.out.println("child2: ");
        Child2 c2 = new Child2();
        c2.walk();
        c2.game();

    }
}