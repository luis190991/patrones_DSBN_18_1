package arquitectonicos.dao.conecctions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by luis on 16/03/18.
 */
public class Conexion {

    private Connection conn = null;
    private static Conexion conexion;

    private Conexion() throws SQLException, ClassNotFoundException{
        this.createConexion();
    }

    public static Conexion getInstance() throws SQLException, ClassNotFoundException{
        if(conexion ==null){
            conexion = new Conexion();
        }
        return conexion;
    }

    private void createConexion()throws SQLException, ClassNotFoundException{
        String urlDatabase =  "jdbc:postgresql://localhost:5432/hr2";
        Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection(urlDatabase,  "hr2", "1234567890");
    }

    public Connection getConn() {
        return conn;
    }
}
