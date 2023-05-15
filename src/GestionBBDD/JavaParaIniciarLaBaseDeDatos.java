package GestionBBDD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JavaParaIniciarLaBaseDeDatos {

    /**
     * Metodo que crea la base de datos y le asigna los valores iniciales.
     * Debe ser llamado nada más iniciarse la apliación
     * 
     */
    public static void iniciarBBDD() {

        String url = "jdbc:mysql://localhost:3306/Cafeteria";
        String user = "root";
        String password = "admin";
        String archivoSql = "BBDD\\CreacionBBDD.sql";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            // Crear la conexión a la base de datos
            Connection conn = DriverManager.getConnection(url, user, password);

            // Crear el objeto Statement
            Statement stmt = conn.createStatement();

            // Abrir el archivo SQL y leerlo línea por línea
            BufferedReader reader = new BufferedReader(new FileReader(archivoSql));
            String lineaSql = reader.readLine();
            while (lineaSql != null) {
                // Ejecutar cada línea del archivo SQL
                stmt.execute(lineaSql);
                lineaSql = reader.readLine();
            }

            // Cerrar el archivo y los objetos Statement y Connection
            reader.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            // Manejar cualquier excepción que pueda surgir al ejecutar los comandos SQL
            System.out.println(e);
        }
    }

}