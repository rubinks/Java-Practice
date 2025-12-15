import java.util.Scanner;

public class fq12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int surfaceArea = 6 * a * a;
        int volume = a * a * a;
        int perimeter = 12 * a;

        System.out.println("Surface Area = " + surfaceArea);
        System.out.println("Volume = " + volume);
        System.out.println("Perimeter = " + perimeter);
    }
}
