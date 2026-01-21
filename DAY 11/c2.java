class Hall{
    int a =3;
    Hall(int a )
    {
        System.out.print(this.a);         //parameterised constructer
    }
}
public class c2
{
    public static void main(String[]args)
    {
        Hall h = new Hall(5);
    }
}