package com.snow.recursive;

public class Factorial {
    public static void main(String[] args) {

        int result = factorial(10);
        System.out.println(result);


    }

    private static int factorial(int num) {

        if (num < 0) {
            return 0;
        }
        if (num < 2) {
            return 1;
        }

        //recursive call
        return num * factorial(num - 1);

    }


}
