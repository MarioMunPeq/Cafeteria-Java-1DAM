package tiposProductos;
import java.util.Objects;
public class OtrasBebidas extends Productos {

    public OtrasBebidas(String id, String nombre, double precio, int stock, boolean alergeno) {
        super(id, nombre, precio, stock, alergeno);
        // Constructor que me ha obligado a poner por tener herencia
    }

    private Boolean tieneAlcohol;
    private String tipo;
    private Boolean combinado;

    public void suplementoCombinado() {

        // Restar stock de ambos?

        // precio= precio + suplemento;

    }


    public Boolean isTieneAlcohol() {
        return this.tieneAlcohol;
    }

    public Boolean getTieneAlcohol() {
        return this.tieneAlcohol;
    }

    public void setTieneAlcohol(Boolean tieneAlcohol) {
        this.tieneAlcohol = tieneAlcohol;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean isCombinado() {
        return this.combinado;
    }

    public Boolean getCombinado() {
        return this.combinado;
    }

    public void setCombinado(Boolean combinado) {
        this.combinado = combinado;
    }

    public OtrasBebidas tieneAlcohol(Boolean tieneAlcohol) {
        setTieneAlcohol(tieneAlcohol);
        return this;
    }

    public OtrasBebidas tipo(String tipo) {
        setTipo(tipo);
        return this;
    }

    public OtrasBebidas combinado(Boolean combinado) {
        setCombinado(combinado);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof OtrasBebidas)) {
            return false;
        }
        OtrasBebidas otrasBebidas = (OtrasBebidas) o;
        return Objects.equals(tieneAlcohol, otrasBebidas.tieneAlcohol) && Objects.equals(tipo, otrasBebidas.tipo) && Objects.equals(combinado, otrasBebidas.combinado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tieneAlcohol, tipo, combinado);
    }

    @Override
    public String toString() {
        return "{" +
            " tieneAlcohol='" + isTieneAlcohol() + "'" +
            ", tipo='" + getTipo() + "'" +
            ", combinado='" + isCombinado() + "'" +
            "}";
    }
    
}
