package com.pva.education;

import java.util.Random;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args){
        Example8 e8 = new Example8();
        e8.guess();
    }

    public void guess(){
        Random rnd = new Random();
        int random = rnd.nextInt(100);
        System.out.println("Hint: " + random);

        Scanner sc = new Scanner(System.in);
        System.out.print("Input guessed number: ");
        int userinput = Integer.parseInt(sc.nextLine());

        if(random == userinput){
            System.out.println("Your guess is correct!");
        }
        else{
            System.out.println("Sorry, your guess is not correct!");
            System.out.println();

            while (random != userinput){
                if(userinput<random){
                    System.out.println("HIGHER");
                }
                else{
                    System.out.println("LOWER");
                }

                System.out.print("Try again: ");
                userinput = Integer.parseInt(sc.nextLine());
                System.out.println();
            }
            System.out.println("Your guess is correct!");
        }
    }
}