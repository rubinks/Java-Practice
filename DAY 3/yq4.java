import java.util.Scanner;

public class yq4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year1 = sc.nextInt();
        int year2 = sc.nextInt();

        if (year1 % 10 == year2 % 10)
            System.out.println("Same last digit");
        else
            System.out.println("Different last digit");
    }
}
