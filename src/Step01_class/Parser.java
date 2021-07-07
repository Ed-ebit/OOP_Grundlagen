package Step01_class;

public class Parser {
    public Formel parse(String formel) {
        Formel ergebnisformel = new Formel();
        var operanden = formel.split("\\+");
        ergebnisformel.operand1 = Integer.parseInt(operanden[0]);
        ergebnisformel.operand2 = Integer.parseInt(operanden[1]);
        return ergebnisformel;
    }
}
