package com.pva.education;

import java.util.Scanner;

public class PrimeChecker {
    private Scanner sc;

    public static void main(String[] args){
        PrimeChecker pc = new PrimeChecker();
        pc.run();

    }
    public  void run(){
        System.out.print("Input number: ");
        sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());

        String msg = "Is";
        for(int i = 2; i < input; i++){
            if(input % i == 0){
                msg = "None";
                break;
            }
        }
        System.out.println(msg + " Prime");
    }
}
//sieb des erostostenes