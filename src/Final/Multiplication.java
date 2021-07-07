package Final;

public class Multiplication implements Calculable{

    @Override
    public Integer rechnen(Formel ergebnisformel) {
        return ergebnisformel.operand1* ergebnisformel.operand2;
    }

    @Override
    public String getOperator() {
        return "*";
    }

    @Override
    public String getParseOperator() {
        return "\\*";
    }
}
