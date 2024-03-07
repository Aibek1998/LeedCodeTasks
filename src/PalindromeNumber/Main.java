package PalindromeNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        int number1 = x;
        int number2 = 0;
        while (number1 > 0) {
            number2 = number2 * 10 + number1 % 10;
            number1 /= 10;
        }
        return number2 == x;
    }
}
