package Cconexion;





import com.jtattoo.plaf.noire.NoireLookAndFeel;
import java.sql.Connection;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;



public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton4 = new javax.swing.JButton();
        bboleto = new javax.swing.JButton();
        bconductor = new javax.swing.JButton();
        bvendedor = new javax.swing.JButton();
        bcamion = new javax.swing.JButton();
        bsalir = new javax.swing.JButton();
        bviajes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bboleto.setBackground(new java.awt.Color(0, 153, 153));
        bboleto.setForeground(new java.awt.Color(0, 0, 0));
        bboleto.setText("Boleto");
        bboleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bboletoActionPerformed(evt);
            }
        });
        getContentPane().add(bboleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 87, -1));

        bconductor.setBackground(new java.awt.Color(0, 153, 153));
        bconductor.setForeground(new java.awt.Color(0, 0, 0));
        bconductor.setText("Conductor");
        bconductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bconductorActionPerformed(evt);
            }
        });
        getContentPane().add(bconductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        bvendedor.setBackground(new java.awt.Color(0, 153, 153));
        bvendedor.setForeground(new java.awt.Color(0, 0, 0));
        bvendedor.setText("Vendedor");
        bvendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bvendedorActionPerformed(evt);
            }
        });
        getContentPane().add(bvendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 87, -1));

        bcamion.setBackground(new java.awt.Color(0, 153, 153));
        bcamion.setForeground(new java.awt.Color(0, 0, 0));
        bcamion.setText("Camion");
        bcamion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcamionActionPerformed(evt);
            }
        });
        getContentPane().add(bcamion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 87, -1));

        bsalir.setBackground(new java.awt.Color(255, 153, 0));
        bsalir.setForeground(new java.awt.Color(0, 0, 0));
        bsalir.setText("Salir");
        bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalirActionPerformed(evt);
            }
        });
        getContentPane().add(bsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 87, -1));

        bviajes.setBackground(new java.awt.Color(0, 153, 153));
        bviajes.setForeground(new java.awt.Color(0, 0, 0));
        bviajes.setText("Viajes");
        bviajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bviajesActionPerformed(evt);
            }
        });
        getContentPane().add(bviajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 87, -1));

        jLabel1.setBackground(new java.awt.Color(0, 153, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("                 BIENVENIDO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 550, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/buss.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 680, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bboletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bboletoActionPerformed
        // TODO add your handling code here:
        new Boleto().setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_bboletoActionPerformed

    private void bconductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bconductorActionPerformed
        // TODO add your handling code here:
        new Conductor().setVisible(true);  this.dispose();
    }//GEN-LAST:event_bconductorActionPerformed

    private void bvendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bvendedorActionPerformed
        // TODO add your handling code here:
        new Vendedor().setVisible(true);  this.dispose();
    }//GEN-LAST:event_bvendedorActionPerformed

    private void bcamionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcamionActionPerformed
        // TODO add your handling code here:
        new Camion().setVisible(true);  this.dispose();
    }//GEN-LAST:event_bcamionActionPerformed

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirActionPerformed
        // TODO add your handling code here:
        new Menuprincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bsalirActionPerformed

    private void bviajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bviajesActionPerformed
        // TODO add your handling code here:
        new Viajes().setVisible(true); this.dispose();
    }//GEN-LAST:event_bviajesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new NoireLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Camion.class.getName()).log(Level.SEVERE, null, ex);
                }
                 
                
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bboleto;
    private javax.swing.JButton bcamion;
    private javax.swing.JButton bconductor;
    private javax.swing.JButton bsalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton bvendedor;
    private javax.swing.JButton bviajes;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables


}
