/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionalestore;

/**
 *
 * @author trivella.augusto
 */
public class GestionaleStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prodotto p1 = new Prodotto("Smartphone", 500.0, 10);
        Prodotto p2 = new Prodotto("Auricolari", 50.0, 5);
        Carrello mioCarrello = new Carrello();
        mioCarrello.aggiungiProdotto(p1, 4);
        mioCarrello.aggiungiProdotto(p2, 1);
        System.out.println("Totale atteso: 550.0€");
        System.out.println("Totale calcolato: " + mioCarrello.getTotale() +
        "€");
    }
}
    
