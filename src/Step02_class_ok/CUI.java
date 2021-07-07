package Step02_class_ok;

import java.util.Scanner;

public class CUI {
    public void show() {
        System.out.println("Bitte Formel eingeben (a+b): ");
        String formel = new Scanner(System.in).nextLine();
        Formel ergebnisformel = new Parser().parse(formel);

        Integer summe = new RechenWerk().rechnen(ergebnisformel);
        System.out.println("Ergebnis: " + summe);
    }
}
