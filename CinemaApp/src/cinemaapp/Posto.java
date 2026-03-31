/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinemaapp;

/**
 *
 * @author trivella.augusto
 */
public class Posto {

    private int numero;
    private boolean occupato;

    public Posto(int numero) {
        this.numero = numero;
        this.occupato = false;
    }

    public void prenota() {
        this.occupato = true;
    }

    public boolean isOccupato() {
        return occupato;
    }
}
