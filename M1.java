import java.util.Scanner;

public class M1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            double  x = scanner.nextInt();
            double y = scanner.nextInt();
            double z = scanner.nextInt();
            // your code goes here
            double i = 400 / x;
            double j = 400 / y;
            double k = 400 / z;
            if (i > j && i > k) {
                System.out.println("ALICE");
            } else if (j > i && j > k) {
                System.out.println("BOB");
            } else if (k > i && k > j) {
                System.out.println("CHARLIE");
            } else {
                System.out.println("IT'S A TIE!");
            }
        }
        scanner.close();
    }
}