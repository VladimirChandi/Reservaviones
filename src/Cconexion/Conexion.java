
package Cconexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {
    Connection conectar = null;
    String usuario="root";
    String contrasenia="rebeco77";
    String bd="autbuses";
    String ip="localhost";
    String puerto="3306";
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    public Connection estableceConexion(){
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    conectar=DriverManager.getConnection(cadena,usuario,contrasenia);
    boolean mensajeMostrado = false;
if (!mensajeMostrado) {
 System.out.println("Estas conectado: ");
   mensajeMostrado = false;
}

   
    }catch (Exception e){
    JOptionPane.showMessageDialog(null,"No se conecto a la base de datos error: "+ e.toString());
    }
    return conectar;
    
    }

   
}
