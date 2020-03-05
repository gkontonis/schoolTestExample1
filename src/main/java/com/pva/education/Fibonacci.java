package com.pva.education;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci fc = new Fibonacci();
        fc.fibonacci(fc.readUserInput());
    }

    public int readUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input how many Fibonacci numbers you want: ");
        int in = Integer.parseInt(sc.nextLine());
        return in;
    }

    public void fibonacci(int input) {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < input; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
