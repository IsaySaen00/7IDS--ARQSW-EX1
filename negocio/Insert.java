package negocio;
import datos.ConexionBD;
import java.sql.*;
import java.util.Scanner;

public class Insert {
    Scanner leer = new Scanner(System.in);
    String msg = null;
    public void insertar(){
        try{
            ConexionBD bd = new ConexionBD();
            Connection conn = bd.getConnection();
            // Statement sentencia = conn.createStatement();
            msg = leer.nextLine();
            // sentencia.executeUpdate("INSERT INTO mensaje VALUES (null, '"+msg+"')");
            CallableStatement stmt = conn.prepareCall("{call sp_insert(?)}");
            stmt.setString(1, msg);
            stmt.execute();
            conn.close();
        }catch(SQLException e){
            System.out.print("Error!" + e.getMessage());
    
        }
    }
}
