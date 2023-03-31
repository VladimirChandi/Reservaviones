

package Cconexion;

import com.jtattoo.plaf.noire.NoireLookAndFeel;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JURIEL
 */
public final class Vendedor extends javax.swing.JFrame {
    
    DefaultTableModel model;

    /**
     * Creates new form Vendedor
     */
    public Vendedor() {
        initComponents();
        limpiar();
        bloquear();
        cargar("");
        bactualizar.setEnabled(false);
    }
    
     void cargar(String valor){
            String[] titulos={"id","RFC","Nombre","Domicilio","Telefono","FechaNacimiento"};
            String[] registros = new String[6];
            
            String sql="SELECT * FROM vendedor where RFC_cli LIKE '%"+valor+"%'";
            
            model = new DefaultTableModel(null,titulos);
            
            Conexion cc=new Conexion();
            Connection cn=cc.estableceConexion();
            
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                registros[0]=rs.getString("id_vendedor");
                registros[1]=rs.getString("RFC_cli");
                registros[2]=rs.getString("Nombre_cli");
                registros[3]=rs.getString("Domicilio_cli");
                registros[4]=rs.getString("Telefono_cli");
                registros[5]=rs.getString("FechaNacimiento_cli");
                model.addRow(registros);
            }
            tvendedor.setModel(model);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    void limpiar(){
        rfc.setText("");
        nomb.setText("");
        dom.setText("");
        tel.setText("");
        fn.setText("");
    }
    
    void bloquear(){
        rfc.setEnabled(false);
        nomb.setEnabled(false);
        dom.setEnabled(false);
        tel.setEnabled(false);
        fn.setEnabled(false);
        bnuevo.setEnabled(true);
        bguardar.setEnabled(false);
        bcancelar.setEnabled(false);        
    }
    
    void habilitar(){
        rfc.setEnabled(true);
        nomb.setEnabled(true);
        dom.setEnabled(true);
        tel.setEnabled(true);
        fn.setEnabled(true);
        bnuevo.setEnabled(false);
        bguardar.setEnabled(true);
        bcancelar.setEnabled(true);        
    }
    
