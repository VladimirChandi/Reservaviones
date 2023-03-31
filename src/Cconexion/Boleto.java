package Cconexion;
/////////////////////////
import com.jtattoo.plaf.noire.NoireLookAndFeel;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import java.io.IOException;





public final class Boleto extends javax.swing.JFrame {
    
    DefaultTableModel model;
  

    public Boleto() {
        
       initComponents();
        limpiar();
        bloquear();
        combo1();
        bactualizar.setEnabled(false);
    }
    //Combo que carga informacion para Origen/Destino/Salida
    void combo1(){
        //this.AC.removeAllItems();
        Conexion cc=new Conexion();
        Connection cn=cc.estableceConexion();
        String sql="SELECT * FROM viajes";
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                this.CO.addItem(rs.getString("Orig_cli"));
                this.CD.addItem(rs.getString("Dest_cli"));
                this.CH.addItem(rs.getString("Salida_cli"));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    void limpiar(){
        np.setText("");
        cos.setText("");
        na.setText("");
        /*org.setText("");
        dest.setText("");
        hor.setText("");*/
        lin.setText("");
        fech.setText("");
    }
    
    void bloquear(){
        np.setEnabled(false);
        cos.setEnabled(false);
        na.setEnabled(false);
        /*org.setEnabled(false);
        dest.setEnabled(false);
        hor.setEnabled(false);*/
        CO.setEnabled(false);
        CD.setEnabled(false);
        CH.setEnabled(false);
        lin.setEnabled(false);
        fech.setEnabled(false);
        bnuevo.setEnabled(true);
        bguardar.setEnabled(false);
        bcancelar.setEnabled(false);        
    }
    
    void habilitar(){
        np.setEnabled(true);
        cos.setEnabled(true);
        na.setEnabled(true);
        /*org.setEnabled(true);
        dest.setEnabled(true);
        hor.setEnabled(true);*/
        CO.setEnabled(true);
        CD.setEnabled(true);
        CH.setEnabled(true);
        lin.setEnabled(true);
        fech.setEnabled(true);
        bnuevo.setEnabled(false);
        bguardar.setEnabled(true);
        bcancelar.setEnabled(true);        
    }
    
    void actualizar(){
        np.setEnabled(true);
        cos.setEnabled(true);
        na.setEnabled(true);
        CO.setEnabled(true);
        CD.setEnabled(true);
        CH.setEnabled(true);
        lin.setEnabled(true);
        fech.setEnabled(true);
        bactualizar.setEnabled(true);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label1 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        Label7 = new javax.swing.JLabel();
        np = new javax.swing.JTextField();
        cos = new javax.swing.JTextField();
        na = new javax.swing.JTextField();
        lin = new javax.swing.JTextField();
        bnuevo = new javax.swing.JButton();
        bguardar = new javax.swing.JButton();
        bcancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fech = new javax.swing.JTextField();
        bmenu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        CO = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        CD = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        CH = new javax.swing.JComboBox();
        bactualizar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        ID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Boleto");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Label1.setText("Nombre del Cliente: ");
        getContentPane().add(Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 22, -1, -1));

        Label3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Label3.setText("Costo:");
        getContentPane().add(Label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 63, -1, -1));

