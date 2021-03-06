package gestiscicontocorrente;

public class ContoCorrente2 {

    private String intestatario;

    private int saldo;
    
    private OperazioneConto[] movimenti;

    private static int interessi;

    public ContoCorrente2(String nome) {
        this.intestatario = nome;
        this.saldo = 0;
        this.movimenti = new OperazioneConto[40];
        this.interessi = 0;
    }

    public void deposito(int s, int gg, int mm, int aaaa) {
        saldo += s;
        controllaMovimenti(s, gg, mm, aaaa);
    }

    public boolean prelievo(int s, int gg, int mm, int aaaa) {
        if(s<saldo){
            saldo -= s;
            controllaMovimenti(-1*s, gg, mm, aaaa);
            return true;
        }
        else{
            return false;
        }
    }

    public void addInteressi() {
        if(saldo>=100 && saldo<=1000){
            interessi = 2;
            saldo += (saldo * interessi/100);
            System.out.println("Interesse raggiunto");
        }
        else if( saldo > 1000){
            interessi = 4;
            saldo += (saldo * interessi/100);
            System.out.println("Interesse raggiunto");
        }
        else{
             System.out.println("Interesse non raggiunto");
        }
    }

    public int getSaldo() {
        return saldo;
    }

    public void controllaMovimenti(int m, int gg, int mm, int aaaa){
        int i=0;
        boolean sentinella = false;
        while(i<40 && sentinella == false){
           if(movimenti[i] == null){
               movimenti[i]= new OperazioneConto(m,gg,mm,aaaa);
               sentinella = true;
           }
           i++;
        }
    }
    public void stampaListaMovimenti() {
        System.out.println("MOVIMENTI: \n");
        for(int i=0; i<40;i++){
            if(movimenti[i]!= null){
                if(movimenti[i].getImporto()>0){
                    System.out.println("+" + movimenti[i].toString());   
                }
                else if(movimenti[i].getImporto()<0){
                    System.out.println("-" + movimenti[i].toString());
                }
            }
        }
    }
}