    void actualizar(){
        rfc.setEnabled(true);
        nomb.setEnabled(true);
        dom.setEnabled(true);
        tel.setEnabled(true);
        fn.setEnabled(true);
        bactualizar.setEnabled(true);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        rfc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nomb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        bnuevo = new javax.swing.JButton();
        bguardar = new javax.swing.JButton();
        bcancelar = new javax.swing.JButton();
        bmenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tvendedor = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        aux = new javax.swing.JTextField();
        bmostrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        bactualizar = new javax.swing.JButton();
        Beliminar = new javax.swing.JButton();

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vendedor");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Cedula:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));
        getContentPane().add(rfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 180, 20));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Nombre: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 61, -1, -1));
        getContentPane().add(nomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 140, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Domicilio: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        dom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domActionPerformed(evt);
            }
        });
        getContentPane().add(dom, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 180, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Telefono: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        getContentPane().add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 120, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("FechaNacimiento: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));
        getContentPane().add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 180, 20));

        bnuevo.setBackground(new java.awt.Color(204, 153, 0));
        bnuevo.setForeground(new java.awt.Color(0, 0, 0));
        bnuevo.setText("Nuevo");
        bnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(bnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 162, 82, -1));

        bguardar.setBackground(new java.awt.Color(0, 153, 153));
        bguardar.setForeground(new java.awt.Color(0, 0, 0));
        bguardar.setText("Guardar");
        bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bguardarActionPerformed(evt);
            }
        });
        getContentPane().add(bguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 162, 82, -1));

        bcancelar.setBackground(new java.awt.Color(0, 153, 153));
        bcancelar.setForeground(new java.awt.Color(0, 0, 0));
        bcancelar.setText("Cancelar");
        bcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelarActionPerformed(evt);
            }
        });
        getContentPane().add(bcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 162, 82, -1));

        bmenu.setBackground(new java.awt.Color(51, 255, 102));
        bmenu.setForeground(new java.awt.Color(0, 0, 0));
        bmenu.setText("RMenu");
        bmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmenuActionPerformed(evt);
            }
        });
        getContentPane().add(bmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 162, 75, -1));

        tvendedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tvendedor.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tvendedor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 550, 116));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("Buscar: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 213, -1, -1));

        aux.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                auxKeyReleased(evt);
            }
        });
        getContentPane().add(aux, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 210, 143, -1));

        bmostrar.setBackground(new java.awt.Color(0, 153, 153));
        bmostrar.setForeground(new java.awt.Color(0, 0, 0));
        bmostrar.setText("Mostrar Todos");
        bmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmostrarActionPerformed(evt);
            }
        });
        getContentPane().add(bmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setText("ID: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 21, -1, -1));

        id.setEnabled(false);
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 19, 152, 20));

        bactualizar.setBackground(new java.awt.Color(0, 153, 153));
        bactualizar.setForeground(new java.awt.Color(0, 0, 0));
        bactualizar.setText("Actualizar");
        bactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bactualizarActionPerformed(evt);
            }
        });
        getContentPane().add(bactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 162, -1, -1));

        Beliminar.setBackground(new java.awt.Color(255, 153, 0));
        Beliminar.setForeground(new java.awt.Color(0, 0, 0));
        Beliminar.setText("Eliminar");
        Beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Beliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 210, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnuevoActionPerformed
        // TODO add your handling code here:
        habilitar();
        rfc.requestFocus();
    }//GEN-LAST:event_bnuevoActionPerformed

    private void bcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelarActionPerformed
        // TODO add your handling code here:
        limpiar();
        bloquear();
    }//GEN-LAST:event_bcancelarActionPerformed

    private void bguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bguardarActionPerformed
        // TODO add your handling code here:
        
        if(this.rfc.getText().length()==0 || this.nomb.getText().length()==0 || 
           this.dom.getText().length()==0 || this.tel.getText().length()==0 || 
           this.fn.getText().length()==0){

            JOptionPane.showMessageDialog(this,"Todos los Campos Deben Llenarse","Mensaje",1);}
        
        else{
        Conexion cc = new Conexion();
        Connection cn = cc.estableceConexion();
        String rf,nom,domc,te,fen;
        String sql="";
        rf = rfc.getText();
        nom = nomb.getText();
        domc = dom.getText();
        te = tel.getText();
        fen = fn.getText();
        sql="INSERT INTO vendedor(RFC_cli, Nombre_cli, Domicilio_cli, Telefono_cli, FechaNacimiento_cli) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, rf);
            pst.setString(2, nom);
            pst.setString(3, domc);
            pst.setString(4, te);
            pst.setString(5, fen);
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
        }}
    }//GEN-LAST:event_bguardarActionPerformed

    private void bmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmenuActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);  this.dispose();
    }//GEN-LAST:event_bmenuActionPerformed

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
        int fil=tvendedor.getSelectedRow();
        if(fil>=0){
            id.setText(tvendedor.getValueAt(fil, 0).toString());
            rfc.setText(tvendedor.getValueAt(fil, 1).toString());
            nomb.setText(tvendedor.getValueAt(fil, 2).toString());
            dom.setText(tvendedor.getValueAt(fil, 3).toString());
            tel.setText(tvendedor.getValueAt(fil, 4).toString());
            fn.setText(tvendedor.getValueAt(fil, 5).toString());
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
            PreparedStatement pst = cn.prepareStatement("UPDATE vendedor SET RFC_cli='"+rfc.getText()+"',Nombre_cli='"+nomb.getText()+"',Domicilio_cli='"+dom.getText()+"',Telefono_cli='"+tel.getText()+"',FechaNacimiento_cli='"+fn.getText()+"' WHERE id_vendedor'"+id.getText()+"'");
            pst.executeUpdate();
            cargar("");
            bactualizar.setEnabled(false);
            bloquear();
            limpiar();
        }
        catch(SQLException e){JOptionPane.showMessageDialog(null,e.getMessage());}        
    }//GEN-LAST:event_bactualizarActionPerformed
    
    private void BeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeliminarActionPerformed
        
        //Hay que alidar el boton eliminar
         // Obtener la conexión a la base de datos
    Conexion cc = new Conexion();
    Connection cn = cc.estableceConexion();
    
    // Obtener la fila seleccionada del JTable
    int filaSeleccionada = tvendedor.getSelectedRow();
    if (filaSeleccionada >=0) {
        DefaultTableModel modelo = (DefaultTableModel) tvendedor.getModel();
        modelo.removeRow(filaSeleccionada);
        JOptionPane.showMessageDialog(this, "Registro vendedor eliminado");
        return;
    }
    
    // Obtener el ID del vendedor a eliminar
    int id_vendedor = Integer.parseInt(tvendedor.getValueAt(filaSeleccionada, 0).toString());
    
    try {
        // Crear la consulta SQL para eliminar el vendedor
         String sql = " DELETE FROM vendedor WHERE id_vendedor; = ?";
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setInt(1, id_vendedor);
        
        // Ejecutar la consulta SQL para eliminar el vendedor
        int resultado = ps.executeUpdate();
        
        if (resultado > 0) {
            DefaultTableModel modelo = (DefaultTableModel) tvendedor.getModel();
        modelo.removeRow(filaSeleccionada);
            JOptionPane.showMessageDialog(this, "REGISTRO VENDEDOR ELIMINADA");
            
            // Actualizar la tabla con los datos actuales de la base de datos
            actualizarTablaVendedor();
        } else {
            JOptionPane.showMessageDialog(this, "Error al eliminar el vendedor");
        }
        
        // Cerrar los recursos utilizados
        ps.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al eliminar el vendedor: " + e.getMessage());
    }
} 

