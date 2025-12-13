import java.util.Scanner;

public class fq6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double f = sc.nextDouble();
        double c = (f - 32) * 5 / 9;     //c=(f-32)*5/9 fahrenheit to celsius

        System.out.println(c);
    }
}
