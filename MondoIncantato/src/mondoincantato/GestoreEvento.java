/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mondoincantato;

import java.util.Random;

/**
 *
 * @author TRIVELLA.AUGUSTO
 */
public class GestoreEvento {
    private int evento=0;
    
    public int sceltaEvento(){
        Random random = new Random();
        int evento = random.nextInt(4)+ 1; 
        return evento;
    }
    
}
