package GestionBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import interfaces.Main_botones;
import tiposProductos.Productos;

/**
 *
 * Clase que gestiona la conexión con la base de datos
 */
public class Conexion {

    private final String USUARIO;
    private final String CLAVE;
    private final String URL;
    private Connection conn;
    private Statement declaracion;
    private PreparedStatement ps;

    /**
     * Constructor vacío de la clase
     */
    public Conexion() {
        this.USUARIO = "root";
        this.CLAVE = "admin";
        this.URL = "jdbc:mysql://localhost:3306/Cafeteria";
        conn = null;
        ps = null;
    }

    public static void recogerDatosProductos() {

        try {
            // Conectamos con la base de datos
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Cafeteria", "root", "admin");
            // Creamos un Statement
            Statement sentencia = conexion.createStatement();
            // Creamos un ResultSet para guardar los datos obtenidos
            ResultSet rs = sentencia.executeQuery("SELECT * FROM productos");
            // Recorremos el resultado, mientras haya registros para leer, y escribimos el
            // resultado en pantalla.
            while (rs.next()) {
                // Guardamos los datos en un arraylist
                Main_botones.productosBBDD.add(
                        new Productos(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getInt(5)));
                /*
                 * System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +
                 * rs.getDouble(3) + " " + rs.getString(4)
                 * + " " + rs.getInt(5));
                 */
            }

            // Cerramos la conexión con la base de datos.
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Problemas con la BD");
            e.printStackTrace();
        }
    }

    /**
     * Método que conecta con la base de datos
     * 
     */
    public void conectar() {

        try {
            this.conn = DriverManager.getConnection(this.URL, this.USUARIO, this.CLAVE);

        } catch (Exception e) {
            System.out.println("Error al conectar con la base de datos");
        }

    }

    /**
     * Método que cierra la conexión con la base de datos
     * 
     * @throws SQLException
     */
    public void cierraConexion() throws SQLException {

        try {
            if (this.declaracion == null || this.declaracion.isClosed())
                this.ps.close();
            else
                this.declaracion.close();

            this.conn.close();

        } catch (Exception e) {
            System.out.println("Error al cerrar la conexión");
        }
    }

    /**
     * Método que realiza una consulta a la base de datos
     * 
     * @param consulta String con la consulta a realizar
     * @return un ResultSet con el resultado de la consulta(Todos los datos de todas
     *         las columnas)
     */
    public ResultSet consulta(String consulta) {

        try {
            this.declaracion = (Statement) conn.createStatement();
            return this.declaracion.executeQuery(consulta);
        } catch (SQLException e) {
            System.out.println("Error");
            return null;

        }

    }

    /**
     * Método que actualiza un registro de la base de datos
     * 
     * @param actualiza String con la consulta a realizar
     * @return un booleano que indica si se ha actualizado o no
     * 
     * 
     */
    public boolean actualizar(String actualiza) {

        try {
            boolean realizado;
            this.declaracion = (Statement) this.conn.createStatement();

            // ExecuteUpdate devuelve un entero con el número de filas afectadas
            if (this.declaracion.executeUpdate(actualiza) > 0) {
                realizado = true;
            } else {
                realizado = false;
            }
            return realizado;

        } catch (SQLException e) {
            return false;
        }

    }

    /**
     * Método que borra un registro de la base de datos
     * 
     * @param borra String con la consulta a realizar
     * @return un booleano que indica si se ha borrado o no
     */
    public boolean borrar(String borra) {

        try {

            boolean realizado;
            this.declaracion = (Statement) this.conn.createStatement();

            if (this.declaracion.executeUpdate(borra) > 0) {
                realizado = true;

            } else {
                realizado = false;

            }

            return realizado;

        } catch (SQLException e) {
            return false;
        }

    }

    /**
     * Método que inserta un registro en la base de datos
     * 
     * @param inserta String con la consulta a realizar
     * @return un booleano que indica si se ha insertado o no
     */
    public boolean insertar(String inserta) {

        try {

            boolean realizado;
            this.declaracion = (Statement) this.conn.createStatement();
            if (this.declaracion.executeUpdate(inserta) > 0) {
                realizado = true;

            } else {
                realizado = false;

            }
            return realizado;

        } catch (Exception e) {
            return false;
        }

    }
}
