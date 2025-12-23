import java.util.Scanner;
public class array1 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[]  = {10,20,30,40,50};

        int n = arr.length;
        int ind  = sc.nextInt();

        for(int i=ind;i<n-1;i++)
        {
            arr[i] = arr[i+1];
        }
        for(int i =0;i<n-1;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}