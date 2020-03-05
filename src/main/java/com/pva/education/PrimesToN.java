package com.pva.education;

import java.util.Scanner;

public class PrimesToN {
    public static void main(String[] args){
        PrimesToN pth = new PrimesToN();
        pth.run();

    }

    public static void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Max Prime NR Read: ");
        int input = Integer.parseInt(sc.nextLine());

        boolean isprime;
        int primecount;
        String foundPrimeNmbrs = "";

        for(int i = 1; i <= input; i++){
            isprime = CheckPrime(i);
            if(isprime){
                foundPrimeNmbrs = foundPrimeNmbrs  + i + ", ";
            }
        }
        System.out.println("Primes from 1 - " + input + " are: ");
        System.out.println(foundPrimeNmbrs);
    }

    public  static boolean CheckPrime(int currentnumber){
        int rest;
        for(int i = 2; i <=currentnumber / 2; i++){
            rest = currentnumber % i;
            if(rest == 0){
                return  false;
            }
        }
        return  true;
    }
}
