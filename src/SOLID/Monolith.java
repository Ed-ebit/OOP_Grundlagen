package SOLID;

import java.util.Scanner;

public class Monolith {

    public static void main(String[] args) {
        System.out.println("Bitte Formel eingeben (a+b): ");
        String formel = new Scanner(System.in).nextLine();
        var operanden = formel.split("\\+");
        Integer op1 = Integer.parseInt(operanden[0]);
        Integer op2 = Integer.parseInt(operanden[1]);
        Integer summe = op1 + op2;
        System.out.println("Ergebnis: " + summe);

    }
}
