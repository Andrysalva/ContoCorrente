/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiscicontocorrente;

/**
 *
 * @author asalv
 */
public class GestisciContoCorrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContoCorrente c1, c2, c3;
        c1 = new ContoCorrente("Luca");
        c2 = new ContoCorrente("Pippo");
        c3 = new ContoCorrente("Pluto");
        //c1 tutto negli standard
        System.out.println("Saldo c1: "+c1.getSaldo());
        c1.deposito(1000);
        System.out.println("Saldo c1: "+c1.getSaldo());
        boolean prelievo = c1.prelievo(300);
         if(prelievo == false){
            System.out.println("error l'importo è troppo alto rispetto a quanto è depositato");
        }
        System.out.println("Saldo c1: "+c1.getSaldo());
        c1.addInteressi();
        System.out.println("Saldo c1: "+c1.getSaldo());
        c1.stampaListaMovimenti();
        System.out.println("---------------------------------------------------------------------");
        //---------------C2 (niente negli standard) --------------------------// 
        System.out.println("Saldo c2: "+c2.getSaldo());
        c2.deposito(90);
        System.out.println("Saldo c2: "+c2.getSaldo());
        prelievo = c2.prelievo(100);
        if(prelievo == false){
            System.out.println("error l'importo è troppo alto rispetto a quanto è depositato");
        }
        System.out.println("Saldo c2 (prelievo): "+c2.getSaldo());
        c2.addInteressi();
        System.out.println("Saldo c2: "+c2.getSaldo());
        c2.stampaListaMovimenti();  
        System.out.println("---------------------------------------------------------------------");
            //---------------C3 randomico --------------------------// 
        System.out.println("Saldo c3: "+c3.getSaldo());
        c3.deposito((int)(Math.random() * 3000));
        System.out.println("Saldo c3: "+c3.getSaldo());
        prelievo = c3.prelievo((int)(Math.random() * 3000));
        if(prelievo == false){
            System.out.println("error l'importo è troppo alto rispetto a quanto è depositato");
        }
        System.out.println("Saldo c3 (prelievo): "+c3.getSaldo());
        c3.addInteressi();
        System.out.println("Saldo c3: "+c3.getSaldo());
        c3.stampaListaMovimenti();
        System.out.println("---------------------------------------------------------------------");
        ContoCorrente2 c4, c5, c6;
        c4 = new ContoCorrente2("Luca");
        c5 = new ContoCorrente2("Pippo");
        c6 = new ContoCorrente2("Pluto");
        //c4 tutto negli standard
        System.out.println("Saldo c4: "+c4.getSaldo());
        c4.deposito(3000,05,02,2020);
        System.out.println("Saldo c4: "+c4.getSaldo());
        prelievo = c4.prelievo(300,05,02,2020);
         if(prelievo == false){
            System.out.println("error l'importo è troppo alto rispetto a quanto è depositato");
        }
        System.out.println("Saldo c4: "+c4.getSaldo());
        c4.addInteressi();
        System.out.println("Saldo c4: "+c4.getSaldo());
        c4.stampaListaMovimenti();
        System.out.println("---------------------------------------------------------------------");
        //---------------------C5 niente negli standard----------------//
        System.out.println("Saldo c5: "+c5.getSaldo());
        c5.deposito(80,29,06,2012);
        System.out.println("Saldo c5: "+c5.getSaldo());
        prelievo = c5.prelievo(300,01,07,2013);
         if(prelievo == false){
            System.out.println("error l'importo è troppo alto rispetto a quanto è depositato");
        }
        System.out.println("Saldo c5: "+c5.getSaldo());
        c5.addInteressi();
        System.out.println("Saldo c5: "+c5.getSaldo());
        c5.stampaListaMovimenti();
        System.out.println("---------------------------------------------------------------------");
        //---------------------C6 random----------------//
        System.out.println("Saldo c6: "+c6.getSaldo());
        c6.deposito((int)(Math.random() * 3000),(int)(Math.random() * 31),(int)(Math.random() * 12),2022);
        System.out.println("Saldo c6: "+c6.getSaldo());
        prelievo = c6.prelievo((int)(Math.random() * 3000),(int)(Math.random() * 31),(int)(Math.random() * 12),2022);
         if(prelievo == false){
            System.out.println("error l'importo è troppo alto rispetto a quanto è depositato");
        }
        System.out.println("Saldo c6: "+c6.getSaldo());
        c6.addInteressi();
        System.out.println("Saldo c6: "+c6.getSaldo());
        c6.stampaListaMovimenti();
        }
}
