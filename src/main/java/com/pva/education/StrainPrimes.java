package com.pva.education;

import java.util.ArrayList;
import java.util.Scanner;

public class StrainPrimes {
    public static void main(String [] args){
        StrainPrimes sp = new StrainPrimes();
        Scanner sc = new Scanner(System.in);
        System.out.print("Max Prime NR Read: ");
        int input = Integer.parseInt(sc.nextLine());
        ArrayList<Boolean> ar = sp.strain(input);

        System.out.println("Primarys are: ");
        for (int i = 0; i <= input - 1; i++){
            if(ar.get(i) == true && i > 1){
                System.out.print(i + ", ");
            }
        }
    }

    public static ArrayList<Boolean> strain(int number){
        ArrayList<Boolean> numberList= new ArrayList<Boolean>();
        for(int i = 0; i<=number; i++){
            numberList.add(i, true);
        }

        for(int i = 2; i<=number; i++){
            if(numberList.get(i) == true){
                int j = i;
                do{
                    j  = j + i;
                    if(j <= number){
                        numberList.set(j, false);
                    }
                }while (j <= number);
            }
        }
        return numberList;
    }
}
