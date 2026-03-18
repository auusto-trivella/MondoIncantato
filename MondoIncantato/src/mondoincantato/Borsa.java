/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mondoincantato;

import java.util.ArrayList;

/**
 *
 * @author trivella.augusto
 */
public class Borsa {
    ArrayList<Cibo> listaCibo= new ArrayList<>();
    ArrayList<Acqua> listaAcqua= new ArrayList<>();
    
    public void aggiungiCibo(Cibo nuovoCibo){
       listaCibo.add(new Cibo());
    }
    
    public Cibo consumaCibo() {
        if (!listaCibo.isEmpty()) {
            return listaCibo.remove(0);
        }
        return null;
    }
    
    public void aggiungiAcqua(Acqua nuovaAcqua){
        listaAcqua.add(new Acqua());
    }
    
    public Acqua consumaAcqua() {
        if (!listaAcqua.isEmpty()) {
            return listaAcqua.remove(0);
        }
        return null;
    }
    
    public int contaAcqua(){
        return listaAcqua.size();
    }
    
    public int contaCibo(){
        return listaCibo.size();
    }
}
