package com.pva.education;

public class Example6 {
    public static void main(String[] args){
        Example6 e6 = new Example6();
        e6.table();
    }
    public  void table(){

        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.print(j*i + "  ");
            }
            System.out.println();
        }
    }
}
