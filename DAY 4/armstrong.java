import java.util.Scanner;
public class armstrong {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int temp=n;
        int rev=0;

        while(n>0)
        {
            int rem=n%10;
            rev=rev +(rem*rem*rem);
            n=n/10;
        }
        if(temp==rev)
            System.out.println("Armstrong number");
        else
            System.out.println("Not a Armstrong Number");
            
        
    }
    
}
