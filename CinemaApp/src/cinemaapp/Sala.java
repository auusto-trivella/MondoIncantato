/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinemaapp;

/**
 *
 * @author trivella.augusto
 */
public class Sala {

    private Posto[] posti;
    int n=0;

    public Sala(int capacita) {
        this.posti = new Posto[capacita];
        // Manca qualcosa qui?
        for (int i = 0; this.posti.length > i; i++) {
            Posto p= new Posto(n);
            this.posti[i]=p;
            n++;
        }
    }

    public void prenotaPosto(int numero) {
        // C'è un errore logico nell'IF
        if (posti[numero].isOccupato()) {
            
            posti[numero].prenota();
            System.out.println("Posto " + numero + " prenotato!");
        } 
        
        else {
            System.out.println("Errore: Posto già occupato!");
        }
    }
}
