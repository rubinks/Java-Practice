import java.util.*;
public class q6 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;     ///second largest element in the array
        
        for(int i=0;i<n;i++)
    {
        if(arr[i]>largest)
        {
            secondlargest = largest;
            largest = arr[i];
        }
        else if(arr[i]>secondlargest && arr[i]!=largest)
        {
            arr[i] = secondlargest;
        }
    }
        if(secondlargest == Integer.MIN_VALUE)
        {
            System.out.println("no second element");
        }
        else
            System.out.println(secondlargest);
        
    }
} 
