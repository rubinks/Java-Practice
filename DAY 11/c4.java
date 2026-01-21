
class Landline  //call
{
    void call()
    {
        System.err.println("Ring Ring Ring");
    }
}
class Button_phone extends Landline   //call message
{
    void message()
    {
        System.err.println("How Are You?");                //multilevel inheritance
    }
}
class Smart_phone extends Button_phone   //call message game
{
    void game()
    {
         System.err.println("Free fire"); 
    }
}
public class c4
{
    public static void main(String[] args) {
        Smart_phone sp = new Smart_phone();
        sp.call();
        sp.message();
        sp.game();
    }
}