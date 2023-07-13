package com.Challenges;


public class LeapYear {
    public static void main(String[] args) {
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
    }
        public static boolean isLeapYear(int year) {
            if (year < 1 || year > 9999) {
                System.out.println("not leepyear");
                return false;
            } else if (year % 4 == 0) {
                if (year % 100 == 0) {
                    System.out.println("leepyear");
                    return year % 400 == 0;

                } else {
                    System.out.println("not leepyear");
                    return true;
                }
            } else {
                System.out.println("not leepyear");
                return false;

        }
    }
}
