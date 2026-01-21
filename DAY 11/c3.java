class Button_phone
{
    void call()
    {
        System.err.println("Ring Ring Ring");             //single level inheritance
    }
}
class Smart_phone extends Button_phone
{
    void message()
    {
         System.err.println("Hi How are You?");
    }
}
public class c3
{
    public static void main(String[] args) {
        Smart_phone sp = new Smart_phone();
        sp.call();
        sp.message();
    }
}