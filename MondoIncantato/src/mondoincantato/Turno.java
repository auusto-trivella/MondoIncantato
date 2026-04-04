/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mondoincantato;

/**
 *
 * @author TRIVELLA.AUGUSTO
 */
public class Turno extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Turno.class.getName());

    /**
     * Creates new form Turno
     */
    private Eroe e;
    private int nTurno=0;
    public Turno() {
        initComponents();
        e= new Eroe("nessuno",false,0,0,0,false);
    }

    public void setEroe(Eroe nuovoEroe) {
        this.e = nuovoEroe;
        
        if (this.e != null) {
            stazEroe(); // Forza l'aggiornamento delle label
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

    public void stazEroe() {

        valSalute.setText("" + e.getVita());
        valSete.setText("" + e.getSete());
        valFame.setText("" + e.getFame());

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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        turno = new javax.swing.JLabel();
        personaggio = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        valSalute1 = new javax.swing.JLabel();
        valSalute2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ability.setBackground(new java.awt.Color(160, 130, 60));
        ability.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ability.setText("ABILITY");
        getContentPane().add(ability, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 560, -1, -1));

        mangia.setBackground(new java.awt.Color(145, 140, 125));
        mangia.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        mangia.setForeground(new java.awt.Color(230, 225, 210));
        mangia.setText("MANGIA");
        getContentPane().add(mangia, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 635, -1, 50));

        bevi.setBackground(new java.awt.Color(145, 140, 125));
        bevi.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bevi.setForeground(new java.awt.Color(230, 225, 210));
        bevi.setText("BEVI");
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

        jButton1.setText("jButton1");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jButton2.setText("jButton2");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jButton3.setText("jButton3");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        jButton5.setText("jButton5");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

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

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mondoincantato/borraccia.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 150, 460, 352));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel5.setText("0");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 710, 50, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel6.setText("0");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 640, 50, -1));
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 90, 320, 430));

        jLabel10.setForeground(new java.awt.Color(230, 225, 210));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mondoincantato/turno-img.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -180, 1400, 1200));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 650, -1, -1));

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
        turno.setText(""+nTurno);
    }//GEN-LAST:event_esploraActionPerformed

    
    
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
    private javax.swing.JButton esplora;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mangia;
    private javax.swing.JLabel personaggio;
    private javax.swing.JLabel turno;
    private javax.swing.JLabel valFame;
    private javax.swing.JLabel valSalute;
    private javax.swing.JLabel valSalute1;
    private javax.swing.JLabel valSalute2;
    private javax.swing.JLabel valSete;
    // End of variables declaration//GEN-END:variables
}
