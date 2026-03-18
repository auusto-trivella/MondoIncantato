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
        evento = random.nextInt(101)+ 1; 
        return evento;
    }
    
    public void oggettiBuoni(boolean lucky,Borsa borsa){
        if(lucky==true){
            if(evento<=30){
                int oggetto = random.nextInt(2); 
            
                if(oggetto==0){
                    for(int i=0;i<2;i++){
                    borsa.aggiungiAcqua();
                    }
                }
                else{
                   for(int i=0;i<2;i++){
                    borsa.aggiungiCibo();
                    }
                }
            }
        }
        else{
            if(evento<=25){
                int oggetto = random.nextInt(2); 
            
                if(oggetto==0){
                    borsa.aggiungiAcqua();
                }
                else{
                    borsa.aggiungiCibo();
                }
            }
        }    
    }
    
    public void PersonaggiBuoni(Eroe eroe,boolean lucky){
        if(lucky==true){
            if(evento<=60&&evento>30){
                int persGood = random.nextInt(3); 
            
                if(persGood==0){//FATA
                    eroe.setVita(eroe.getVita()+22);
                }
                if(persGood==1){//DRUIDO
                    eroe.setSete(eroe.getSete()-22);
                }
                if(persGood==2){//LOCANDIERE
                    eroe.setFame(eroe.getFame()-22);
                }
            }
        }
        else{
            if(evento<=50&&evento>25){
                int persGood = random.nextInt(3); 
                    
                if(persGood==0){//FATA
                    eroe.setVita(eroe.getVita()+20);
                }
                if(persGood==1){//DRUIDO
                    eroe.setSete(eroe.getSete()-20);
                }
                if(persGood==2){//LOCANDIERE
                    eroe.setFame(eroe.getFame()-20);
                }    
            }      
        }
    }
        
    public void imprevisti(Eroe eroe,boolean lucky){
        if(lucky==true){
            if(evento<=85&&evento>60){
                int eventoBad = random.nextInt(2); 
            
                if(eventoBad==0){//SICCITA'
                    eroe.setSete(eroe.getSete()+22);
                }
                else{//DISSENTERIA
                    eroe.setFame(eroe.getFame()+12);
                }
            }
        }
        else{
            if(evento<=75&&evento>50){
                int eventoBad = random.nextInt(2); 
            
                if(eventoBad==0){//SICCITA'
                    eroe.setSete(eroe.getSete()+20);
                }
                else{//DISSENTERIA
                    eroe.setFame(eroe.getFame()+10);
                }
            }
        }
    } 
    
    public void personaggiCattivi(Eroe eroe,boolean lucky){
        if(lucky==true){
            if(evento<=85){
                int persBad = random.nextInt(2); 
            
                if(persBad==0){//BANDITO
                    eroe.setVita(eroe.getVita()-9);
                }
                else{//DRAGO
                    eroe.setVita(eroe.getVita()-27);
                }
            }
        }
        else{
            if(evento<=75){
                int persBad = random.nextInt(2); 
            
                if(persBad==0){//BANDITO
                    eroe.setVita(eroe.getVita()-10);
                }
                else{//DRAGO
                    eroe.setVita(eroe.getVita()-30);
                }
            }
        }
    }
}
