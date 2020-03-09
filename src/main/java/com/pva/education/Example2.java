package com.pva.education;


import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        Example2 calculator = new Example2();

        double cathetus1 = calculator.askForDouble("Cathetus 1: ");
        double cathetus2 = calculator.askForDouble("Cathetus 2: ");
        System.out.println("Result: " + calculator.calcHypothenuse(cathetus1, cathetus2));
    }

    public double calcHypothenuse(double cathetus1, double cathetus2) {
        return (Math.sqrt(Math.pow(cathetus1, 2) + Math.pow(cathetus2, 2)));
        //ohne math sqrt und pow in bsp Sqrt
    }

    private double askForDouble(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        return Double.parseDouble(sc.nextLine());
    }

}
