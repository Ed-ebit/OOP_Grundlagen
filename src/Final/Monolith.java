package Final;

import java.util.ArrayList;
import java.util.List;

public class Monolith {

    public static void main(String[] args) {
        List<Calculable> operations = new ArrayList<>();
        operations.add(new Addition());
        operations.add(new Subtraction());
        operations.add(new Multiplication());

        Parseable parser = new Parser();
        RechenWerkable rechenwerk = new RechenWerk(operations);
        //Dependency injection: auf Konstruktoren oder Methoden bezogen. Ordnung des Programms nachvollziehbar machen
        IBMParser ibmParser = new IBMParser(operations);
        
        new CUI(ibmParser, rechenwerk).show();


    }
}
