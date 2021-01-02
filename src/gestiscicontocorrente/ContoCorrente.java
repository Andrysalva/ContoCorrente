package gestiscicontocorrente;

public class ContoCorrente {

    private String intestatario;

    private int saldo;

    private int[] movimenti;

    private static int interessi;

    public ContoCorrente(String nome) {
        this.intestatario = nome;
        this.saldo = 0;
        this.movimenti = new int[40];
        this.interessi = 0;
    }

    public void deposito(int s) {
        saldo += s;
        controllaMovimenti(s);
    }

    public boolean prelievo(int s) {
        if(s<saldo){
            saldo -= s;
            controllaMovimenti(-1*s);
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

    public void controllaMovimenti(int m){
        int i=0;
        boolean sentinella = false;
        while(i<40 && sentinella == false){
           if(movimenti[i] == 0){
               movimenti[i]= m;
               sentinella = true;
           }
           i++;
        }
    }
    public void stampaListaMovimenti() {
        System.out.println("\nMOVIMENTO");
        for(int i=0; i<40;i++){
            if(movimenti[i]>0){
                System.out.println("+" + movimenti[i]+ "€");
            }
            else if(movimenti[i]<0){
                System.out.println("-" + movimenti[i]*(-1) + "€");
            }
        }
    }
}
