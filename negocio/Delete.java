package negocio;
import datos.ConexionBD;
import java.sql.*;
import java.util.Scanner;

public class Delete {
    Scanner leer = new Scanner(System.in);
    String msg = null;
    int idr;
    public void eliminar(){
        try{
            ConexionBD bd = new ConexionBD();
            Connection conn = bd.getConnection();
            // Statement sentencia = conn.createStatement();
            System.out.print("ID del registro a eliminar: ");
            idr = leer.nextInt();
            // sentencia.executeUpdate("DELETE FROM mensaje WHERE id ="+idr);
            CallableStatement stmt = conn.prepareCall("{call sp_delete(?)}");
            stmt.setInt(1, idr);
            stmt.execute();
            conn.close();
        }catch(SQLException e){
            System.out.print("Error!" + e.getMessage());
        }
    }
}
