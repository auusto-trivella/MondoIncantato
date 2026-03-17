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
    
    private int evento=0,indiceF=101;
    Random random = new Random();
    
    public int sceltaEvento(){
        evento = random.nextInt(indiceF)+ 1; 
        return evento;
    }
    
    public void oggettiBuoni(boolean lucky,Borsa borsa){
        if(lucky==true){
            if(evento<=30){
                int oggetto = random.nextInt(2); 
            
                if(oggetto==0){
                    //+2 acqua
                }
                else{
                    //+2 cibo
                }
            }
        }
        else{
            if(evento<=25){
                int oggetto = random.nextInt(2); 
            
                if(oggetto==0){
                    //+2 acqua
                }
                else{
                    //+2 cibo
                }
            }
        }    
    }
    
    public void PersonaggiBuoni(Eroe eroe,boolean lucky){
        if(lucky==true){
            if(evento<=60&&evento>30){
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
                    eroe.setSete(eroe.getSete()+20);
                }
                else{//DISSENTERIA
                    eroe.setFame(eroe.getFame()+10);
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
                    eroe.setVita(eroe.getVita()-10);
                }
                else{//DRAGO
                    eroe.setVita(eroe.getVita()-30);
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
