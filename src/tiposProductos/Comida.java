package tiposProductos;
public class Comida extends Productos {

    public Comida(int id, String nombre, double precio, String alergeno,int stock) {
        super(id, nombre, precio, alergeno, stock);
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
