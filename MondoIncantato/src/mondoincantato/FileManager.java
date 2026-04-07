/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mondoincantato;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 *
 * @author TRIVELLA.AUGUSTO
 */
public class FileManager {
    
    private static String csvFile = "MondoIncantatoCSV.csv";
    private static String serFile= "MondoIncantatoSER.ser";

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
    
    public static void salvaSer(Contenitore contSer){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serFile))) {
            oos.writeObject(contSer);
        }   catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Gestore caricaSer(Contenitore contSer, Eroe e, Gestore g) throws IOException, ClassNotFoundException {
        Borsa b = new Borsa();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serFile))) {

            contSer = (Contenitore) ois.readObject();

            e.setNome(contSer.getNome());
            e.setVita(contSer.getSalute());
            e.setSete(contSer.getSete());
            e.setFame(contSer.getFame());

            for (int j = 0; j < contSer.getAcqua(); j++) {
                b.aggiungiAcqua();
            }
            for (int k = 0; k < contSer.getCibo(); k++) {
                b.aggiungiCibo();
            }

            g = new Gestore(contSer.getTurno(), false, e, b);
        }
        return g;
    }
}
