public class ReversedArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void reverse(int[] arr) {
        reverseHelper(arr, 0, arr.length - 1);
    }
    public static void reverseHelper(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseHelper(arr, start + 1, end - 1);
    }
}