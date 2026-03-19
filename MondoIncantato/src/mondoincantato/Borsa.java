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
    ArrayList<Cure> listaCibo= new ArrayList<>();
    ArrayList<Cure> listaAcqua= new ArrayList<>();
    
    public void aggiungiCibo() {
        listaCibo.add(new Cure());
    }
    
    public Cure consumaCibo() {
        if (!listaCibo.isEmpty()) {
            return listaCibo.remove(0);
        }
        return null;
    }
    
    public void aggiungiAcqua() {
        listaAcqua.add(new Cure());
    }

    public Cure consumaAcqua() {
        if (!listaAcqua.isEmpty()) {
            return listaAcqua.remove(0);
        }
        return null;
    }
    
    public int contaAcqua() {
        return listaAcqua.size();
    }
    
    public int contaCibo() {
        return listaCibo.size();
    }
}
