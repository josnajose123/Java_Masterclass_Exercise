package com.Challenges;

public class Pallindrome {
    public static void main(String[] args) {
        isPalindrome(231);
    }
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int temp = number;

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;

        }
        if (temp == reverse) {
            System.out.println("pallindrome");
            return true;
        }
        else {
            System.out.println("not pallindrome");
            return false;
        }
    }
}
