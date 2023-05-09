package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class Conexion {

    //conexion local
    public static Connection conectar() {

        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_sistema_inventario?useSSL=false", "root", "12345");
            return conexion;
        } catch (SQLException e) {
            System.out.println("Error en la conexion local" + e);
        }
        return null;
    }
}
