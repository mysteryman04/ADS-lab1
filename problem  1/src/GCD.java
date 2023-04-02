public class GCD {
    public static int computeGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return computeGCD(b, a % b);
        }
    }
    public static void main(String[] args) {
        int a = 32;
        int b = 48;
        int gcd = computeGCD(a, b);
        System.out.println(gcd);
    }
}
