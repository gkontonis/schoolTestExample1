package com.pva.education;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Random;
import java.util.Scanner;

public class QueensOneDimension {

    public static void main(String[] args) {
        QueensOneDimension qod = new QueensOneDimension();
        //qod.checkCollisions(qod.insertQueensInArray(qod.howmanyqueens()));
        int input = qod.howmanyqueens();
        Boolean[] playfield = qod.insertQueensInArray(input);
        qod.checkCollisions(playfield, input);
    }

    private int howmanyqueens() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How big u want your array? (= Queens on table): ");
        int input = Integer.parseInt(sc.nextLine());
        return input;
    }

    private Boolean[] insertQueensInArray(int in) {
        Boolean[] field = new Boolean[in * in];
        Random rnd = new Random();

        for (int i = 0; i < in; i++) {
            int randomIndex = rnd.nextInt(field.length - 1);

            if (field[randomIndex] == null) {
                field[randomIndex] = true;
                continue;
            }
            i--;
        }
        return field;
    }

    private boolean checkCollisions(Boolean[] playfield, int sidelength) {
        for (int i = 0; i < playfield.length; i++) {

            if (playfield[sidelength] == playfield[i]) {
                return false;
            }
        }
    }

    private int countQueens(int line){
        
        return  counter;
    }

}
