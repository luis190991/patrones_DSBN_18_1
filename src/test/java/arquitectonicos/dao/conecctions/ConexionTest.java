package arquitectonicos.dao.conecctions;

import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;
import java.util.logging.Logger;

/**
 * Created by luis on 16/03/18.
 */
public class ConexionTest {
    @Test
    public void conecctionSingletonTest(){
        try{
            Conexion con = Conexion.getInstance();
            Assert.assertFalse(con.getConn().isClosed());
        }catch (ClassNotFoundException | SQLException ex){
            Logger.getAnonymousLogger().warning("La conexión es invalida.");
        }
   }
}
