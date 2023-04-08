import java.util.Scanner;
public class Factorial{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = scan.nextInt();
        System.out.println(factorial(num));
    }

}
