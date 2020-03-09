package com.pva.education;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Sqrt sq = new Sqrt();
        System.out.println("Restult: " + sq.sqrt(sq.input()));
    }

    private double input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number: ");
        return Double.parseDouble(sc.nextLine());
    }

    private double sqrt(double in) {
        System.out.println("Sqrt of " + in);
        System.out.println();

        double start = (in / 2);
        double reducefactor = 1;

        while (pow(start) > in) {
            start -= reducefactor;
            System.out.println("Partial: " + start + ". Reduce: " + reducefactor);

            if (pow(start) < in) {
                start += reducefactor;
                reducefactor /= 10;
            }
        }

        return start;
    }

    private double pow(double in) {
        return in * in;
    }
}
