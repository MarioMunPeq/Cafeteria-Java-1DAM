package GestionBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionMySQL {

    public static Statement conexionBaseDatos() {
        final String URL = "jdbc:mysql://localhost:3306/Cafeteria"; // Direccion BBDD
        final String USUARIO = "root"; // Nombre usuario acceder BBDD
        final String PASSWORD = "admin"; // Contraseña acceder BBDD

        try {
            // Cargar el controlador JDBC de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer conexión con BBDD
            Connection conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);

            Statement sentencia = conexion.createStatement();

            return sentencia;
        } catch (ClassNotFoundException e) {
            // Manejar la excepción de clase no encontrada
            System.err.println("Error: " + e);
        } catch (SQLException e) {
            // Manejar la excepción de SQL
            System.err.println("Error:" + e);
        }

        return null; // Retornar null en caso de error
    }

    public static void consultarProductos(String consultaProductos) throws SQLException {

        // Se crea un dato de tipo sentencia con el metodo general para conectarme a
        Statement sentencia = conexionBaseDatos();

        ResultSet resultadoConsulta = sentencia.executeQuery(consultaProductos);

        while (resultadoConsulta.next()) {
            // Recoger datos de id
            int id = resultadoConsulta.getInt("id");
            System.out.println(id);
            // Recoger datos del nombre
            String nombre = resultadoConsulta.getString("nombre");
            System.out.println(nombre);
            // Recoger datos de precio
            double precio = resultadoConsulta.getDouble("precio");
            System.out.println(precio);
            // Recoger datos de alergeno
            String alergeno = resultadoConsulta.getString("alergeno");
            System.out.println(alergeno);
            // Recoger datos de stock
            int stock = resultadoConsulta.getInt("stock");
            System.out.println(stock);
        }

    }

}