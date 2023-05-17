package ej2_objeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;

/**
 *
 * @author dasm
 */
public class Conexion {

    private final String usuario;
    private final String clave;
    private final String url;
    private Connection conn;
    private Statement declaracion;
    private PreparedStatement ps;

    public Conexion(String usuario, String clave, String url) {
        this.usuario = usuario;
        this.clave = clave;
        this.url = url;
        conn = null;
        ps = null;
    }

    public Conexion() {
        this.usuario = "root";
        this.clave = "admin";
        this.url = "jdbc:mysql://localhost:3306/Cafeteria";
        conn = null;
        ps = null;
    }

    public void conectar() {

        try {
            this.conn = DriverManager.getConnection(this.url, this.usuario, this.clave);

        } catch (Exception e) {
            System.out.println("Error al conectar con la base de datos");
        }

    }

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

    public ResultSet consulta(String consulta) {

        try {
            this.declaracion = (Statement) conn.createStatement();
            return this.declaracion.executeQuery(consulta);
        } catch (SQLException e) {
            System.out.println("Error");
            return null;
        }

    }

    public int actualizar(String actualiza) {

        try {
            boolean realizado;
            this.declaracion = (Statement) this.conn.createStatement();

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
