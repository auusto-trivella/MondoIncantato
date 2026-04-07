/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mondoincantato;

import java.util.Random;

/**
 *
 * @author trivella.augusto
 */
public class Gestore {
    private int nPersonaggio;
    private boolean modalityDemon;
    private Eroe eroe= new Eroe("nessuno",false,0,0,0,true);
    Random rand= new Random();

    public Gestore( boolean modalityDemon) {
        this.modalityDemon = modalityDemon;
    }
    
    public void bevi(Eroe eroe,Borsa borsa){
        if(borsa.contaAcqua() > 0) {
            borsa.consumaAcqua();
            eroe.setSete(eroe.getSete() - 10);
        } 
    }

    public void mangia(Eroe eroe,Borsa borsa){
        if(borsa.contaCibo() > 0) {
            borsa.consumaCibo();
            eroe.setFame(eroe.getFame() - 10);
        }    
    }
    
    public void setMod(boolean val){
        modalityDemon=val;
    }
    
    public Eroe sceltaPersonaggio() { 
    
        if (modalityDemon == false) {
            
        if (nPersonaggio == 1) { // GNOMO
            eroe = new Eroe("FIZZLE", false, 50, -30, -30, true);
        } 
        else if (nPersonaggio == 2) { // ORCO
            eroe = new Eroe("KORG", false, 100, -20, 0, true);
        } 
        else if (nPersonaggio == 3) { // ELFO
            eroe = new Eroe("LIRAEL", false, 70, 0, 0, true);
        } 
        else if (nPersonaggio == 4) { // MINOTAURO
            eroe = new Eroe("ASTER", false, 110, 0, -20, true);
        }
    } 
    else { 
        if (nPersonaggio == 2) {
            eroe = new Eroe("KORG", false, 100, -20, 0, true);
        } 
        else if (nPersonaggio == 3) {
            eroe = new Eroe("LIRAEL", false, 70, 0, 0, true);
        } 
        else {
            eroe = new Eroe("ASTER", false, 110, 0, -20, true);
        }
    }
         return eroe;
    }
    
    public void setnPersonaggio(int n) {
        this.nPersonaggio = n;
    }
    
     public boolean abilitySpecial(boolean ability){
        int possibility= rand.nextInt(11)+ 1; 
        
        if(possibility<=2){
            ability=true;
        }
        else{
            ability=false;
        }
        return ability;
    }
     
    public void usaAbility(Eroe eroe, Borsa borsa) {
        if (eroe.isAbility()) {
            if (eroe.getNome().contains("FIZZLE")) {
                eroe.setLucky(true);
            } else if (eroe.getNome().contains("KORG")) {
                for (int i = 0; i < 2; i++) {
                    borsa.aggiungiCibo();
                }
            } else if (eroe.getNome().contains("LIRAEL")) {
                eroe.setVita(eroe.getVita() + 60);
            } else {
                for (int i = 0; i < 2; i++) {
                    borsa.aggiungiAcqua();
                }
            }
        }
        eroe.setAbility(false);
    }
}
