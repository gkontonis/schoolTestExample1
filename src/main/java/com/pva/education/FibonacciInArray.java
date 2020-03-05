package com.pva.education;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciInArray {
    public static void main(String[] args) {
        FibonacciInArray fc = new FibonacciInArray();
        fc.fibonacci(fc.readUserInput());
    }

    public int readUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input how many Fibonacci numbers you want: ");
        int in = Integer.parseInt(sc.nextLine());
        return in;
    }

    public void fibonacci(int in) {
        int[] fibs = new int[in];
        fibs[0] = 0;
        fibs[1] = 1;
        for(int i = 2; i < fibs.length; i++){
            fibs[i] = fibs[i-1] + fibs[i-2];
        }
        System.out.print(Arrays.toString(fibs));
    }
}
