import java.util.Scanner;

public class PowerOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int a = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int n = scanner.nextInt();
        System.out.println(power(a, n));
    }
    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            return a * power(a, n - 1);
        }
    }
}

