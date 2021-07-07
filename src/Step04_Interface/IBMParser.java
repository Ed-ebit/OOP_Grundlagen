package Step04_Interface;

public class IBMParser implements Parseable{
    public Formel parse(String formel) {
        Formel ergebnisformel = new Formel();
        if (formel.contains("+")){
            ergebnisformel.operator = "\\+";
        }
        else if (formel.contains("-")){
            ergebnisformel.operator = "\\-";
        }
        var operanden = formel.split(ergebnisformel.operator);// New :D

        ergebnisformel.operand1 = Integer.parseInt(operanden[0].trim());
        ergebnisformel.operand2 = Integer.parseInt(operanden[1].trim());
        return ergebnisformel;
    }
}