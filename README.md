# ADS-lab1
Temirlan Yermek SE-2218

CheckForDigits: This program checks if a given string contains only digits. It uses recursion to check each character in the string and returns true if all characters are digits, otherwise false.

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

Factorial: This program calculates the factorial of a given integer using recursion. It takes an input from the user and recursively calculates the factorial of the input number.

public static int factorial(int num){
        if(num==0 || num==1){
            return 1;
        }
        else {
            return num*factorial(num-1);
        }
    }
    
    
Fibonacci: This program calculates the nth Fibonacci number using recursion. It takes an input from the user and recursively calculates the nth Fibonacci number.

public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    

IsPrime: This program checks if a given integer is a prime number using recursion. It takes an input from the user and recursively checks if the input number is a prime number.

public static boolean isPrimeHelper(int n,int divisor){
        if(divisor>Math.sqrt(n)){
            return true;
        }
        if(n%divisor==0){
            return false;
        }
        return isPrimeHelper(n,divisor+2);
    }

MinArray: This program finds the minimum element in an array of integers using recursion. It takes an input from the user for the size of the array and the elements of the array, and recursively finds the minimum element in the array.

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

PowerOf: This program calculates the power of a given base raised to a given exponent using recursion. It takes inputs for the base and exponent from the user and recursively calculates the power.

public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            return a * power(a, n - 1);
        }
    }

ReversedArr: This program reverses an array of integers using recursion. It reverses the array in-place using a helper function that uses recursion to swap elements in the array.

public static void reverseHelper(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseHelper(arr, start + 1, end - 1);
    }

GCD: This program calculates the greatest common divisor (GCD) of two given integers using recursion. It takes inputs for two integers from the user and recursively calculates their GCD.

public static int computeGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return computeGCD(b, a % b);
        }
    }

BinomialCoefficient: This program calculates the binomial coefficient of two given integers using recursion. It takes inputs for two integers from the user and recursively calculates their binomial coefficient.

public static int compute(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else if (k == 1 || k == n-1) {
            return n;
        } else {
            return compute(n-1, k-1) + compute(n-1, k);
        }
    }

DecimalToBinary: This program converts a decimal number to its binary representation using recursion. It takes an input for a decimal number from the user and recursively converts it to binary.


public static double average(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } else {
            return (arr[n-1] + (n-1) * average(arr, n-1)) / n;
        }
    }

