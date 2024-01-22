package negocio;
import datos.ConexionBD;
import java.sql.*;

public class Select {
    public void mostrar(){
        try{
            ConexionBD bd = new ConexionBD();
            Connection conn = bd.getConnection();
            // Statement consulta = conn.createStatement();
            // ResultSet resul = consulta.executeQuery("SELECT * FROM mensaje");
            CallableStatement cosulta = conn.prepareCall("{call sp_select()}");
            ResultSet resul = cosulta.executeQuery();
            while(resul.next()){
                System.out.println(resul.getInt(1) + "&&" + resul.getString(2));
            }
            conn.close();
        }catch(Exception e){
            System.out.print("Error: " + e);
        }
    }
}
