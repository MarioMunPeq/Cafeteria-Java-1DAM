package tiposProductos;
public class Comida extends Productos {

    public Comida(String id, String nombre, double precio, int stock, boolean alergeno) {
        super(id, nombre, precio, stock, alergeno);
        // Constructor que me ha obligado a poner por tener herencia
    }

    /**
     * Metodo para mostrar los alérgenos de los productos
     * 
     * @param alergeno Si tiene o no algún alérgeno
     */
    public void mostrarAlergeno(boolean alergeno) {

        System.out.println("Los alergenos son:");

    }
}
