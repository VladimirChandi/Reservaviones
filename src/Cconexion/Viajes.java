

package Cconexion;

import com.jtattoo.plaf.noire.NoireLookAndFeel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JURIEL
 */
public class Viajes extends javax.swing.JFrame {

    /**
     * Creates new form Viajes
     */
    DefaultTableModel model;
    
    public Viajes() {
        initComponents();
        limpiar();
        bloquear();
        cargar("");
        combo();
        bactualizar.setEnabled(false);
    }
    
    void combo(){
        //this.AC.removeAllItems();
        Conexion cc=new Conexion();
        Connection cn=cc.estableceConexion();
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT Matricula_cli FROM camion");
            while(rs.next()){
                this.CC.addItem(rs.getString("Matricula_cli"));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    void cargar(String valor){
            String[] titulos={"ID","Origen","Destino","Salida","Camion Asignado"};
            String[] registros = new String[5];
            
            String sql="SELECT * FROM viajes,camion where viajes.CamionAsignado_cli=camion.ID_cli && Orig_cli LIKE '%"+valor+"%'";
            
            model = new DefaultTableModel(null,titulos);
            
            Conexion cc=new Conexion();
            Connection cn=cc.estableceConexion();
            
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
                       
            while(rs.next()){
                registros[0]=rs.getString("id_viajes");
                registros[1]=rs.getString("Orig_cli");
                registros[2]=rs.getString("Dest_cli");
                registros[3]=rs.getString("Salida_cli");
                registros[4]=rs.getString("Matricula_cli");
                model.addRow(registros);
            }
                        
            tviajes.setModel(model);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    

    void limpiar(){
        org.setText("");
        des.setText("");
        hs.setText("");
    }
    
    void bloquear(){
        org.setEnabled(false);
        des.setEnabled(false);
        hs.setEnabled(false);
        CC.setEnabled(false);
        bnuevo.setEnabled(true);
        bguardar.setEnabled(false);
        bcancelar.setEnabled(false);
    }
    
    void habilitar(){
        org.setEnabled(true);
        des.setEnabled(true);
        hs.setEnabled(true);
        CC.setEnabled(true);
        bnuevo.setEnabled(false);
        bguardar.setEnabled(true);
        bcancelar.setEnabled(true);
    }
    
    void actualizar(){
        org.setEnabled(true);
        des.setEnabled(true);
        hs.setEnabled(true);
        CC.setEnabled(true);
        bactualizar.setEnabled(true);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        org = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        des = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        hs = new javax.swing.JTextField();
        bnuevo = new javax.swing.JButton();
        bguardar = new javax.swing.JButton();
        bcancelar = new javax.swing.JButton();
        brmenu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        CC = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tviajes = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        bactualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        aux = new javax.swing.JTextField();
        bmostrar = new javax.swing.JButton();
        Beliminar = new javax.swing.JButton();

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Viajes");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Origen: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));
        getContentPane().add(org, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 103, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Destino: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));
        getContentPane().add(des, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 120, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Salida: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        getContentPane().add(hs, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 75, -1));

        bnuevo.setBackground(new java.awt.Color(0, 204, 204));
        bnuevo.setForeground(new java.awt.Color(0, 0, 0));
        bnuevo.setText("Nuevo");
        bnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(bnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 102, 76, -1));

        bguardar.setBackground(new java.awt.Color(0, 204, 204));
        bguardar.setForeground(new java.awt.Color(0, 0, 0));
        bguardar.setText("Guardar");
        bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bguardarActionPerformed(evt);
            }
        });
        getContentPane().add(bguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 102, 76, -1));

        bcancelar.setBackground(new java.awt.Color(0, 204, 204));
        bcancelar.setForeground(new java.awt.Color(0, 0, 0));
        bcancelar.setText("Cancelar");
        bcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelarActionPerformed(evt);
            }
        });
        getContentPane().add(bcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 102, -1, -1));

        brmenu.setBackground(new java.awt.Color(0, 255, 51));
        brmenu.setForeground(new java.awt.Color(0, 0, 0));
        brmenu.setText("RMenu");
        brmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brmenuActionPerformed(evt);
            }
        });
        getContentPane().add(brmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 102, 76, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Camion Asignado: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        CC.setBackground(new java.awt.Color(0, 51, 255));
        CC.setForeground(new java.awt.Color(0, 0, 0));
        CC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona.." }));
        getContentPane().add(CC, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 54, 91, 30));

        tviajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tviajes.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tviajes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 206, 492, 105));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("ID: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        id.setEnabled(false);
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 98, -1));

        bactualizar.setBackground(new java.awt.Color(0, 204, 204));
        bactualizar.setForeground(new java.awt.Color(0, 0, 0));
        bactualizar.setText("Actualizar");
        bactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bactualizarActionPerformed(evt);
            }
        });
        getContentPane().add(bactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 102, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("Buscar: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        aux.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                auxKeyReleased(evt);
            }
        });
        getContentPane().add(aux, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 130, -1));

        bmostrar.setBackground(new java.awt.Color(0, 204, 204));
        bmostrar.setForeground(new java.awt.Color(0, 0, 0));
        bmostrar.setText("Mostrar Todo");
        bmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmostrarActionPerformed(evt);
            }
        });
        getContentPane().add(bmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 156, -1, -1));

        Beliminar.setBackground(new java.awt.Color(255, 153, 0));
        Beliminar.setForeground(new java.awt.Color(0, 0, 0));
        Beliminar.setText("Eliminar");
        Beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Beliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 156, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnuevoActionPerformed
        // TODO add your handling code here:
        habilitar();
        org.requestFocus();
    }//GEN-LAST:event_bnuevoActionPerformed

    private void bcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelarActionPerformed
        // TODO add your handling code here:
        limpiar();
        bloquear();
    }//GEN-LAST:event_bcancelarActionPerformed

    private void bguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bguardarActionPerformed
        // TODO add your handling code here:
          
        if(this.org.getText().length()==0 || this.des.getText().length()==0 || 
           this.hs.getText().length()==0 || this.CC.getSelectedIndex()==0 ){
            JOptionPane.showMessageDialog(this,"Todos los Campos Deben Llenarse","Mensaje",1);} 
        else{
        Conexion cc = new Conexion();
        Connection cn = cc.estableceConexion();
        String orig,dest,sal;
        int idcamion;
        String sql="";
        orig = org.getText();
        dest = des.getText();
        sal = hs.getText();
        idcamion = CC.getSelectedIndex();
        if( this.org.getText().equals(this.des.getText())){ JOptionPane.showMessageDialog(null,"Origen y Destino Identicos");}
        else{
            sql="INSERT INTO viajes(Orig_cli, Dest_cli, Salida_cli, CamionAsignado_cli) VALUES(?,?,?,?)";
            try {
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, orig);
                pst.setString(2, dest);
                pst.setString(3, sal);
                pst.setInt(4, idcamion);
                int n=pst.executeUpdate();
                if(n>0){
                    JOptionPane.showMessageDialog(null,"Registro Guardado");
                    bloquear();
                    cargar("");
                }
                limpiar();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error de Registro");
                Logger.getLogger(Boleto.class.getName()).log(Level.SEVERE, null, ex);
            }}}
    }//GEN-LAST:event_bguardarActionPerformed

    private void brmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brmenuActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);  this.dispose();
    }//GEN-LAST:event_brmenuActionPerformed

    private void auxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_auxKeyReleased
        // TODO add your handling code here:
        cargar(aux.getText());        
    }//GEN-LAST:event_auxKeyReleased

    private void bmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmostrarActionPerformed
        // TODO add your handling code here:
        aux.setText("");
        cargar("");
    }//GEN-LAST:event_bmostrarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int fil=tviajes.getSelectedRow();
        if(fil>=0){
            id.setText(tviajes.getValueAt(fil, 0).toString());
            org.setText(tviajes.getValueAt(fil, 1).toString());
            des.setText(tviajes.getValueAt(fil, 2).toString());
            hs.setText(tviajes.getValueAt(fil, 3).toString());
            CC.setSelectedItem(tviajes.getValueAt(fil, 4));
            actualizar();
        }
        else{
            JOptionPane.showMessageDialog(null,"No Se A Seleccionado Una Fila");
        }
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void bactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bactualizarActionPerformed
        // TODO add your handling code here:
        Conexion cc = new Conexion();
        Connection cn = cc.estableceConexion();
        try{
            PreparedStatement pst = cn.prepareStatement("UPDATE viajes SET Orig_cli='"+org.getText()+"',Dest_cli='"+des.getText()+"',Salida_cli='"+hs.getText()+"',CamionAsignado_cli='"+CC.getSelectedIndex()+"' WHERE id_viajes='"+id.getText()+"'");
            pst.executeUpdate();
            cargar("");
            bactualizar.setEnabled(false);
            bloquear();
            limpiar();
        }
        catch(SQLException e){JOptionPane.showMessageDialog(null,e.getMessage());}
    }//GEN-LAST:event_bactualizarActionPerformed

    private void BeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeliminarActionPerformed
   

  
         // Obtener la conexión a la base de datos
    Conexion cc = new Conexion();
    Connection cn = cc.estableceConexion();
    
    // Obtener la fila seleccionada del JTable
    int fila = tviajes.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione una fila para eliminar");
        return;
    }
    
    // Obtener el ID del viaje a eliminar
    int id_viajes = Integer.parseInt(tviajes.getValueAt(fila, 0).toString());
    
    try {
        // Crear la consulta SQL para eliminar el viaje
        String sql = "DELETE FROM viajes WHERE id_viajes = ?";
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setInt(1, id_viajes);
        
        // Ejecutar la consulta SQL para eliminar el viaje
        int resultado = ps.executeUpdate();
        
        if (resultado > 0) {
            JOptionPane.showMessageDialog(this, "El viaje ha sido eliminado");
            
            // Actualizar la tabla con los datos actuales de la base de datos
            actualizarTablaViajes();
        } else {
            JOptionPane.showMessageDialog(this, "Error al eliminar el viaje");
        }
        
        // Cerrar los recursos utilizados
        ps.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al eliminar el viaje: " + e.getMessage());
    }
} 

