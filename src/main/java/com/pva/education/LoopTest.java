package com.pva.education;

public class LoopTest {

    public static void main(String[] args){

        for(int i = 0, y = 0; (i<20 /*||*/ && y<10); System.out.println("foo"), i++, y++){

            System.out.println(y + " bar");
        }
    }
}
