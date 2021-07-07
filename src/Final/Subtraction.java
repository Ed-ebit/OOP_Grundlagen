package Final;

public class Subtraction implements Calculable {
    String operator = "-";

    public Integer rechnen(Formel ergebnisformel) {
        return ergebnisformel.operand1 - ergebnisformel.operand2;
    }

    @Override
    public String getOperator() {
        return this.operator;
    }

    @Override
    public String getParseOperator() {
        return this.getOperator();
    }
}
