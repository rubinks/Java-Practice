import java.util.Scanner;

public class fq14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();

        double surfaceArea = 4 * Math.PI * r * r;
        double volume = (4.0 / 3) * Math.PI * r * r * r;

        System.out.println("Surface Area = " + surfaceArea);
        System.out.println("Volume = " + volume);
    }
}
