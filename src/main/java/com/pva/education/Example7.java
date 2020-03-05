package com.pva.education;

import java.util.Scanner;

public class Example7 {
    private static Scanner sc;

    public static void main(String[] args) {
        Example7 e7 = new Example7();
        sc = new Scanner(System.in);
        System.out.print("Input  max nr: ");
        int input = Integer.parseInt(sc.nextLine());
        e7.search(input);

    }

    public void search(int number) {
        // int a, b, c = 0;

        for (int a = 1; a <= number; a++) {

            for (int b = 1; b <= number; b++) {

                for (int c = 1; c <= number; c++) {

                    if ((a * a) + (b * b) == (c * c)) {
                        System.out.println("a: " + a + " || b: " + b + " || c: " + c);
                        System.out.println();
                    }
                }
            }
        }

    }

}