        Label4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Label4.setText("N° Asiento: ");
        getContentPane().add(Label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        Label7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Label7.setText("Linea: ");
        getContentPane().add(Label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        np.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                npActionPerformed(evt);
            }
        });
        getContentPane().add(np, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 18, 110, 20));

        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });
        getContentPane().add(cos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 120, -1));

        na.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naActionPerformed(evt);
            }
        });
        getContentPane().add(na, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 58, 110, 20));

        lin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linActionPerformed(evt);
            }
        });
        getContentPane().add(lin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 120, 20));

        bnuevo.setBackground(new java.awt.Color(0, 204, 204));
        bnuevo.setForeground(new java.awt.Color(0, 0, 0));
        bnuevo.setText("Nuevo");
        bnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(bnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 82, -1));

        bguardar.setBackground(new java.awt.Color(0, 204, 204));
        bguardar.setForeground(new java.awt.Color(0, 0, 0));
        bguardar.setText("Guardar");
        bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bguardarActionPerformed(evt);
            }
        });
        getContentPane().add(bguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 82, -1));

        bcancelar.setBackground(new java.awt.Color(0, 204, 204));
        bcancelar.setForeground(new java.awt.Color(0, 0, 0));
        bcancelar.setText("Cancelar");
        bcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelarActionPerformed(evt);
            }
        });
        getContentPane().add(bcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 82, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Fecha: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 183, -1, -1));
        getContentPane().add(fech, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 180, 128, -1));

        bmenu.setBackground(new java.awt.Color(0, 255, 102));
        bmenu.setForeground(new java.awt.Color(0, 0, 0));
        bmenu.setText("RMenu");
        bmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmenuActionPerformed(evt);
            }
        });
        getContentPane().add(bmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 82, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Origen: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, -1, -1));

        CO.setBackground(new java.awt.Color(51, 51, 255));
        CO.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        CO.setForeground(new java.awt.Color(0, 0, 0));
        CO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleciona..", "IBARRA", "IST" }));
        CO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COActionPerformed(evt);
            }
        });
        getContentPane().add(CO, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 120, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Destino: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 102, -1, -1));

        CD.setBackground(new java.awt.Color(51, 51, 255));
        CD.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        CD.setForeground(new java.awt.Color(0, 0, 0));
        CD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona..", "IBARRA", "IST" }));
        CD.setToolTipText("");
        CD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDActionPerformed(evt);
            }
        });
        getContentPane().add(CD, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 115, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("Horario: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 140, -1, -1));

        CH.setBackground(new java.awt.Color(51, 51, 255));
        CH.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        CH.setForeground(new java.awt.Color(0, 0, 0));
        CH.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona..", "08:00:00", "09:00:00", "10:00:00", "11:00:00", "12:00:00", "13:00:00", "14:00:00" }));
        CH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHActionPerformed(evt);
            }
        });
        getContentPane().add(CH, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 120, -1));

        bactualizar.setBackground(new java.awt.Color(0, 204, 204));
        bactualizar.setForeground(new java.awt.Color(0, 0, 0));
        bactualizar.setText("Actualizar");
        bactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bactualizarActionPerformed(evt);
            }
        });
        getContentPane().add(bactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setText("ID: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 22, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Gnerar Ticket");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnuevoActionPerformed
        // TODO add your handling code here:
        habilitar();
        np.requestFocus();
    }//GEN-LAST:event_bnuevoActionPerformed

    private void bcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelarActionPerformed
        // TODO add your handling code here:
        limpiar();
        bloquear();
    }//GEN-LAST:event_bcancelarActionPerformed

    private void npActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npActionPerformed
        // TODO add your handling code here:
        np.requestFocus();
    }//GEN-LAST:event_npActionPerformed

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
        // TODO add your handling code here:
        cos.requestFocus();
    }//GEN-LAST:event_cosActionPerformed

    private void naActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naActionPerformed
        // TODO add your handling code here:
        na.requestFocus();
    }//GEN-LAST:event_naActionPerformed

    private void linActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linActionPerformed
        // TODO add your handling code here:
        lin.requestFocus();
    }//GEN-LAST:event_linActionPerformed

    private void bguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bguardarActionPerformed
            // TODO add your handling code here:
        if(this.np.getText().length()==0 || this.cos.getText().length()==0 || 
           this.na.getText().length()==0 || this.CO.getSelectedIndex()==0  || 
           this.CD.getSelectedIndex()==0 || this.CH.getSelectedIndex()==0  ||
           this.lin.getText().length()==0 || this.fech.getText().length()==0){
            JOptionPane.showMessageDialog(this,"Todos los Campos Deben Llenarse","Mensaje",1);
        }else{
                Conexion cc = new Conexion();
                Connection cn = cc.estableceConexion();
                String nom,cost,nas,li,fe;
                int or,des,hrs;
                String sql="";
                nom = np.getText();
                cost = cos.getText();
                nas = na.getText();
                or = CO.getSelectedIndex();
                des = CD.getSelectedIndex();
                hrs = CH.getSelectedIndex();
                li = lin.getText();
                fe = fech.getText();
                sql="INSERT INTO boleto(NombrePasajero_cli, Costo_cli, NA_cli, Origen_cli, Destino_cli, Horario_cli, Linea_cli, Fecha_cli) VALUES(?,?,?,?,?,?,?,?)";
                try {
                    PreparedStatement pst = cn.prepareStatement(sql);
                    pst.setString(1, nom);
                    pst.setString(2, cost);
                    pst.setString(3, nas);
                    pst.setInt(4, or);
                    pst.setInt(5, des);
                    pst.setInt(6, hrs);
                    pst.setString(7, li);
                    pst.setString(8, fe);
                    int n=pst.executeUpdate();
                    if(n>0){
                        JOptionPane.showMessageDialog(null,"Registro Guardado");
                        bloquear();
                        //cargar("");
                    }
                    limpiar();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Error de Registro");
                    Logger.getLogger(Boleto.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }//GEN-LAST:event_bguardarActionPerformed

    private void bmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmenuActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);  this.dispose();
    }//GEN-LAST:event_bmenuActionPerformed

    private void bactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bactualizarActionPerformed
        // TODO add your handling code here:
        Conexion cc = new Conexion();
        Connection cn = cc.estableceConexion();
        try{
            PreparedStatement pst = cn.prepareStatement("UPDATE boleto SET NombrePasajero_cli='"+np.getText()+"',Costo_cli='"+cos.getText()+"',NA_cli='"+na.getText()+"',Origen_cli='"+CO.getSelectedIndex()+"',Destino_cli='"+CD.getSelectedIndex()+"',Horario_cli='"+CH.getSelectedIndex()+"',Linea_cli='"+lin.getText()+"',Fecha_cli='"+fech.getName()+"' WHERE ID_cli='"+ID.getText()+"'");
            pst.executeUpdate();
            //cargar("");
            bactualizar.setEnabled(false);
            bloquear();
            limpiar();
        }
        catch(SQLException e){JOptionPane.showMessageDialog(null,e.getMessage());}
        
    }//GEN-LAST:event_bactualizarActionPerformed

    private void CDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CDActionPerformed

    private void CHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CHActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    Document documento = new Document();
     try{
     String ruta = System.getProperty("user.home");
     PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Ticket_Alumnos.pdf"));
     
     Image ticket = Image.getInstance("src/com.imagenes/ticket.png");
     ticket.scaleToFit(650, 1000);
     ticket.setAlignment(Chunk.ALIGN_CENTER);
     
     Paragraph parrafo = new Paragraph();
     parrafo.setAlignment(Paragraph.ALIGN_CENTER);
     parrafo.add("Formato creado para los Estudiantes © \n\n");
     parrafo.setFont(FontFactory.getFont("Tahoma", 18,Font.BOLD, BaseColor.DARK_GRAY));
     parrafo.add("Estudiantes Registrados \n\n");
     
     documento.open();
     documento.add(ticket);
     documento.add(parrafo);
     
     
      PdfPTable tabla = new PdfPTable(6);
      tabla.addCell("codigo");
      tabla.addCell("Nombre del pasajero");
      tabla.addCell("costo");
      tabla.addCell("N Asiento");
      tabla.addCell("origen");
      tabla.addCell("destino");
try{
Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/autbuses","root","rebeco77");
PreparedStatement pst = cn.prepareStatement("select * from boleto");
ResultSet rs = pst.executeQuery();

if (rs.next()){
 
  do{
       tabla.addCell(rs.getString(1));
       tabla.addCell(rs.getString(2));
       tabla.addCell(rs.getString(3));
       tabla.addCell(rs.getString(4));
       tabla.addCell(rs.getString(5));
       tabla.addCell(rs.getString(6));

  }while (rs.next());   
   documento.add(tabla);
   
}

}catch (DocumentException | SQLException e){

}
documento.close();
      JOptionPane.showMessageDialog(null, "Ticket Creado.");

     }catch (DocumentException | HeadlessException | FileNotFoundException e){
     System.out.println("Error en PDF " + e);
     
     }catch (IOException e){
          System.out.println("Error en la imagen " + e);

     
     }
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void COActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_COActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new NoireLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Camion.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                new Boleto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CD;
    private javax.swing.JComboBox CH;
    private javax.swing.JComboBox CO;
    private javax.swing.JTextField ID;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label7;
    private javax.swing.JButton bactualizar;
    private javax.swing.JButton bcancelar;
    private javax.swing.JButton bguardar;
    private javax.swing.JButton bmenu;
    private javax.swing.JButton bnuevo;
    private javax.swing.JTextField cos;
    private javax.swing.JTextField fech;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField lin;
    private javax.swing.JTextField na;
    private javax.swing.JTextField np;
    // End of variables declaration//GEN-END:variables
}
