package Step03_DI;

public class RechenWerk {
/*    public Integer addiere(Formel ergebnisformel) {

        return ergebnisformel.operand1+ ergebnisformel.operand2;

    }*/
    public Integer rechnen (Formel ergebnisformel){

        switch (ergebnisformel.operator){
            case "\\+" : return ergebnisformel.operand1 + ergebnisformel.operand2;
            case "\\-" : return ergebnisformel.operand1 - ergebnisformel.operand2;
            default : return 0 ;
        }

    }
}
