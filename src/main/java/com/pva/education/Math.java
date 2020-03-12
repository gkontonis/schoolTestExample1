package com.pva.education;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Math sq = new Math();
        System.out.println("Restult: " + sq.sqrt(sq.input()));
    }

    private double input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number: ");
        return Double.parseDouble(sc.nextLine());
    }

    public double sqrt(double in) {
        //System.out.println("Sqrt of " + in);
        System.out.println();

        double start = findStart(in);
        //return 0d;
//1.1 ... 3 nicht alternierende wurzel finden -> Es gibt keine?

        int reducefactor = 0;

        while (pow(start) > in) {
            double tmp = start;

            start = reduceClean(start, reducefactor);
            //System.out.println("Partial: " + start + ".     Reduce: " + reducefactor);
            if (start > tmp) {
                start = tmp;
                break;
            }

            if (pow(start) < in) {
                start = tmp;
                reducefactor++;
            }
        }
        return start;
    }

    private double pow(double in) {
        return in * in;
    }

    private double findStart(double value) {
        double tmp = value / 2;
        double powtmp = pow(tmp);
        if (powtmp == value) {
            System.out.println("Powerd to : " + powtmp);
            return tmp;
        }
        if (powtmp > value) {
            return decrease(tmp, value);
        }
        return increase(tmp, value);
    }

    private double decrease(double value, double border) {
        double result = 0;

        for (int i = 2; pow(value) > border; i++) {
            result = value;
            value = value * (1 / i);
        }
        System.out.println("decreased to: " + value);
        return result;
    }

    private double increase(double value, double border) {

        while (pow(value) < border) {
            value = increaseClean(value, 1);
        }
        System.out.println("increased to: " + value);
        return value;
    }

    private double reduceClean(double value, int powerOfTen) {
        int power = getPowerOfTen(powerOfTen);
        return ((value * power) - 1) / power;
    }

    private double increaseClean(double value, int powerOfTen) {
        int power = getPowerOfTen(powerOfTen);
        return ((value * power) + 1) / power;
    }

    private int getPowerOfTen(int powerOfTen) {
        int result = 1;
        for (int i = 0; i < powerOfTen; i++) {
            result *= 10;
        }
        return result;
    }

    public double round(double value, int digits) {


        System.out.println("Value: " + value);

        long beforeComma = (long) value;
        System.out.println("Before Comma: " + beforeComma);

        double afterComma = value - beforeComma;
        System.out.println("After Comma: " + afterComma);

        afterComma = moveComma(afterComma, digits + 1); // * 10 um komma nach rechts zu schieben
        System.out.println("After Comma to Real: " + afterComma);

        long afterCommaReal = (long) afterComma;
        System.out.println("After Comma Real: " + afterCommaReal);

        long lastNr = getLastNumber(afterCommaReal);
        System.out.println("getLastNumber: " + lastNr);

        afterCommaReal = (afterCommaReal / 10);

        System.out.println("After Comma Real: " + afterCommaReal);


        if (lastNr > 0 && lastNr < 5) { //abrunden
            afterCommaReal -= 1;
        } else {//aufrunden
            afterCommaReal += 1;
        }

        afterComma = afterCommaReal;

        System.out.println("After Comma: " + afterComma);

        afterComma = moveComma(afterComma, digits * -1); // / 10 um komma wieder zurück nach links zu schieben

        System.out.println("After Comma: " + afterComma);
        System.out.println("Before Comma: " + beforeComma);

        value = beforeComma + afterComma;

        System.out.println("Result: " + value);

        return value;
    }

    public long getLastNumber(long value) {
        //System.out.println("Value: " + value);
        long v1 = (value / 10) * 10;
        //System.out.println("v1: " + v1);
        long result = value - v1;
        //System.out.println("Result: " + result);
        return result;
    }

    public double firstZero2a(double value) {

        double afterComma = removeReal(value);
        long stop = -1;
        int digits = 0;

        while( stop != 0){
            System.out.println("AfterComma: " + afterComma);
            afterComma *= 10;
            stop = ((long)afterComma) % 10;
            digits++;
        }

        System.out.println("AfterComma Pre: " + afterComma);

        afterComma = moveComma(afterComma, digits * (-1));

        System.out.println("AfterComma Post: " + afterComma);

        return getReal(value) + afterComma;
    }

    public double firstZero2(double value) {

        //double afterComma = removeReal(value);
        double afterComma = value;
        long stop = -1;
        int digits = 0;

        while( stop != 0){
            System.out.println("AfterComma: " + afterComma);
            afterComma = moveComma(afterComma, 1);
            stop = getReal(afterComma) % 10;
            digits++;
        }

        afterComma = getReal(afterComma);

        System.out.println("AfterComma Pre: " + afterComma);

        afterComma = moveComma(afterComma, digits * (-1));

        System.out.println("AfterComma Post: " + afterComma);

        return afterComma;
    }

    public double firstZero(double value) {
        System.out.println("Value: " + value);

        double afterComma= removeReal(value);
        long tmp = (long)value; //TODO Store removed reals
        int digits = 0;
        long real = -1;
        long debug = 14;

        while(real != 0){
            System.out.println("Digits: " + digits + "\tReal: " + real + "\tTmp: " + tmp + "\taftercomma: " + afterComma);

            afterComma = moveComma(afterComma, 1);
            System.out.println("aftercomma: " + afterComma);

            real = getReal(afterComma);
            System.out.println("real: " + real);

            tmp = (tmp * 10) + real;
            System.out.println("tmp: " + tmp);

            afterComma = removeReal(afterComma);

            digits++;
        }


        return moveComma(tmp, digits * -1);
    }

    public double moveComma(double value, int digits) {
        if (digits == 0) {
            return value;
        }
        if (digits < 0) {
            return moveCommaLeft(value, digits * -1);
        }
        return moveCommaRight(value, digits);
    }

    private double moveCommaLeft(double value, int digits) {
        for (int i = 0; i < digits; i++) {
            value /= 10;
        }
        return value;
    }

    private double moveCommaRight(double value, int digits) {
        System.out.println("Move left: " + value + " Digits " + digits);
        for (int i = 0; i < digits; i++) {
            value *= 10;
            System.out.println("Move left: " + value);
        }
        return value;
    }



    private double removeReal(double value){
        return value - (double) getReal(value);
    }

    private long getReal(double value){
        return (long) value;
    }
}