private void actualizarTablaVendedor() throws SQLException {
    // Obtener la conexión a la base de datos
    Conexion cc = new Conexion();
    Connection cn = cc.estableceConexion();
    
    // Crear la consulta SQL para obtener los vendedores
    String sql = "SELECT * FROM id_vendedor";
    PreparedStatement ps = cn.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();

    // Crear el modelo de tabla con los datos del ResultSet
    DefaultTableModel model = new DefaultTableModel();
    model.setColumnIdentifiers(new Object[]{"id", "RFC", "Nombre", "Domicilio", "Telefono", "FechaNacimiento"});
    while (rs.next()) {
        Object[] row = new Object[]{rs.getInt("id_vendedor"), rs.getString("RFC_cli"), rs.getString("Nombre_cli"), rs.getString("Domicilio_cli"), rs.getString("Telefono_cli"), rs.getDate("FechaNacimiento_cli")};
        model.addRow(row);
    }

    // Asignar el modelo de tabla al componente JTable
    tvendedor.setModel(model);

    // Cerrar los recursos utilizados
    rs.close();
    ps.close();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_BeliminarActionPerformed

    private void domActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_domActionPerformed

    
    
    
    
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
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                
                new Vendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Beliminar;
    private javax.swing.JTextField aux;
    private javax.swing.JButton bactualizar;
    private javax.swing.JButton bcancelar;
    private javax.swing.JButton bguardar;
    private javax.swing.JButton bmenu;
    private javax.swing.JButton bmostrar;
    private javax.swing.JButton bnuevo;
    private javax.swing.JTextField dom;
    private javax.swing.JTextField fn;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomb;
    private javax.swing.JTextField rfc;
    private javax.swing.JTextField tel;
    private javax.swing.JTable tvendedor;
    // End of variables declaration//GEN-END:variables
}
