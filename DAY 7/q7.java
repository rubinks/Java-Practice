import java.util.*;
public class q7 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;     ///second smallest element in the array
        
        for(int i=0;i<n;i++)
    {
        if(arr[i]<smallest)
        {
            secondsmallest = smallest;
            smallest = arr[i];
        }
        else if(arr[i]<secondsmallest && arr[i]!=smallest)
        {
            arr[i] = secondsmallest;
        }
    }
        if(secondsmallest == Integer.MAX_VALUE){
            System.out.println("no second element");
        }
        else
            System.out.println(secondsmallest);
        
    }
} 
