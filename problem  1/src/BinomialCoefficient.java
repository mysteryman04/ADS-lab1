import java.util.Scanner;

public class BinomialCoefficient {

    public static int compute(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else if (k == 1 || k == n-1) {
            return n;
        } else {
            return compute(n-1, k-1) + compute(n-1, k);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        scanner.close();
        int result = compute(n, k);
        System.out.println(result);
    }
}
