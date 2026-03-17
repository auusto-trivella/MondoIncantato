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
    
    public void aggiungiCibo(){
        listaCibo.add();
    }
    
    public void togliCibo(){
                if (!listaCibo.isEmpty()) {
            listaCibo.remove(0);
        }
    }
    
    public void aggiungiAcqua(){
        listaAcqua.add();
    }
    
    public void togliAcqua(){
        if (!listaAcqua.isEmpty()) {
            listaAcqua.remove(0);
        }
    }
    
    public int contaAcqua(){
        return listaAcqua.size();
    }
    
    public int contaCibo(){
        return listaCibo.size();
    }
}