private void actualizarTablaViajes() throws SQLException {
    // Obtener la conexión a la base de datos
    Conexion cc = new Conexion();
    Connection cn = cc.estableceConexion();
    
    // Crear la consulta SQL para obtener los viajes
    String sql = "SELECT * FROM viajes";
    PreparedStatement ps = cn.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();

    // Crear el modelo de tabla con los datos del ResultSet
    DefaultTableModel modelViajes = new DefaultTableModel();
    modelViajes.setColumnIdentifiers(new Object[]{"id","Origen","Destino","Salida","Camion Asignado"});
    while (rs.next()) {
        Object[] row = new Object[]{rs.getInt("id_viajes"),rs.getString("Orig_cli"), rs.getString("Dest_cli"),  rs.getDate("Salida_cli"), rs.getString("CamionAsignado_cli") };
        modelViajes.addRow(row);
    }

    // Asignar el modelo de tabla al componente JTable
    tviajes.setModel(modelViajes);

    // Cerrar los recursos utilizados
    rs.close();
    ps.close();

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_BeliminarActionPerformed

    
    
    
    
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Viajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Viajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Viajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Viajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new NoireLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Camion.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                new Viajes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Beliminar;
    private javax.swing.JComboBox CC;
    private javax.swing.JTextField aux;
    private javax.swing.JButton bactualizar;
    private javax.swing.JButton bcancelar;
    private javax.swing.JButton bguardar;
    private javax.swing.JButton bmostrar;
    private javax.swing.JButton bnuevo;
    private javax.swing.JButton brmenu;
    private javax.swing.JTextField des;
    private javax.swing.JTextField hs;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField org;
    private javax.swing.JTable tviajes;
    // End of variables declaration//GEN-END:variables
}
