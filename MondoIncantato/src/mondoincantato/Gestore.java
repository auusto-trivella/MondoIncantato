/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mondoincantato;

/**
 *
 * @author trivella.augusto
 */
public class Gestore {
    private int cibo,acqua,nPersonaggio;
    private boolean modalityDemon;

    public Gestore(int cibo, int acqua, boolean modalityDemon) {
        this.cibo = cibo;
        this.acqua = acqua;
        this.modalityDemon = modalityDemon;
    }
    /*
    public void bevi(Eroe eroe){
        if (acqua>=1){
            eroe.sete-=10;
            eroe.vita+=10;
            acqua--;
        }
    }
    public void mangia(Eroe eroe){
        if (cibo>=1){
            eroe.fame-=10;
            eroe.vita+=15;
            cibo--;
        }
    }
    
    public void checkMod(){
        if(modalityDemon=true){
            //gnomo sparisce
        }
    }
    
    public void sceltaPersonaggio(Eroe eroe) { 
    
        if (modalityDemon == false) {
        
            if (nPersonaggio == 1) { // GNOMO
                eroe.setVita(50);
                eroe.setFame(-30);
                eroe.setSete(-30);
            } 
            else if (nPersonaggio == 2) { // ORCO
                eroe.setVita(100);
                eroe.setFame(-20);
                eroe.setSete(0);
            } 
            else if (nPersonaggio == 3) { // ELFO
                eroe.setVita(70);
                eroe.setFame(0);
                eroe.setSete(0);
            } 
            else { 
                eroe.setVita(110);
                eroe.setFame(0);
                eroe.setSete(-20);
            }
        } 
    }*/
}
