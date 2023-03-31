
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
public class Conductor extends javax.swing.JFrame {
    
    DefaultTableModel model;

    /**
     * Creates new form Conductor
     */

     public Conductor() {
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
        String sql="SELECT * FROM camion";
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                this.AC.addItem(rs.getString("Matricula_cli"));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
     void cargar(String valor){
            String[] titulos={"ID","RFC","Nombre","Domicilio","Telefono","FechaNacimiento","Camion Asignado"};
            String[] registros = new String[7];
            
            String sql="SELECT * FROM conductor,camion where conductor.Matricula_cli=camion.ID_cli && RFC LIKE '%"+valor+"%'";
            
            model = new DefaultTableModel(null,titulos);
            
            Conexion cc=new Conexion();
            Connection cn=cc.estableceConexion();
            
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
                       
            while(rs.next()){
                registros[0]=rs.getString("IDconductor_cli");
                registros[1]=rs.getString("RFC");
                registros[2]=rs.getString("Nombre_cli");
                registros[3]=rs.getString("Domicilio_cli");
                registros[4]=rs.getString("Telefono_cli");
                registros[5]=rs.getString("FechaNacimiento_cli");
                registros[6]=rs.getString("Matricula_cli");
               
               
                model.addRow(registros);
            }
                        
            tconductor.setModel(model);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
     
    
    void limpiar(){
        rfc.setText("");
        nomb.setText("");
        Domc.setText("");
        telf.setText("");
        fn.setText("");
    }
    
    void bloquear(){
         rfc.setEnabled(false);
        nomb.setEnabled(false);
        Domc.setEnabled(false);
        telf.setEnabled(false);
        fn.setEnabled(false);
        AC.setEnabled(false);
        bnuevo.setEnabled(true);
        bguardar.setEnabled(false);
        bcancelar.setEnabled(false);        
    }
    
    void habilitar(){
        rfc.setEnabled(true);
        nomb.setEnabled(true);
        Domc.setEnabled(true);
        telf.setEnabled(true);
        fn.setEnabled(true);
        AC.setEnabled(true);
        bnuevo.setEnabled(false);
        bguardar.setEnabled(true);
        bcancelar.setEnabled(true);        
    }
    
    void actualizar(){
        rfc.setEnabled(true);
        nomb.setEnabled(true);
        Domc.setEnabled(true);
        telf.setEnabled(true);
        fn.setEnabled(true);
        AC.setEnabled(true);
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
        Domc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        bnuevo = new javax.swing.JButton();
        bguardar = new javax.swing.JButton();
        bcancelar = new javax.swing.JButton();
        bmenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tconductor = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        aux = new javax.swing.JTextField();
        bmostar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        bactualizar = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        AC = new javax.swing.JComboBox();
        JLeliminar = new javax.swing.JToggleButton();

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conductor");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Cedula:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        rfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfcActionPerformed(evt);
            }
        });
        getContentPane().add(rfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 144, 20));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Nombre: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        nomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombActionPerformed(evt);
            }
        });
        getContentPane().add(nomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 160, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Domicilio: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 49, -1, -1));

        Domc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DomcActionPerformed(evt);
            }
        });
        getContentPane().add(Domc, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 46, 111, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Telefono: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 49, -1, -1));

        telf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telfActionPerformed(evt);
            }
        });
        getContentPane().add(telf, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 130, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Fecha de Nacimiento: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 49, -1, -1));

        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        getContentPane().add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 120, 20));

        bnuevo.setBackground(new java.awt.Color(0, 153, 153));
        bnuevo.setForeground(new java.awt.Color(0, 0, 0));
        bnuevo.setText("Nuevo");
        bnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(bnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 131, 82, -1));

        bguardar.setBackground(new java.awt.Color(0, 153, 153));
        bguardar.setForeground(new java.awt.Color(0, 0, 0));
        bguardar.setText("Guardar");
        bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bguardarActionPerformed(evt);
            }
        });
        getContentPane().add(bguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 131, 82, -1));

        bcancelar.setBackground(new java.awt.Color(0, 153, 153));
        bcancelar.setForeground(new java.awt.Color(0, 0, 0));
        bcancelar.setText("Cancelar");
        bcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelarActionPerformed(evt);
            }
        });
        getContentPane().add(bcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 131, 82, -1));

        bmenu.setBackground(new java.awt.Color(51, 255, 102));
        bmenu.setForeground(new java.awt.Color(0, 0, 0));
        bmenu.setText("RMenu");
        bmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmenuActionPerformed(evt);
            }
        });
        getContentPane().add(bmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 82, -1));

        tconductor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tconductor.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tconductor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 230, 640, 190));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("Buscar: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 183, -1, -1));

        aux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auxActionPerformed(evt);
            }
        });
        aux.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                auxKeyReleased(evt);
            }
        });
        getContentPane().add(aux, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 180, 175, 20));

        bmostar.setBackground(new java.awt.Color(0, 153, 153));
        bmostar.setForeground(new java.awt.Color(0, 0, 0));
        bmostar.setText("Mostrar Todos");
        bmostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmostarActionPerformed(evt);
            }
        });
        getContentPane().add(bmostar, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setText("Asignar Camion: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 94, -1, -1));

        bactualizar.setBackground(new java.awt.Color(0, 153, 153));
        bactualizar.setForeground(new java.awt.Color(0, 0, 0));
        bactualizar.setText("Actualizar");
        bactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bactualizarActionPerformed(evt);
            }
        });
        getContentPane().add(bactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 131, -1, -1));

        id.setEnabled(false);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 100, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setText("ID: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 9, -1, -1));

        AC.setBackground(new java.awt.Color(51, 51, 255));
        AC.setForeground(new java.awt.Color(0, 0, 0));
        AC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona.." }));
        AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACActionPerformed(evt);
            }
        });
        getContentPane().add(AC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        JLeliminar.setBackground(new java.awt.Color(255, 153, 51));
        JLeliminar.setForeground(new java.awt.Color(0, 0, 0));
        JLeliminar.setText("Eliminar");
        JLeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JLeliminarActionPerformed(evt);
            }
        });
        getContentPane().add(JLeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

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

    private void rfcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfcActionPerformed
        // TODO add your handling code here:
        rfc.requestFocus();
    }//GEN-LAST:event_rfcActionPerformed

    private void nombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombActionPerformed
        // TODO add your handling code here:
        nomb.requestFocus();
    }//GEN-LAST:event_nombActionPerformed

    private void DomcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DomcActionPerformed
        // TODO add your handling code here:
        Domc.requestFocus();
    }//GEN-LAST:event_DomcActionPerformed

    private void telfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telfActionPerformed
        // TODO add your handling code here:
        telf.requestFocus();
    }//GEN-LAST:event_telfActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
        fn.requestFocus();
    }//GEN-LAST:event_fnActionPerformed

    private void bguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bguardarActionPerformed
        // TODO add your handling code here:
        
        if(this.rfc.getText().length()==0 || this.nomb.getText().length()==0 || 
           this.Domc.getText().length()==0 || this.telf.getText().length()==0 || 
           this.fn.getText().length()==0 || this.AC.getSelectedIndex()==0 ){

            JOptionPane.showMessageDialog(this,"Todos los Campos Deben Llenarse","Mensaje",1);}
        else{
        Conexion cc = new Conexion();
        Connection cn = cc.estableceConexion();
        String rf,nom,dom,te,fen;
        int idcamion;
        String sql="";
        rf = rfc.getText();
        nom = nomb.getText();
        dom = Domc.getText();
        te = telf.getText();
        fen = fn.getText();
        idcamion = AC.getSelectedIndex();
        sql="INSERT INTO conductor(RFC, Nombre_cli, Domicilio_cli, Telefono_cli, FechaNacimiento_cli, Matricula_cli) VALUES(?,?,?,?,?,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, rf);
            pst.setString(2, nom);
            pst.setString(3, dom);
            pst.setString(4, te);
            pst.setString(5, fen);
            pst.setInt(6, idcamion);
            int n=pst.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null,"Registro Guardado");
                bloquear();
                cargar("");
            }
            limpiar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
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

    private void bmostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmostarActionPerformed
        // TODO add your handling code here:
        aux.setText("");
        cargar("");
    }//GEN-LAST:event_bmostarActionPerformed

    private void bactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bactualizarActionPerformed
        // TODO add your handling code here:
     Conexion cc = new Conexion();
        Connection cn = cc.estableceConexion();
        try{
            PreparedStatement pst = cn.prepareStatement("UPDATE conductor SET RFC='"+rfc.getText()+"',Nombre_cli='"+nomb.getText()+"',Domicilio_cli='"+Domc.getText()+"',Telefono_cli='"+telf.getText()+"',FechaNacimiento_cli='"+fn.getText()+"',Matricula_cli='"+AC.getSelectedIndex()+"' WHERE IDconductor_cli='"+id.getText()+"'");
            pst.executeUpdate();
            cargar("");
            bactualizar.setEnabled(false);
            bloquear();
            limpiar();
        }
        catch(SQLException e){JOptionPane.showMessageDialog(null,e.getMessage());}
        
    }//GEN-LAST:event_bactualizarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int fil=tconductor.getSelectedRow();
        if(fil>=0){
            id.setText(tconductor.getValueAt(fil, 0).toString());
            rfc.setText(tconductor.getValueAt(fil, 1).toString());
            nomb.setText(tconductor.getValueAt(fil, 2).toString());
            Domc.setText(tconductor.getValueAt(fil, 3).toString());
            telf.setText(tconductor.getValueAt(fil, 4).toString());
            fn.setText(tconductor.getValueAt(fil, 5).toString());
            AC.setSelectedItem(tconductor.getValueAt(fil, 6));
            actualizar();
        }
        else{
            JOptionPane.showMessageDialog(null,"No Se A Seleccionado Una Fila");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void JLeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JLeliminarActionPerformed
        
        
        Conexion cc=new Conexion();
     Connection cn=cc.estableceConexion();
        
           // Obtener la fila seleccionada del JTable
    int fila = tconductor.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione una fila para eliminar");
        return;
    }
    
    // Obtener el ID del conductor a eliminar
    int idConductor = Integer.parseInt(tconductor.getValueAt(fila, 0).toString());
    
    try {
        
        // Crear la consulta SQL para eliminar el conductor
        String sql = " DELETE FROM conductor WHERE IDconductor_cli = ?";
        
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setInt(1, idConductor);
        
        // Ejecutar la consulta SQL para eliminar el conductor
        int resultado = ps.executeUpdate();
        
        if (resultado > 0) {
            JOptionPane.showMessageDialog(this, "El conductor ha sido eliminado");
            
            // Actualizar la tabla con los datos actuales de la base de datos
            actualizarTablaConductor();
        } else {
            JOptionPane.showMessageDialog(this, "Error al eliminar el conductor");
        }
        
        // Cerrar los recursos utilizados
        ps.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al eliminar el conductor: " + e.getMessage());
    }
} 

