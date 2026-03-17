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
    private Eroe eroe= new Eroe("nessuno",false,0,0,0,false);
    Random rand= new Random();

    public Gestore( boolean modalityDemon) {
        this.modalityDemon = modalityDemon;
    }
    
    public void bevi(Eroe eroe,Borsa borsa){
        if(borsa.contaAcqua() > 0) {
            borsa.togliAcqua();
            eroe.setSete(eroe.getSete() - 10);
        } 
    }

    public void mangia(Eroe eroe,Borsa borsa){
        if(borsa.contaCibo() > 0) {
            borsa.togliCibo();
            eroe.setFame(eroe.getFame() - 10);
        }    
    }
    
    public void checkMod(){
        modalityDemon=true;
    }
    
    public void sceltaPersonaggio(Eroe eroe) { 
    
        if (modalityDemon == false) {
        
            if (nPersonaggio == 1) { // GNOMO
                eroe = new Eroe("FIZZLE",false,50,-30,-30,false);
            } 
        }    
            else if (nPersonaggio == 2) { // ORCO
                eroe = new Eroe("KORG",false,100,-20,0,false);
            } 
            else if (nPersonaggio == 3) { // ELFO
                eroe = new Eroe("LIRAEL",false,70,0,0,false);
            } 
            else { //MINOTAURO
                eroe = new Eroe("ASTER",false,110,0,-20,false);
            }
         
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
    
    public void usaAbility(boolean ability,String nome,boolean lucky,Borsa borsa){
        if(ability==true){
            if(nome.contains("FIZZLE")){
                lucky=true;
            }
            else if(nome.contains("KORG")){
                for(int i=0;i<2;i++){
                    borsa.aggiungiCibo();
                }
            }
            else if(nome.contains("LIRAEL")){
                eroe.setVita(eroe.getVita()+60);
            }
            else{
                for(int i=0;i<2;i++){
                    borsa.aggiungiAcqua();
                }
            }
        }
    }
}
