package PropiedadIntelectual.datos.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private static final String USUARIO = "sa";
    private static final String CLAVE   = "SteinersGama";
    public static Connection ObtenerConexion(){
        try{
            String URL = "jdbc:sqlserver://192.168.42.146:1433;databaseName=PropiedadIntelectual";
            Connection cn = DriverManager.getConnection(URL,USUARIO,CLAVE);
            return cn;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
