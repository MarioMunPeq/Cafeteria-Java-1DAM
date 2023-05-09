package GestionBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Se importa la librería SQL 

public class ConexionMySQL {

    public static void enviarComandoSQL(String SentenciaSQL) {

        String url = "jdbc:mysql://localhost:3306/Cafeteria"; // La dirección de la base de datos(libreria de MySQL,
                                                              // localhost es donde se ejecuta la base de datos, 3306 es
                                                              // el puerto, y Cafetería el nombre de la base de datos )
        String usuario = "root"; // El nombre de usuario con el que se va a acceder a la base de datos
        String password = "admin123@"; // La contraseña usuario !!!!!! OJO QUE LA CONTRASEÑA SEA LA CORRECTA
        try {
            // Cargar el controlador JDBC de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver"); // Este comando carga el driver MySQL en la clase
            // Establecer la conexión con la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, password); // Utilizas el driver MySQL y te
                                                                                       // conectas a la base de datos
                                                                                       // utilizando la ruta de la
                                                                                       // propia base, el usuario y la
                                                                                       // contraseña correspondientes
            // Ejecutar la sentencia SQL
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(SentenciaSQL); // se manda a la base de datos la variable
                                                                        // "SQL", que es
                                                                        // el String de entrada del método

            // Se recorre el resultado
            /* 
            while (resultado.next()) {
                int id = resultado.getInt("id"); // Se busca en la tabla una columna que se llame 'id' y se asocia a una
                                                 // variable con su mismo nombre y tipo
                String nombre = resultado.getString("nombre"); // Se busca en la tabla una columna que se llame "nombre"
                                                               // y se asocia a una variable con su mismo nombre y tipo
                float precio = resultado.getFloat("precio"); // Se busca en la tabla una columna que se llame "precio" y
                                                             // se asocia a una variable con su mismo nombre y tipo
                String alergeno = resultado.getString("alergeno"); // Se busca en la tabla una columna que se llame
                                                                   // "alergeno" y se asocia a una variable con su mismo
                                                                   // nombre y tipo
                int stock = resultado.getInt("stock"); // Se busca en la tabla una columna que se llame "stock" y se
                                                       // asocia a una variable con su mismo nombre y tipo
            }
            */
            conexion.close(); // Cerrar la conexión
        } catch (SQLException sqlException) {
            System.err.println("Ha habido un error relacionado con MySQL");
        } catch (ClassNotFoundException classNotFoundException) {
            System.err.println("No se ha podido encontrar el driver para conectar con MySQL");
        } catch (Exception e) {
            System.err.println("Error sin identificar");
        }

    }
}