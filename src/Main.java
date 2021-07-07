import java.io.Serializable;

interface Abteilung{

    final String abteilung ="EDV"; //Konstante
    abstract String getAbteilung(); //Deklaration / Abstrakte Methode

}
//Interfaces sind per derf. abstrakte Klassen, können nur Konstanten oder ABSTRAKTE Methoden (also nur Deklarationen) enthalten

    abstract class Mitarbeiter implements Abteilung, Serializable, Cloneable, Comparable {
        static Integer perNr= 1000;
        Integer personalNr;
        String name;

        Mitarbeiter(){
            this.personalNr= perNr;
            ++perNr;
        }

        abstract void einstellung();
        // geschweifte Klammern: Definition (was macht Methode) Semikolon: Methodendeklaration geht nur für abstrakte Methoden
        // Ist quasi eine abstrakte Methode - braucht eine Definition/Körper (in eckigen Klammern) spätestens in einer Erbungsklasse


    }
    class Azubi extends Mitarbeiter{


        @Override
        public String getAbteilung() {
            return null;
        }

        @Override
        void einstellung() {

        }

        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }
    class Chef extends Mitarbeiter{
        @Override
        void einstellung() {

        }

        public String getAbteilung() {
            return null;
        }

        @Override
        public int compareTo(Object o) {
            return 0;
        }
// deshalb muss chef jetzt die Methoden selbst einführen, die in oberer Klasse nur abstrakt existieren

    }
    public class Main {

    public static void main(String[] args) {
	// Abstrakte Klasse versus Interface
        Azubi a = new Azubi();
        System.out.println( "Personalnummer Azubi: " + a.personalNr);
        Chef c = new Chef();
        System.out.println( "Personalnummer Chef: " + c.personalNr);


    }
}
