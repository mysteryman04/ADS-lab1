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
        return isPrimeHelper(n,3);
    }
    public static boolean isPrimeHelper(int n,int divisor){
        if(divisor>Math.sqrt(n)){
            return true;
        }
        if(n%divisor==0){
            return false;
        }
        return isPrimeHelper(n,divisor+2);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();
        boolean prime = isPrime(n);
        if (prime) {
            System.out.println("prime");
        } else {
            System.out.println("сomposite");
        }
    }
}
