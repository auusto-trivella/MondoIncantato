/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionalestore;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trivella.augusto
 */
public class Carrello {

    private List<Prodotto> articoli = new ArrayList<>();
    private double totalePagamento = 0;

    public void aggiungiProdotto(Prodotto p, int qtaRichiesta) {
        if (p.getQuantitaMagazzino() >= qtaRichiesta) {
            articoli.add(p);
            p.riduciScorta(qtaRichiesta);
            calcolaTotale();
        }
    }

    private void calcolaTotale() {
        totalePagamento=0;
        for (Prodotto p : articoli) {
            totalePagamento += p.getPrezzo();
        }
    }

    public double getTotale() {
        return totalePagamento;
    }
}
