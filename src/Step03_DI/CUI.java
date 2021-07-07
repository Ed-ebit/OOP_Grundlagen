package Step03_DI;

import java.util.Scanner;

public class CUI {
    private Parser parser;
    private RechenWerk rechenwerk;
    public CUI(Parser parser, RechenWerk rechenwerk) {
        this.parser = parser;
        this.rechenwerk = rechenwerk;

    }

    public void show() {
        System.out.println("Bitte Formel eingeben (a+b): ");
        String formel = new Scanner(System.in).nextLine();
        Formel ergebnisformel = parser.parse(formel);

        Integer summe = rechenwerk.rechnen(ergebnisformel);
        System.out.println("Ergebnis: " + summe);
    }
}
