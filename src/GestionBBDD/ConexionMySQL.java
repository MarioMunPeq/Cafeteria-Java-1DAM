package GestionBBDD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionMySQL {

    static Statement SENTENCIA = conexionBaseDatos();
    private static final String CONSULTA_SQL = "Select id from productos where nombre =";

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

    public static int sacarIdProductos(String nombreProducto) {

        ResultSet resultadoConsulta = null;
        try {
            resultadoConsulta = SENTENCIA.executeQuery(CONSULTA_SQL + nombreProducto);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Se devuelve un id con la consulta que se le ha metido
        try {
            return resultadoConsulta.getInt("id");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;

    }

    public static String datosProductoParaTicket(int id) {

        ResultSet resultadoConsulta = null;
        try {
            resultadoConsulta = SENTENCIA.executeQuery("SELECT * FROM productos WHERE ID=" + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Recoger datos del nombre
        String nombre = null;
        try {
            nombre = resultadoConsulta.getString("nombre");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Recoger datos de precio
        double precio = 0;
        try {
            precio = resultadoConsulta.getDouble("precio");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return (nombre + "  " + precio);
    }

    public static String consultarDatosTickets(int id) {

        ResultSet resultadoConsulta = null;
        try {
            resultadoConsulta = SENTENCIA.executeQuery("SELECT * FROM tickets WHERE ID=" + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Recoger datos de si está pagado
        boolean pagado = false;
        try {
            pagado = resultadoConsulta.getBoolean("pagado");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Recoger dato de si se ha pagado con tarjeta
        boolean pagadoTarjeta = false;
        try {
            pagadoTarjeta = resultadoConsulta.getBoolean("pagado_tarjeta");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Recoger el id de la caja del ticket
        int caja_id = 0;
        try {
            caja_id = resultadoConsulta.getInt("caja_id");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Prueba para imprimir los datos
        return (pagado + "  " + pagadoTarjeta + "  " + caja_id);
    }

    public static String consultarDatosCaja(int id) {

        // Se almacena la salida de la consulta
        ResultSet resultadoConsulta = null;
        try {
            resultadoConsulta = SENTENCIA.executeQuery("SELECT * FROM caja WHERE ID=" + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Recoger datos del dinero que hay en la caja
        double dinero = 0;
        try {
            dinero = resultadoConsulta.getDouble("dinero");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Recoger datos de la fecha en la que se hace caja
        Date fecha = null;
        try {
            fecha = resultadoConsulta.getDate("fecha");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Recoger los comentarios
        String comentarios = null;
        try {
            comentarios = resultadoConsulta.getString("comentarios");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return (dinero + "  " + fecha + "  " + comentarios);
    }

    public static String consultarDatosTicket_productos(int id) {

        // Se almacena la salida de la consulta
        ResultSet resultadoConsulta = null;
        try {
            resultadoConsulta = SENTENCIA.executeQuery("SELECT * FROM ticket_productos" + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Recoger el id del ticket
        int ticket_id = 0;
        try {
            ticket_id = resultadoConsulta.getInt("ticket_id");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Recoger el id del producto
        int producto_id = 0;
        try {
            producto_id = resultadoConsulta.getInt("producto_id");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return (ticket_id + "  " + producto_id);
    }

}