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
    private Eroe eroe= new Eroe("nessuno",false,0,0,0);

    public Gestore(int cibo, int acqua, boolean modalityDemon) {
        this.cibo = cibo;
        this.acqua = acqua;
        this.modalityDemon = modalityDemon;
    }
    
    public void bevi(){
        if (acqua>=1){
            eroe.sete-=10;
            eroe.vita+=10;
            acqua--;
        }
    }
    public void mangia(){
        if (cibo>=1){
            eroe.fame-=10;
            eroe.vita+=15;
            cibo--;
        }
    }
    
    public void checkMod(){
        modalityDemon=true;
    }
    
    public void sceltaPersonaggio() { 
    
        if (modalityDemon == false) {
        
            if (nPersonaggio == 1) { // GNOMO
                eroe = new Eroe("FIZZLE",false,50,-30,-30);
            } 
        }    
            else if (nPersonaggio == 2) { // ORCO
                eroe = new Eroe("KORG",false,100,-20,0);
            } 
            else if (nPersonaggio == 3) { // ELFO
                eroe = new Eroe("LIRAEL",false,70,0,0);
            } 
            else { //MINOTAURO
                eroe = new Eroe("ASTER",false,110,0,-20);
            }
         
    }
}
