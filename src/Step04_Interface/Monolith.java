package Step04_Interface;

public class Monolith {

    public static void main(String[] args) {
        Parseable parser = new Parser();
        RechenWerkable rechenwerk = new RechenWerk();
        //Dependency injection: auf Konstruktoren oder Methoden bezogen. Ordnung des Programms nachvollziehbar machen
        IBMParser ibmParser = new IBMParser();
        
        new CUI(ibmParser, rechenwerk).show();


    }
}
