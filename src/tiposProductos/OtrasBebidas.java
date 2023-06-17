package tiposProductos;

public class OtrasBebidas extends Productos {

    public OtrasBebidas(int id, String nombre, double precio, String alergeno, int stock) {
        super(id, nombre, precio, alergeno, stock);
        // Constructor que me ha obligado a poner por tener herencia
    }

    private Boolean tieneAlcohol;
    private String nombre;

    public Boolean isTieneAlcohol() {
        return this.tieneAlcohol;
    }

    public Boolean getTieneAlcohol() {
        return this.tieneAlcohol;
    }

    public void setTieneAlcohol(Boolean tieneAlcohol) {
        this.tieneAlcohol = tieneAlcohol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public OtrasBebidas tieneAlcohol(Boolean tieneAlcohol) {
        setTieneAlcohol(tieneAlcohol);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                " tieneAlcohol='" + isTieneAlcohol() + "'" +
                ", tipo='" + getNombre() + "'" +
                "}";
    }

}
