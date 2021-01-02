package gestiscicontocorrente;

import java.util.GregorianCalendar;

public class OperazioneConto {

    private int importo;

    private GregorianCalendar data;

    public OperazioneConto(int importo, int gg, int mm, int aaaa) {
        this.importo = importo;
        this.data = new GregorianCalendar();
        this.data.set(GregorianCalendar.YEAR, aaaa);
        this.data.set(GregorianCalendar.MONTH, mm);
        this.data.set(GregorianCalendar.DATE, gg);
    }

    public int getImporto(){
        return importo;
    }
    
    public String toString() {
        String ss = new String();
        if(importo>0){
         ss+=importo+"€ "+data.getTime();   
        }
        else{
            ss+=(-1*importo)+"€ "+data.getTime();
        }
        return ss;
    }
}
