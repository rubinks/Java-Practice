import java.util.*;
 public class main2 {

    public int add (int a,int b)
    {
        return a+b;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        main2 obj = new main2();
        System.out.println(obj.add(a,b));
    }
    
}
