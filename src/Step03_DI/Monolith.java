package Step03_DI;

public class Monolith {

    public static void main(String[] args) {
        Parser parser = new Parser();
        RechenWerk rechenwerk = new RechenWerk();
        //Dependency injection: auf Konstruktoren oder Methoden bezogen. Ordnung des Programms nachvollziehbar machen
        
        new CUI(parser, rechenwerk).show();


    }
}
