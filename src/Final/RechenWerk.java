package Final;

import java.util.List;

public class RechenWerk implements RechenWerkable {

    List<Calculable> operations;
    public RechenWerk(List<Calculable> operations) {
        this.operations=operations;
    }

    /*    public Integer addiere(Formel ergebnisformel) {

            return ergebnisformel.operand1+ ergebnisformel.operand2;

        }*/
    public Integer rechnen (Formel ergebnisformel){

        for (var op:this.operations){
            if(ergebnisformel.operator.equals(op.getOperator())){
                return op.rechnen(ergebnisformel);
            }
        }
        return 0;
    }
}
