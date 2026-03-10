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
    
    public void bevi(){
        if (acqua>=1){
            sete-=10;
            vita+=10;
            acqua--;
        }
    }
    public void mangia(){
        if (cibo>=1){
            fame-=10;
            vita+=15;
            cibo--;
        }
    }
    
    public void checkMod(){
        if(modalityDemon=true){
            //gnomo sparisce
        }
    }
    
    public void scelaPersonaggio(){
        if(modalityDemon==false){
            if(nPersonaggio==1){//gnomo
            vita=50;
            fame=-30;
            sete=-30;
            }
        }
        
        if(nPersonaggio==2){//orco
            vita=100;
            fame=-20;
            sete=0;  
        }
        
        if(nPersonaggio==3){//elfo
            vita=70;
            fame=0;
            sete=0;
        }
        
        else{//minotauro
            vita=110;
            fame=0;
            sete=-20;  
        }
    }
}
