package AufgabenZettel;

import java.util.Scanner;

public class Aufgabe1 {
    static Scanner sc;
    private double output;

    public static void main (String[] args){
        Aufgabe1 a1 = new Aufgabe1();
        double input;
        sc = new Scanner(System.in);

        System.out.print("Geben Sie den Nettobetrag ein, aus dem Sie den Bruttobetrag errechnen wollen: ");
        input = Double.parseDouble(sc.nextLine());

        System.out.println("Der Nettowert " + input + " beträgt " + a1.calcBrutto(input));
    }

    public double calcBrutto(double in){

        //Math.fo
        return output = (in*1.2);

    }
}
