import java.util.Scanner;

public class GCD {
    public static int computeGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return computeGCD(b, a % b);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        int gcd = computeGCD(a, b);
        System.out.println(gcd);
    }
}
