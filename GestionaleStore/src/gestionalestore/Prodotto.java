/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionalestore;

/**
 *
 * @author trivella.augusto
 */
public class Prodotto {

    private String nome;
    private double prezzo;
    private int quantitaMagazzino;

    public Prodotto(String nome, double prezzo, int quantitaMagazzino) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantitaMagazzino = quantitaMagazzino;
    }

    public void riduciScorta(int qta) {
        this.quantitaMagazzino = this.quantitaMagazzino - qta;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getQuantitaMagazzino() {
        return quantitaMagazzino;
    }
}
