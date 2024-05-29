package org.example;

public class DebugExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result = add(a, b);
        int result2 = multiply(a,b);
        System.out.println("Result1: " + result);
        System.out.println("Result2: " + result2);
    }

    public static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static int multiply(int x, int y){
        int product = x * y;
        return product;
    }
}

