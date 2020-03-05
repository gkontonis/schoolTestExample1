package com.pva.education;


import java.util.Scanner;

public class Example2 {

    public static void main (String [] args){
        Example2 a2 = new Example2();

        System.out.println(a2.calcHypo());
    }

    public double calcHypo(){
        double cathetus1, cathetus2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Kathete 1: ");
        cathetus1 = Double.parseDouble(sc.nextLine());
        System.out.print("Kathete 2: ");
        cathetus2 = Double.parseDouble(sc.nextLine());

        return (Math.sqrt(Math.pow(cathetus1, 2) + Math.pow(cathetus2,2)));
    }

}
