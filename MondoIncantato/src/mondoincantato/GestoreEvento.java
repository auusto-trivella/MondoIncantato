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
    private String testo="";
    private int evento=0;
    Random random = new Random();
    
    public int sceltaEvento(){
        evento = random.nextInt(101); 
        return evento;
    }
    
    public String oggettiBuoni(boolean lucky,Borsa borsa){
        if(lucky==true){
            if(evento<=30){
                int oggetto = random.nextInt(2); 
            
                if(oggetto==0){
                    for(int i=0;i<2;i++){
                    borsa.aggiungiAcqua();
                    testo= "HAI TROVATO UNA SORGENTE --- +2 ACQUA";
                    }
                }
                else{
                   for(int i=0;i<2;i++){
                    borsa.aggiungiCibo();
                    testo= "HAI TROVATO DELLE MELE --- +2 CIBO";
                    }
                }
            }
        }
        else{
            if(evento<=25){
                int oggetto = random.nextInt(2); 
            
                if(oggetto==0){
                    borsa.aggiungiAcqua();
                    testo= "HAI TROVATO UNA SORGENTE --- +1 ACQUA";
                }
                else{
                    borsa.aggiungiCibo();
                    testo= "HAI TROVATO UNA MELA --- +1 CIBO";
                }
            }
        }    
        return testo;
    }
    
    public String PersonaggiBuoni(Eroe eroe,boolean lucky){
        if(lucky==true){
            if(evento<=60&&evento>30){
                int persGood = random.nextInt(3); 
            
                if(persGood==0){//FATA
                    eroe.setVita(eroe.getVita()+22);
                testo= "HAI TROVATO UNA FATA --- +22 HP";
                }
                if(persGood==1){//DRUIDO
                    eroe.setSete(eroe.getSete()-22);
                    testo= "HAI TROVATO UN DRUIDO --- -22 SETE";
                }
                if(persGood==2){//LOCANDIERE
                    eroe.setFame(eroe.getFame()-22);
                    testo= "HAI TROVATO UN LOCANDIERE --- -22 FAME";
                }
            }
        }
        else{
            if(evento<=50&&evento>25){
                int persGood = random.nextInt(3); 
                    
                if(persGood==0){//FATA
                    eroe.setVita(eroe.getVita()+20);
                    testo= "HAI TROVATO UNA FATA --- +20 HP";
                }
                if(persGood==1){//DRUIDO
                    eroe.setSete(eroe.getSete()-20);
                    testo= "HAI TROVATO UN DRUIDO --- -20 SETE";
                }
                if(persGood==2){//LOCANDIERE
                    eroe.setFame(eroe.getFame()-20);
                    testo= "HAI TROVATO UN LOCANDIERE --- -20 FAME";
                }    
            }      
        }
        return testo;
    }
        
    public String imprevisti(Eroe eroe,boolean lucky){
        if(lucky==true){
            if(evento<=85&&evento>60){
                int eventoBad = random.nextInt(2); 
            
                if(eventoBad==0){//SICCITA'
                    eroe.setSete(eroe.getSete()+20);
                    testo="STAI CAMMINANDO DA TROPPO SOTTO IL SOLE --- +20 SETE";
                }
                else{//DISSENTERIA
                    eroe.setFame(eroe.getFame()+10);
                    testo="STAI CORRENDO DA TROPPO SOTTO IL SOLE --- +10 FAME";
                }
            }
        }
        else{
            if(evento<=75&&evento>50){
                int eventoBad = random.nextInt(2); 
            
                if(eventoBad==0){//SICCITA'
                    eroe.setSete(eroe.getSete()+22);
                    testo="STAI CAMMINANDO DA TROPPO SOTTO IL SOLE --- +22 SETE";
                }
                else{//DISSENTERIA
                    eroe.setFame(eroe.getFame()+12);
                    testo="STAI CORRENDO DA TROPPO SOTTO IL SOLE --- +12 FAME";
                }
            }
        }
        return testo;
    } 
    
    public String personaggiCattivi(Eroe eroe,boolean lucky){
        if(lucky==true){
            if(evento<=85){
                int persBad = random.nextInt(2); 
            
                if(persBad==0){//BANDITO
                    eroe.setVita(eroe.getVita()-9);
                    testo="HAI INCONTRATO UN BANDITO, MA TI SEI BATTUTO BENE --- -9 VITA";
                }
                else{//DRAGO
                    eroe.setVita(eroe.getVita()-27);
                    testo="HAI INCONTRATO UN DRAGO, PER UN PELO --- -27 VITA";
                }
            }
        }
        else{
            if(evento<=75){
                int persBad = random.nextInt(2); 
            
                if(persBad==0){//BANDITO
                    eroe.setVita(eroe.getVita()-10);
                    testo="HAI INCONTRATO UN BANDITO, MA TI SEI BATTUTO BENE --- -10 VITA";
                }
                else{//DRAGO
                    eroe.setVita(eroe.getVita()-30);
                    testo="HAI INCONTRATO UN DRAGO, PER UN PELO --- -30 VITA";
                }
            }
        }
        return testo;
    }
}
