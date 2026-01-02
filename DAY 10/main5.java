import java.util.*;
 public class main5 {

    public int arr_add (int arr[])
    {
        int sum=0;
        for(int i:arr)
        {
           sum+=i;
        }
        return sum;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);        //sum of array values using methods
        main5 obj = new main5();
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int result = obj.arr_add(arr);
        System.out.println(result);
    }
    
}