private void actualizarTablaConductor() throws SQLException {
      Conexion cc=new Conexion();
     Connection cn=cc.estableceConexion();
    // Crear la consulta SQL para obtener los conductores
    String sql = "SELECT * FROM conductor";
    PreparedStatement ps = cn.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();

    // Crear el modelo de tabla con los datos del ResultSet
    DefaultTableModel model = new DefaultTableModel();
    model.setColumnIdentifiers(new Object[]{"ID", "RFC", "Nombre", "Domicilio", "Teléfono", "Fecha de Nacimiento", "Matrícula"});
    while (rs.next()) {
        Object[] row = new Object[]{rs.getInt("IDconductor_cli"), rs.getString("RFC"), rs.getString("Nombre_cli"), rs.getString("Domicilio_cli"), rs.getString("Telefono_cli"), rs.getDate("FechaNacimiento_cli"), rs.getString("Matricula_cli")};
        model.addRow(row);
    }

    // Asignar el modelo de tabla al componente JTable
    tconductor.setModel(model);

    // Cerrar los recursos utilizados
    rs.close();
    ps.close();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_JLeliminarActionPerformed

    private void auxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_auxActionPerformed

    private void ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ACActionPerformed

    
    
    
    
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
            java.util.logging.Logger.getLogger(Conductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                
                new Conductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox AC;
    private javax.swing.JTextField Domc;
    private javax.swing.JToggleButton JLeliminar;
    private javax.swing.JTextField aux;
    private javax.swing.JButton bactualizar;
    private javax.swing.JButton bcancelar;
    private javax.swing.JButton bguardar;
    private javax.swing.JButton bmenu;
    private javax.swing.JButton bmostar;
    private javax.swing.JButton bnuevo;
    private javax.swing.JTextField fn;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomb;
    private javax.swing.JTextField rfc;
    private javax.swing.JTable tconductor;
    private javax.swing.JTextField telf;
    // End of variables declaration//GEN-END:variables
}
