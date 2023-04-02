import java.util.Scanner;

public class Check {
    public static boolean isAllDigits(String s) {
        if (s.isEmpty()) {
            return true;
        }
        char c = s.charAt(0);
        if (Character.isDigit(c)) {
            return isAllDigits(s.substring(1));
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean result = isAllDigits(input);
        System.out.println(result ? "Yes" : "No");
    }
}