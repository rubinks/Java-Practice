import java.util.*;
public class main8
{
    public int fact(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }

    public static void main(String[]args)        //factorial of number using recursion
    {
        Scanner sc = new Scanner(System.in);
        main8 obj = new main8();
        int n = sc.nextInt();
        System.out.println(obj.fact(n));
    }
}