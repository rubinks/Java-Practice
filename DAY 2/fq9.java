import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int breadth = sc.nextInt();        //perimeter of rectangle

        int perimeter = 2 * (length + breadth);
        System.out.println(perimeter);
    }
}
