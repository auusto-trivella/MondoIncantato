/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mondoincantato;

import java.io.IOException;

/**
 *
 * @author TRIVELLA.AUGUSTO
 */
public class Turno extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Turno.class.getName());

    /**
     * Creates new form Turno
     */
    
    private Borsa b;
    private Eroe e;
    private GestoreEvento ge;
    private Gestore g; 
    private int nTurno=0;
    private Contenitore contSer;
    public Turno() {
        initComponents();
        e= new Eroe("nessuno",false,0,0,0,true);
        ge = new GestoreEvento();
        b= new Borsa();
        g= new Gestore(0,false,e,b);
        
    }
    
    public void setEroe(Eroe nuovoEroe) {
        this.e = nuovoEroe;
        
        if (this.e != null) {
            stazEroe(); 
        }
        String nome = e.getNome();
        String file = "";

        if (nome.equals("FIZZLE")) {
            file = "/mondoincantato/fizzle.png";
        } 
        else if (nome.equals("KORG")) {
            file = "/mondoincantato/korg.png";
        } 
        else if (nome.equals("LIRAEL")) {
            file = "/mondoincantato/lirael.png";
        } 
        else {
            file = "/mondoincantato/aster.png";
        }
        
        java.net.URL url = getClass().getResource(file);
        if (url != null) {
            personaggio.setIcon(new javax.swing.ImageIcon(url));
        }
    }

    public void inventario(){
        
    valCibo.setText("" + b.contaCibo()); 
    valAcqua.setText("" + b.contaAcqua());
    
    valSalute.setText("" + e.getVita());
    valFame.setText("" + e.getFame());
    valSete.setText("" + e.getSete());
    }
    
    
    public void stazEroe() {

        valSalute.setText("" + e.getVita());
        valSete.setText("" + e.getSete());
        valFame.setText("" + e.getFame());
    }

    public int getnTurno() {
        return nTurno;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ability = new javax.swing.JButton();
        mangia = new javax.swing.JButton();
        bevi = new javax.swing.JButton();
        esplora = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        valSalute = new javax.swing.JLabel();
        valFame = new javax.swing.JLabel();
        valSete = new javax.swing.JLabel();
        saveCsv = new javax.swing.JButton();
        caricaCsv = new javax.swing.JButton();
        saveSer = new javax.swing.JButton();
        caricaSer = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        turno = new javax.swing.JLabel();
        personaggio = new javax.swing.JLabel();
        eventiImg = new javax.swing.JLabel();
        valAcqua = new javax.swing.JLabel();
        storia = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        testoStoria = new javax.swing.JTextArea();
        valCibo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        valSalute1 = new javax.swing.JLabel();
        valSalute2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ability.setBackground(new java.awt.Color(160, 130, 60));
        ability.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ability.setText("ABILITY");
        ability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abilityActionPerformed(evt);
            }
        });
        getContentPane().add(ability, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 560, -1, -1));

        mangia.setBackground(new java.awt.Color(145, 140, 125));
        mangia.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        mangia.setForeground(new java.awt.Color(230, 225, 210));
        mangia.setText("MANGIA");
        mangia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mangiaActionPerformed(evt);
            }
        });
        getContentPane().add(mangia, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 635, -1, 50));

        bevi.setBackground(new java.awt.Color(145, 140, 125));
        bevi.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bevi.setForeground(new java.awt.Color(230, 225, 210));
        bevi.setText("BEVI");
        bevi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beviActionPerformed(evt);
            }
        });
        getContentPane().add(bevi, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 710, -1, 50));

        esplora.setBackground(new java.awt.Color(160, 130, 60));
        esplora.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        esplora.setText("<html>E<br>S<br>P<br>L<br>O<br>R<br>A</html>");
        esplora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esploraActionPerformed(evt);
            }
        });
        getContentPane().add(esplora, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 560, 60, 200));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("FAME-->");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 600, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("SETE-->");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 670, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("SALUTE-->");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, -1, -1));

        valSalute.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        valSalute.setText("0");
        getContentPane().add(valSalute, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, -1, -1));

        valFame.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        valFame.setText("0");
        getContentPane().add(valFame, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 600, -1, -1));

        valSete.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        valSete.setText("0");
        getContentPane().add(valSete, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 670, -1, -1));

        saveCsv.setText("SALVA CSV");
        saveCsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCsvActionPerformed(evt);
            }
        });
        getContentPane().add(saveCsv, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        caricaCsv.setText("CARICA CSV");
        caricaCsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caricaCsvActionPerformed(evt);
            }
        });
        getContentPane().add(caricaCsv, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        saveSer.setText("SALVA SER");
        saveSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveSerActionPerformed(evt);
            }
        });
        getContentPane().add(saveSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        caricaSer.setText("CARICA SER");
        caricaSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caricaSerActionPerformed(evt);
            }
        });
        getContentPane().add(caricaSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TURNO-->");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        turno.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        turno.setForeground(new java.awt.Color(255, 255, 255));
        turno.setText("0");
        getContentPane().add(turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        personaggio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mondoincantato/fizzle.png"))); // NOI18N
        personaggio.setText("jLabel8");
        getContentPane().add(personaggio, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 180, 474, 352));

        eventiImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mondoincantato/caricamento.png"))); // NOI18N
        eventiImg.setText("jLabel9");
        getContentPane().add(eventiImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 630, 352));

        valAcqua.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        valAcqua.setText("0");
        getContentPane().add(valAcqua, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 710, 50, -1));

        testoStoria.setColumns(20);
        testoStoria.setRows(5);
        jScrollPane1.setViewportView(testoStoria);

        storia.setViewportView(jScrollPane1);

        getContentPane().add(storia, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 90, 320, 430));

        valCibo.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        valCibo.setText("0");
        getContentPane().add(valCibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 640, 50, -1));

        jLabel10.setForeground(new java.awt.Color(230, 225, 210));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mondoincantato/turno-img.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -180, 1400, 1200));

        valSalute1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        valSalute1.setText("0");
        getContentPane().add(valSalute1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, -1, -1));

        valSalute2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        valSalute2.setText("0");
        getContentPane().add(valSalute2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void esploraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esploraActionPerformed
        nTurno++;
        turno.setText("" + nTurno);
        int ev = ge.sceltaEvento();
        String fortunato = e.getNome();

        String risultatoEvento = "";

        if (fortunato.equals("FIZZLE") && e.getLucky() == true) {
            if (ev <= 30) {
                risultatoEvento = ge.oggettiBuoni(true, b);
            } else if (ev <= 60 && ev > 30) {
                risultatoEvento = ge.PersonaggiBuoni(e, true);
            } else if (ev <= 85 && ev > 60) {
                risultatoEvento = ge.imprevisti(e, true);
            } else if (ev > 85) {
                risultatoEvento = ge.personaggiCattivi(e, true);
            }
        } else {
            if (ev <= 25) {
                risultatoEvento = ge.oggettiBuoni(false, b);
            } else if (ev <= 50 && ev > 25) {
                risultatoEvento = ge.PersonaggiBuoni(e, false);
            } else if (ev <= 75 && ev > 50) {
                risultatoEvento = ge.imprevisti(e, false);
            } else if (ev > 75) {
                risultatoEvento = ge.personaggiCattivi(e, false);
            }
        }
        testoStoria.append("TURNO " + nTurno + ": " + risultatoEvento + "\n");

        String nomeFile = "";
        String log = risultatoEvento;

        if (log.contains("DRAGO")) {
            nomeFile = "drago.png";
        } else if (log.contains("FATA")) {
            nomeFile = "fata.png";
        } else if (log.contains("BANDITO")) {
            nomeFile = "bandito.png";
        } else if (log.contains("DRUIDO")) {
            nomeFile = "druido.png";
        } else if (log.contains("LOCANDIERE")) {
            nomeFile = "locandiere.png";
        } else if (log.contains("SORGENTE")) {
            nomeFile = "borraccia.png";
        } else if (log.contains("MELA") || log.contains("MELE")) {
            nomeFile = "cibo.png";
        } else {
            eventiImg.setIcon(null);
        }
        //VITTORIA
        if (nTurno >= 100) {
            risultatoEvento = "HAI SCONFITTO IL SIGNORE DELLE OMBRE! IL MONDO È SALVO!";
            testoStoria.append(risultatoEvento + "\n");
            nomeFile = "vittoria.png";
            esplora.setEnabled(false);
            mangia.setEnabled(false);
            bevi.setEnabled(false);
            ability.setEnabled(false);
        }
        //SCONFITTA
        if (e.getVita() <= 0 || e.getSete() >= 100 || e.getFame() >= 100) {
            valSalute.setText("0");
            testoStoria.append("--- SEI MORTO --- La tua avventura finisce qui");
            nomeFile = "sconfitta.png";
            esplora.setEnabled(false);
            mangia.setEnabled(false);
            bevi.setEnabled(false);
            ability.setEnabled(false);
        }

        if (!nomeFile.equals("")) {
            java.net.URL url = getClass().getResource("/mondoincantato/" + nomeFile);
            if (url != null) {
                eventiImg.setIcon(new javax.swing.ImageIcon(url));
            }
        }

        inventario();
    }//GEN-LAST:event_esploraActionPerformed

    private void mangiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mangiaActionPerformed

        if (b.contaCibo() > 0) {
            b.consumaCibo();
            e.setFame(e.getFame() - 20);
            e.setVita(e.getVita()+10);
        }

    }//GEN-LAST:event_mangiaActionPerformed

    private void beviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beviActionPerformed
        if (b.contaAcqua() > 0) {
            b.consumaAcqua();
            e.setSete(e.getSete() - 20);
            e.setVita(e.getVita()+10);
        }
    }//GEN-LAST:event_beviActionPerformed

    private void abilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abilityActionPerformed
        if (e.isAbility()) {
            g.usaAbility(e, b);

            if (e.getNome().contains("FIZZLE")) {
                testoStoria.append("FIZZLE attiva il suo sesto senso! Prossimi ritrovamenti raddoppiati.\n");
            } else if (e.getNome().contains("KORG")) {
                testoStoria.append("KORG ha cacciato: +2 Cibo in borsa!\n");
            } else if (e.getNome().contains("LIRAEL")) {
                testoStoria.append("LIRAEL usa il canto curativo: +60 HP!\n");
            } else {
                testoStoria.append("ASTER ha trovato una fonte: +2 Acqua in borsa!\n");
            }
            inventario(); // aggiorna le label
        }
        else {
            testoStoria.append("L'abilità non è ancora pronta!\n");
        }
    }//GEN-LAST:event_abilityActionPerformed

    private void saveCsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCsvActionPerformed
        try {
            FileManager.salvaCsv(this , b, e);
        } catch (IOException ex) {
            System.getLogger(Turno.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_saveCsvActionPerformed

    private void caricaCsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caricaCsvActionPerformed
        try {
            this.g= FileManager.caricaCsv(b, e, g);
            this.e=g.getEroe();
            this.b=g.getBorsa();
            setEroe(e);
            
            inventario();
            stazEroe();
        } catch (IOException ex) {
            System.getLogger(Turno.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_caricaCsvActionPerformed

    private void saveSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveSerActionPerformed
        contSer= new Contenitore(b,e,this);
        FileManager.salvaSer(contSer);
    }//GEN-LAST:event_saveSerActionPerformed

    private void caricaSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caricaSerActionPerformed
        
        try {
            this.g= FileManager.caricaSer(contSer, e, g);
            this.e=g.getEroe();
            this.b=g.getBorsa();
            setEroe(e);
            
            inventario();
            stazEroe();
        } catch (IOException ex) {
            System.getLogger(Turno.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (ClassNotFoundException ex) {
            System.getLogger(Turno.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_caricaSerActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Turno().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ability;
    private javax.swing.JButton bevi;
    private javax.swing.JButton caricaCsv;
    private javax.swing.JButton caricaSer;
    private javax.swing.JButton esplora;
    private javax.swing.JLabel eventiImg;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mangia;
    private javax.swing.JLabel personaggio;
    private javax.swing.JButton saveCsv;
    private javax.swing.JButton saveSer;
    private javax.swing.JScrollPane storia;
    private javax.swing.JTextArea testoStoria;
    private javax.swing.JLabel turno;
    private javax.swing.JLabel valAcqua;
    private javax.swing.JLabel valCibo;
    private javax.swing.JLabel valFame;
    private javax.swing.JLabel valSalute;
    private javax.swing.JLabel valSalute1;
    private javax.swing.JLabel valSalute2;
    private javax.swing.JLabel valSete;
    // End of variables declaration//GEN-END:variables
}
