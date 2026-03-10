/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mondoincantato;

<<<<<<< HEAD
/**
 *
 * @author trivella.augusto
 */
public class GestoreEvento {
=======
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
>>>>>>> 2e98cea65d916082325d685ad4b9ecd650b22a8d
    
}
