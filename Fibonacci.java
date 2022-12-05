package com.snow.recursive;

public class Fibonacci {
    public static void main(String[] args) {

        //print first 10 fibonacci numbers
        for(int i = 0; i < 20; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }


    private static int fibonacci(int n) {

        if(n >= 2){
            //recursive calls
            return fibonacci(n - 1) + fibonacci(n -2);

        }else{
            return n;
        }


    }
}
