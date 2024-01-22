package datos;
import java.sql.*;

public class ConexionBD {
    Connection conn = null;
    public ConexionBD(){
        String url = "jdbc:mysql://localhost:3306/saludos";
        String user = "root", password = "";
        try{
            conn = DriverManager.getConnection(url,user,password);
        }catch(SQLException e){
            System.out.print("Error!" + e.getMessage());
        }
    }

    public Connection getConnection(){
        return this.conn;
    }

    public void desconectar(){
        if(conn != null){
            try{
                conn.close();
            }catch(SQLException e){
                System.out.println("Error de desconexion " + e.getMessage());
            }
        }
    }
}
