package com.Challenges;

public class AreaCalculator {
    public static void main(String[] args) {
        area(5.0);
        area(-1);
        area(5.0, 4.0);
        area(-1.0, 4.0);
    }
    public static  double area(double radius) {
        if (radius < 0) {
            return -1.0;
        } else {
            double r = (3.14 * radius * radius);
            System.out.println(r);
            return r;
        }

    }
    public static  double area(double a,double b) {
        if (a< 0 && b<0) {
            return -1.0;
        } else {
            double ar = (a*b);
            System.out.println(ar);
            return ar;
        }

    }
}
