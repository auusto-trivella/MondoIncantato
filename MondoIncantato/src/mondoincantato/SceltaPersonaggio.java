/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mondoincantato;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SceltaPersonaggio extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SceltaPersonaggio.class.getName());

    /**
     * Creates new form SceltaPersonaggio
     */
private boolean modalitaDemone;
    private JLabel eroeSelezionato = null;
    private Turno f3;

    public SceltaPersonaggio(boolean sceltaArrivata) { 
        this.modalitaDemone = sceltaArrivata; 

        this.setUndecorated(true); 
        initComponents(); 
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH); 
        
        f3 = new Turno();
        
        // Puliamo il contenuto generato da NetBeans e mettiamo il nostro
        organizzaLayoutEroi(this.modalitaDemone);
    }

    private void organizzaLayoutEroi(boolean escludiFizzle) {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int w = dim.width;
        int h = dim.height;

        java.awt.Container content = this.getContentPane();
        content.removeAll(); // SVUOTA tutto il vecchio layout di NetBeans
        content.setLayout(new java.awt.BorderLayout());
        content.setBackground(new Color(20, 20, 20));

        // Decidiamo il numero di colonne
        int numeroEroi = escludiFizzle ? 3 : 4;
        JPanel panelEroi = new JPanel(new java.awt.GridLayout(1, numeroEroi, 10, 0));
        panelEroi.setOpaque(false);

        int imgW = w / numeroEroi;
        int imgH = (int) (h * 0.75);

        // Configura il ridimensionamento (chiamiamo il metodo per ogni JLabel)
        configuraInterazioneEroe(jLabel1, imgW, imgH); // Korg
        configuraInterazioneEroe(jLabel4, imgW, imgH); // Lirael
        configuraInterazioneEroe(jLabel2, imgW, imgH); // Aster
        if (!escludiFizzle) {
            configuraInterazioneEroe(jLabel3, imgW, imgH); // Fizzle
        }

        // AGGIUNTA DEI PERSONAGGI (Una sola volta!)
        panelEroi.add(creaColonnaEroe(jLabel1, jLabel5, jLabel6));   // Korg
        panelEroi.add(creaColonnaEroe(jLabel4, jLabel7, jLabel8));   // Lirael
        panelEroi.add(creaColonnaEroe(jLabel2, jLabel10, jLabel11)); // Aster

        if (!escludiFizzle) {
            panelEroi.add(creaColonnaEroe(jLabel3, jLabel12, jLabel13)); // Fizzle
        }

        // Pannello Basso (Pulsante GIOCA)
        JPanel panelBasso = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 40));
        panelBasso.setOpaque(false);
        jButton1.setPreferredSize(new Dimension(w / 4, 70));
        jButton1.setFont(new java.awt.Font("Verdana", java.awt.Font.BOLD, 28));
        panelBasso.add(jButton1);

        content.add(panelEroi, java.awt.BorderLayout.CENTER);
        content.add(panelBasso, java.awt.BorderLayout.SOUTH);

        content.revalidate();
        content.repaint();
    }

    private void configuraInterazioneEroe(JLabel label, int maxW, int maxH) {
        // 1. RIDIMENSIONAMENTO ANTI-STRETCH
        if (label.getIcon() != null) {
            ImageIcon iconaOriginale = (ImageIcon) label.getIcon();
            double ratioW = (double) maxW / iconaOriginale.getIconWidth();
            double ratioH = (double) maxH / iconaOriginale.getIconHeight();
            double ratio = Math.min(ratioW, ratioH);

            int newW = (int) (iconaOriginale.getIconWidth() * ratio);
            int newH = (int) (iconaOriginale.getIconHeight() * ratio);

            label.setIcon(new ImageIcon(iconaOriginale.getImage().getScaledInstance(newW, newH, java.awt.Image.SCALE_SMOOTH)));
        }
        label.setText("");
        label.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 5)); // Bordo vuoto

        // 2. LOGICA DI SELEZIONE CLICCABILE
        label.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Deseleziona il vecchio
                if (eroeSelezionato != null) {
                    eroeSelezionato.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 5));
                }
                // Seleziona il nuovo (Bordo Arancione)
                eroeSelezionato = label;
                label.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 5));
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (label != eroeSelezionato) {
                    label.setBorder(BorderFactory.createLineBorder(Color.GRAY, 5));
                }
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (label != eroeSelezionato) {
                    label.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 5));
                }
            }
        });
    }

    private JPanel creaColonnaEroe(JLabel img, JLabel nome, JLabel bonus) {
        JPanel p = new JPanel();
        p.setLayout(new javax.swing.BoxLayout(p, javax.swing.BoxLayout.Y_AXIS));
        p.setOpaque(false);

        nome.setForeground(Color.WHITE);
        nome.setFont(new java.awt.Font("Verdana", java.awt.Font.BOLD, 30));
        bonus.setForeground(new Color(200, 200, 200));
        bonus.setFont(new java.awt.Font("Verdana", java.awt.Font.ITALIC, 20));

        img.setAlignmentX(Component.CENTER_ALIGNMENT);
        nome.setAlignmentX(Component.CENTER_ALIGNMENT);
        bonus.setAlignmentX(Component.CENTER_ALIGNMENT);

        p.add(javax.swing.Box.createVerticalGlue());
        p.add(img);
        p.add(javax.swing.Box.createVerticalStrut(20));
        p.add(nome);
        p.add(bonus);
        p.add(javax.swing.Box.createVerticalGlue());

        return p;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("GIOCA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mondoincantato/korg.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mondoincantato/aster.png"))); // NOI18N
        jLabel2.setText("jLabel1");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mondoincantato/fizzle.png"))); // NOI18N
        jLabel3.setText("jLabel1");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mondoincantato/lirael.png"))); // NOI18N
        jLabel4.setText("jLabel1");

        jLabel5.setText("KORG");

        jLabel6.setText("+2 CIBO");

        jLabel7.setText("LIRAEL");

        jLabel8.setText("+60 VITA");

        jLabel9.setText("jLabel9");

        jLabel10.setText("ASTER");

        jLabel11.setText("+2 ACQUA");

        jLabel12.setText("FIZZLE");

        jLabel13.setText("+ FORTUNA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 409, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(158, 158, 158))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(135, 135, 135)
                                .addComponent(jLabel7)))
                        .addGap(151, 151, 151)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7))
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8))
                                    .addComponent(jLabel13)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        f3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> {
        // AGGIUNGIAMO 'false' tra le parentesi per non dare errore
        new SceltaPersonaggio(false).setVisible(true); 
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
