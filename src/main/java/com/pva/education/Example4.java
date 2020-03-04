package com.pva.education;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args){
        Example4 e4 = new Example4();
        e4.calcggT();

    }

    public void calcggT(){
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.print("Input number 1: ");
        int numberOne = Integer.parseInt(sc.nextLine());
        System.out.print("Input number 1: ");
        int numberTwo = Integer.parseInt(sc.nextLine());

        while(numberOne!=numberTwo){
            if(numberOne>numberTwo){
                numberOne = numberOne-numberTwo;
            }
            else{
                numberTwo = numberTwo - numberOne;
            }
        }

        System.out.println("GGT is: " + numberOne);
    }
}
