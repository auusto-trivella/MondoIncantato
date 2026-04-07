/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mondoincantato;

import java.awt.Color;
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
    private Borsa b;
    private Eroe e;
    private boolean modalitaDemone;
    private JLabel eroeSelezionato = null;
    private Turno f3;

    public SceltaPersonaggio(boolean sceltaArrivata) { 
        this.modalitaDemone = sceltaArrivata; 

        this.setUndecorated(true); 
        initComponents(); 
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH); 
        
        e= new Eroe("nessuno",false,0,0,0,false);
        f3 = new Turno();
        
        organizzaLayoutEroi(this.modalitaDemone);
    }

    private void organizzaLayoutEroi(boolean escludiFizzle) {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int w = dim.width;
        int h = dim.height;

        java.awt.Container content = this.getContentPane();
        content.removeAll(); 
        content.setLayout(new java.awt.BorderLayout());
        content.setBackground(new Color(20, 20, 20));

        int numeroEroi = escludiFizzle ? 3 : 4;
        JPanel panelEroi = new JPanel(new java.awt.GridLayout(1, numeroEroi, 10, 0));
        panelEroi.setOpaque(false);

        int imgW = w / numeroEroi;
        int imgH = (int) (h * 0.75);

        configuraInterazioneEroe(KORG, imgW, imgH);
        configuraInterazioneEroe(LIRAEL, imgW, imgH);
        configuraInterazioneEroe(ASTER, imgW, imgH);
        if (!escludiFizzle) {
            configuraInterazioneEroe(FIZZLE, imgW, imgH);
        }

        panelEroi.add(creaColonnaEroe(KORG, jLabel5, jLabel6));
        panelEroi.add(creaColonnaEroe(LIRAEL, jLabel7, jLabel8));
        panelEroi.add(creaColonnaEroe(ASTER, jLabel10, jLabel11));

        if (!escludiFizzle) {
            panelEroi.add(creaColonnaEroe(FIZZLE, jLabel12, jLabel13));
        }

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


        label.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {

                if (eroeSelezionato != null) {
                    eroeSelezionato.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 5));
                }

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


        p.add(javax.swing.Box.createVerticalGlue());// posiziona al centro la selazione
        p.add(img);
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
        KORG = new javax.swing.JLabel();
        ASTER = new javax.swing.JLabel();
        FIZZLE = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LIRAEL = new javax.swing.JLabel();
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

        KORG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mondoincantato/korg.png"))); // NOI18N
        KORG.setText("jLabel1");

        ASTER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mondoincantato/aster.png"))); // NOI18N
        ASTER.setText("jLabel1");

        FIZZLE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mondoincantato/fizzle.png"))); // NOI18N
        FIZZLE.setText("jLabel1");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("KORG");

        LIRAEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mondoincantato/lirael.png"))); // NOI18N
        LIRAEL.setText("jLabel1");

        jLabel6.setBackground(new java.awt.Color(200, 200, 200));
        jLabel6.setFont(new java.awt.Font("Verdana", 2, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(200, 200, 200));
        jLabel6.setText("+2 CIBO");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("LIRAEL");

        jLabel8.setBackground(new java.awt.Color(200, 200, 200));
        jLabel8.setFont(new java.awt.Font("Verdana", 2, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(200, 200, 200));
        jLabel8.setText("+60 VITA");

        jLabel9.setText("jLabel9");

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ASTER");

        jLabel11.setBackground(new java.awt.Color(200, 200, 200));
        jLabel11.setFont(new java.awt.Font("Verdana", 2, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(200, 200, 200));
        jLabel11.setText("+2 ACQUA");

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("FIZZLE");

        jLabel13.setBackground(new java.awt.Color(200, 200, 200));
        jLabel13.setFont(new java.awt.Font("Verdana", 2, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(200, 200, 200));
        jLabel13.setText("+ FORTUNA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(895, Short.MAX_VALUE)
                .addComponent(ASTER, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(FIZZLE, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(266, 266, 266)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(162, 162, 162)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(142, 142, 142)
                                        .addComponent(jLabel12))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(KORG, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LIRAEL, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGap(305, 305, 305))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(jLabel8)))
                .addGap(0, 746, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(609, 609, 609)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(101, 101, 101)
                        .addComponent(LIRAEL, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(KORG)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)))
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(ASTER, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(FIZZLE, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(80, 80, 80)
                .addComponent(jLabel13)
                .addGap(141, 141, 141))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if (eroeSelezionato == null) return;

    Gestore g = new Gestore(0,this.modalitaDemone,e,b);

    int n = 0;
    if (eroeSelezionato == FIZZLE) n = 1;
    else if (eroeSelezionato == KORG) n = 2;
    else if (eroeSelezionato == LIRAEL) n = 3;
    else if (eroeSelezionato == ASTER) n = 4;

    g.setnPersonaggio(n); 

    Eroe scelto = g.sceltaPersonaggio(); 
    
    f3.setEroe(scelto);
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
    private javax.swing.JLabel ASTER;
    private javax.swing.JLabel FIZZLE;
    private javax.swing.JLabel KORG;
    private javax.swing.JLabel LIRAEL;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
