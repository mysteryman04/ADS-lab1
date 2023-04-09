import java.util.Scanner;

public class IsPrime {
    public static boolean isPrime(int n) {
        if(n<2){
            return false;
        }
        if(n==2){
            return true;
        }
        if(n%2==0){
            return false;
        }
        return isPrimeHelper()
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();
        boolean prime = isPrime(n, 2);
        if (prime) {
            System.out.println("prime");
        } else {
            System.out.println("сomposite");
        }
    }
}
