package com.pva.education;

import org.w3c.dom.ls.LSOutput;

public class Example5 {
    public static void main(String[] args){
        Example5 e5 = new Example5();
        e5.writeSqrtDoWhile();
        System.out.println();
        e5.writeSqrtWhile();
    }

    public void writeSqrtDoWhile(){
        int i = 1;
        do{
            double value = Math.sqrt(i);
            System.out.println("the Sqrt of "+ i + " is: " + value);
            i++;
        }while(i <= 20);
    }

    public void writeSqrtWhile(){
        int i = 1;
        while(i <= 20){
            double value = Math.sqrt(i);
            System.out.println("the Sqrt of "+ i + " is: " + value);
            i++;
        }
    }
}
