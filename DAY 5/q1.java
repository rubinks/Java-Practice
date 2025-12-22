import java.util.Scanner;
public class q1 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);       
        int n = sc.nextInt();
        int a=sc.nextInt();
        char c=(char)a;

      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n;j++)
        {
          if(i+j >= n+1)
          {
            System.out.print(c+" ");
            c++;
          }
          else
          {
            System.out.print("  ");
          }
        }
        System.out.println();
      }
    }
    
}
