import java.util.*;
 public class main4 {

    public void add (int arr[])
    {
        for(int i:arr)
        {
           System.out.println(i);
        }
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);        //print array values
        main4 obj = new main4();
        int arr[] = {1,2,3,4,5};
        obj.add(arr);

    }
    
}
