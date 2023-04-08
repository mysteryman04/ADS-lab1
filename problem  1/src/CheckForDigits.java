import java.util.Scanner;
public class CheckForDigits {
    public static boolean isAllDigits(String s){
        char c= s.charAt(0);
        if (s.length() == 1) {
            char ch = s.charAt(0);
            return Character.isDigit(ch);
        }
        if (Character.isDigit(c)){
            return isAllDigits(s.substring(1));
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the string:");
        String input= scan.nextLine();
        boolean res=isAllDigits(input);
        System.out.println(res ? "yes":"no");
    }
}