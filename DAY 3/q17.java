import java.util.Scanner;
public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (Math.abs(a) % 10 == Math.abs(b) % 10)
            System.out.println("Same last digit");
        else
            System.out.println("Different last digit");
    }
}
