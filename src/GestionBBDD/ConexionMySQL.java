package GestionBBDD;

import java.sql.Connection;
import java.sql.Date;
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

    public static void consultarProductos(String consulta) throws SQLException {

        // Se crea un dato de tipo sentencia con el metodo para conectarme a la BBDD
        Statement sentencia = conexionBaseDatos();

        ResultSet resultadoConsulta = sentencia.executeQuery(consulta);

        System.out.println("id | nombre | precio | alergeno | stock");

        while (resultadoConsulta.next()) {
            // Recoger el id del producto
            int id = resultadoConsulta.getInt("id");
            // Recoger datos del nombre
            String nombre = resultadoConsulta.getString("nombre");
            // Recoger datos de precio
            double precio = resultadoConsulta.getDouble("precio");
            // Recoger datos de alergeno
            String alergeno = resultadoConsulta.getString("alergeno");
            // Recoger datos de stock
            int stock = resultadoConsulta.getInt("stock");
            // Prueba para imprimir los datos
            System.out.println(id + "" + nombre + "" + precio + "" + alergeno + "" + stock);
        }

    }

    public static void consultarTickets(String consulta) throws SQLException {
        // Se crea un dato de tipo sentencia con el metodo para conectarme a la BBDD
        Statement sentencia = conexionBaseDatos();

        ResultSet resultadoConsulta = sentencia.executeQuery(consulta);

        System.out.println("id | pagado | pagadoTarjeta | caja_id");

        while (resultadoConsulta.next()) {
            // Recoger el id del ticket
            int id = resultadoConsulta.getInt("id");
            // Recoger datos de si está pagado
            boolean pagado = resultadoConsulta.getBoolean("pagado");
            // Recoger dato de si se ha pagado con tarjeta
            boolean pagadoTarjeta = resultadoConsulta.getBoolean("pagado_tarjeta");
            // Recoger el id de la caja del ticket
            int caja_id = resultadoConsulta.getInt("caja_id");
            // Prueba para imprimir los datos
            System.out.println(id + "" + pagado + "" + pagadoTarjeta + caja_id);

        }

    }

    public static void consultarCaja(String consulta) throws SQLException {
        // Se crea un dato de tipo sentencia con el metodo para conectarme a la BBDD
        Statement sentencia = conexionBaseDatos();
        // Se almacena la salida de la consulta
        ResultSet resultadoConsulta = sentencia.executeQuery(consulta);

        System.out.println("id | Dinero | Fecha | Comentarios");

        while (resultadoConsulta.next()) {
            // Recoger el id de la caja
            int id = resultadoConsulta.getInt("id");
            // Recoger datos del dinero que hay en la caja
            double dinero = resultadoConsulta.getDouble("dinero");
            // Recoger datos de la fecha en la que se hace caja
            Date fecha = resultadoConsulta.getDate("fecha");
            // Recoger los comentarios
            String comentarios = resultadoConsulta.getString("comentarios");

            System.out.println(id + " " + dinero + fecha + comentarios);

        }

    }

    public static void consultarTicket_productos(String consulta) throws SQLException {

        // Se crea un dato de tipo setencia con el metodo para conectarme a la BBDD
        Statement sentencia = conexionBaseDatos();
        // Se almacena la salida de la consulta
        ResultSet resultadoConsulta = sentencia.executeQuery(consulta);

        System.out.println("id | Ticket_id | Producto_id | Cantidad");

        while (resultadoConsulta.next()) {
            // Recoger el id
            int id = resultadoConsulta.getInt("id");
            // Recoger el id del ticket
            int ticket_id = resultadoConsulta.getInt("ticket_id");
            // Recoger el id del producto
            int producto_id = resultadoConsulta.getInt("producto_id");
            // Recoger la cantidad de cada producto
            int cantidad = resultadoConsulta.getInt("cantidad");

            System.out.println(id + ticket_id + producto_id + cantidad);

        }

    }

}