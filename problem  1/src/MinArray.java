import java.util.Scanner;
public class MinArray {
    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int min = findMin(arr, n - 1);
        if (arr[n - 1] < min) {
            min = arr[n - 1];
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n of array:");
        int n= scan.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] =scan.nextInt();
        }
        int min = findMin(arr, n);
        System.out.println(min);
    }
}