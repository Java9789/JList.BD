package tvk.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private static Connection conex = null; 
    private static final String bd = "constructora-i";
    private static final String usuario = "root";
    private static final String clave = "johan123";
    private static final String cadena = "jdbc:mysql://localhost:3306/" + bd;
    
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance(); 
            conex = DriverManager.getConnection(cadena, usuario, clave);            
        } catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e){ 
            JOptionPane.showMessageDialog(null, "Error: " + e, "No se pudo realizar la conexión con el servidor", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        return conex;
    }        
    
}