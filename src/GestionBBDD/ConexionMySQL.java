package GestionBBDD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionMySQL {

    final static Statement SENTENCIA = conexionBaseDatos();

    public static Statement conexionBaseDatos() {
        final String URL = "jdbc:mysql://localhost:3306/Cafeteria"; // Direccion BBDD
        final String USUARIO = "root"; // Nombre usuario acceder BBDD
        final String PASSWORD = "admin"; // Contraseña acceder BBDD

        try {
            // Cargar el controlador JDBC de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer conexión con BBDD
            Connection conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);

            return conexion.createStatement();

        } catch (ClassNotFoundException e) {
            // Manejar la excepción de clase no encontrada
            System.err.println("Error de clase: " + e);
        } catch (SQLException e) {
            // Manejar la excepción de SQL
            System.err.println("Error de SQL:" + e);
        }

        return null; // Retornar null en caso de error
    }

    public static int sacarIdProductos(String nombreProducto) throws SQLException {

        ResultSet resultadoConsulta = SENTENCIA.executeQuery(CONSULTA_SQL + nombreProducto);
        // Se devuelve un id con la consulta que se le ha metido
        return resultadoConsulta.getInt("id");

    }

    public static String datosProductoParaTicket(int id) throws SQLException {

        ResultSet resultadoConsulta = SENTENCIA.executeQuery("select nombre from productos where id=" + id);

        // Recoger datos del nombre
        String nombre = resultadoConsulta.getString("nombre");
        // Recoger datos de precio
        double precio = resultadoConsulta.getDouble("precio");

        return (nombre + "  " + precio);
    }

    public static String consultarDatosTickets(int id) throws SQLException {

        ResultSet resultadoConsulta = SENTENCIA.executeQuery("meter una consulta" + id);

        // Recoger datos de si está pagado
        boolean pagado = resultadoConsulta.getBoolean("pagado");
        // Recoger dato de si se ha pagado con tarjeta
        boolean pagadoTarjeta = resultadoConsulta.getBoolean("pagado_tarjeta");
        // Recoger el id de la caja del ticket
        int caja_id = resultadoConsulta.getInt("caja_id");
        // Prueba para imprimir los datos
        return (pagado + "  " + pagadoTarjeta + "  " + caja_id);
    }

    public static String consultarDatosCaja(int id) throws SQLException {

        // Se almacena la salida de la consulta
        ResultSet resultadoConsulta = SENTENCIA.executeQuery("Meter una consulta" + id);

        // Recoger datos del dinero que hay en la caja
        double dinero = resultadoConsulta.getDouble("dinero");
        // Recoger datos de la fecha en la que se hace caja
        Date fecha = resultadoConsulta.getDate("fecha");
        // Recoger los comentarios
        String comentarios = resultadoConsulta.getString("comentarios");

        return (dinero + "  " + fecha + "  " + comentarios);
    }

    public static String consultarDatosTicket_productos(int id) throws SQLException {

        // Se almacena la salida de la consulta
        ResultSet resultadoConsulta = SENTENCIA.executeQuery("meter una consulta" + id);

        // Recoger el id del ticket
        int ticket_id = resultadoConsulta.getInt("ticket_id");
        // Recoger el id del producto
        int producto_id = resultadoConsulta.getInt("producto_id");

        return (ticket_id + "  " + producto_id);
    }

}