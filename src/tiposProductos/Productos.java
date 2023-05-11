package tiposProductos;
/**
 * Clase padre productos
 */
public class Productos {

    protected int id; // Numero identificativo del producto
    protected String nombre; // Nombre del producto
    protected double precio; // Lo que cuesta el producto
    protected int stock; // Las unidades que quedan del producto
    protected String alergeno; // Si tiene o no alérgeno (?)
    
    
    protected static final String LECHE_ENTERA = "Entera";
    protected static final String LECHE_SEMI = "Semi";
    protected static final String LECHE_DESNATADA = "Desnatada";
    protected static final String LECHE_AVENA = "Avena";
    protected static final String LECHE_SOJA = "Soja";
    protected static final String LECHE_SINLACTOSA = "SinLactosa";
    
    
    
    /**
     * 
     * @param stock
     */
    public void reponer(int stock) {
        
          if (stock < 60) {
          System.out.println("Queda menos de un 30%, toca reponer");
          }
         
    }

    /**
     * Dejo este método de placeholder de momento, porque no se realmente como
     * habría que restar
     * 
     * @param stock Hay que meter el stock que hay (?)
     * @return que devuelva el stock final, o modificar el stock que ya hay (?)
     */
    public int restarStock(int stock) {

        int nuevoStock;

        nuevoStock = stock - 1;

        return nuevoStock;
    }

    /**
     * Metodo para mostrar los alérgenos de los productos
     * 
     * @param alergeno Si tiene o no algún alérgeno
     */
    public void mostrarAlergeno(String alergeno) {

        System.out.println("Los alergenos son:");

    }

    /**
     * Constructor completo del producto
     * 
     * @param id
     * @param nombre
     * @param precio
     * @param stock
     * @param alergeno
     */
    public Productos(int id, String nombre, double precio, int stock, String alergeno) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.alergeno = alergeno;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String isAlergeno() {
        return alergeno;
    }

    public void setAlergeno(String alergeno) {
        this.alergeno = alergeno;
    }

}