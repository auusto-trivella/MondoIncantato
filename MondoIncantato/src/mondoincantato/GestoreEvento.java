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
public class GestoreEvento {
    
    private int evento=0;
    Random random = new Random();
    
    public int sceltaEvento(){
        int evento = random.nextInt(4)+ 1; 
        return evento;
    }
    
    public void oggettiBuoni(){
        if(evento==1){
            int oggetto = random.nextInt(2); 
            
            if(oggetto==0){
                //+2 acqua
            }
            else{
                //+2 cibo
            }
        }
    }
    
        public void PersonaggiBuoni(){
        if(evento==2){
            int persGood = random.nextInt(3); 
            
            if(persGood==0){//FATA
                eroe.vita+=20;
            }
            if(persGood==1){//DRUIDO
                eroe.sete-=20;
            }
            if(persGood==2){//LOCANDIERE
                eroe.fame=-20;
            }
        }
    }
        
    public void imprevisti(){
        if(evento==3){
            int eventoBad = random.nextInt(2); 
            
            if(eventoBad==0){//SICCITA'
                ereo.sete+=20;
            }
            else{//DISSENTERIA
                eroe.fame+=10;
            }
        }
    } 
    
    public void personaggiCattivi(){
        if(evento==4){
            int persBad = random.nextInt(2); 
            
            if(persBad==0){//BANDITO
                eroe.vita-=10;
            }
            else{//DRAGO
                eroe.vita-=30;
            }
        }
    }
}
