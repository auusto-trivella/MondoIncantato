/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mondoincantato;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author TRIVELLA.AUGUSTO
 */
public class FileManager {
    
    private static String csvFile = "MondoIncantato.csv";

    public static void salvaCsv(Turno t,Borsa b,Eroe e) throws IOException {
        var studenti = Arrays.asList(
                new String[]{"NOME", "VITA", "SETE","FAME","CIBO","ACQUA","TURNO"},
                new String[]{e.getNome()+"", e.getVita()+"", e.getSete()+"",e.getFame()+"",b.contaCibo()+"",b.contaAcqua()+"",t.getnTurno()+""}
        );
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile))) {
            for (String[] studente : studenti) {
                writer.write(String.join(",", studente));
                writer.newLine();
            }
        }
    }
    public static Gestore caricaCsv(Borsa b, Eroe e, Gestore g) throws FileNotFoundException, IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
            String line;
            reader.readLine();
            
            while ((line = reader.readLine()) != null) {
                String[] colonne = line.split(",");
                String nome = colonne[0];
                int vita = Integer.parseInt(colonne[1]);
                int sete = Integer.parseInt(colonne[2]);
                int fame = Integer.parseInt(colonne[3]);
                int cibo = Integer.parseInt(colonne[4]);
                int acqua = Integer.parseInt(colonne[5]);
                int turno = Integer.parseInt(colonne[6]);
                
                int i=0,j=0;
                while(i<acqua){
                    i++;
                    b.aggiungiAcqua();
                }
                
                while(j<cibo){
                    j++;
                    b.aggiungiCibo();
                }
                e = new Eroe(nome,false,vita,fame,sete,true);
                g= new Gestore(0,false,e,b);
            }
        }
        return g;
    }

}
