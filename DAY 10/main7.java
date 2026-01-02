import java.util.*;
 public class main7 {

    
    public void arr_add (int arr[][], n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j || i+j==n-1)
                {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);        //sum of array values using methods
        main7 obj = new main7();
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        obj.arr_add(arr,n);
    }
    
}
