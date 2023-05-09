package GestionBBDD;

import java.sql.*;

public class ConexionMySQL {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/Cafeteria";
        String usuario = "root";
        String password = "admin";

        try {
            // Cargar el controlador JDBC de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión con la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, password);

            // Crear una sentencia SQL
            String sql = "SELECT * FROM productos";

            // Ejecutar la sentencia SQL
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(sql);

            // Recorrer el resultado y mostrar los datos
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                float precio = resultado.getFloat("precio");
                String alergeno = resultado.getString("alergeno");
                int stock = resultado.getInt("stock");
                System.out.println("Producto: " + nombre + " Precio: " + precio);
            }

            // Cerrar la conexión
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}