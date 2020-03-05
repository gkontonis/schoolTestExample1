package com.pva.education;


import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {
        Example3 a3 = new Example3();
        a3.calc();
    }

    public void calc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eingabe warenwert: ");
        double input = Double.parseDouble(sc.nextLine());

        if (input > 1000) {
            input *= 0.9;
        }
        System.out.println("Der warenwert nach mwst ist " + (input *= 1.2));
    }
}
