package tiposProductos;
import java.util.Objects;
public class Cafe extends Productos {

    private static final double SUPLEMENTOGRANO = 0.5;
    private static final double SUPLEMENTOLECHE = 0.7;

    public Cafe(int id, String nombre, double precio, int stock, boolean alergeno) {
        super(id, nombre, precio, stock, alergeno);
        // Constructor que me ha obligado a poner por tener herencia
    }

    private String tipoCafe;
    private String tipoGrano;
    private Boolean descafeinado;
    private String tipoLeche;


    /**
     * 
     * @return el precio con el suplemento por el tipo de grano sumado
     */
    public double suplementoTipoGrano() {

        return precio + SUPLEMENTOGRANO;
    }

    /**
     * 
     * @return el precio con el suplemento por el tipo de leche sumado
     */
    public double suplementoTipoLeche() {

        return precio + SUPLEMENTOLECHE;
    }


    public String getTipoCafe() {
        return this.tipoCafe;
    }

    public void setTipoCafe(String tipoCafe) {
        this.tipoCafe = tipoCafe;
    }

    public String getTipoGrano() {
        return this.tipoGrano;
    }

    public void setTipoGrano(String tipoGrano) {
        this.tipoGrano = tipoGrano;
    }

    public Boolean isDescafeinado() {
        return this.descafeinado;
    }

    public Boolean getDescafeinado() {
        return this.descafeinado;
    }

    public void setDescafeinado(Boolean descafeinado) {
        this.descafeinado = descafeinado;
    }

    public String getTipoLeche() {
        return this.tipoLeche;
    }

    public void setTipoLeche(String tipoLeche) {
        this.tipoLeche = tipoLeche;
    }

    public Cafe tipoCafe(String tipoCafe) {
        setTipoCafe(tipoCafe);
        return this;
    }

    public Cafe tipoGrano(String tipoGrano) {
        setTipoGrano(tipoGrano);
        return this;
    }

    public Cafe descafeinado(Boolean descafeinado) {
        setDescafeinado(descafeinado);
        return this;
    }

    public Cafe tipoLeche(String tipoLeche) {
        setTipoLeche(tipoLeche);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cafe)) {
            return false;
        }
        Cafe cafe = (Cafe) o;
        return Objects.equals(tipoCafe, cafe.tipoCafe) && Objects.equals(tipoGrano, cafe.tipoGrano) && Objects.equals(descafeinado, cafe.descafeinado) && Objects.equals(tipoLeche, cafe.tipoLeche);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoCafe, tipoGrano, descafeinado, tipoLeche);
    }

    @Override
    public String toString() {
        return "{" +
            " tipoCafe='" + getTipoCafe() + "'" +
            ", tipoGrano='" + getTipoGrano() + "'" +
            ", descafeinado='" + isDescafeinado() + "'" +
            ", tipoLeche='" + getTipoLeche() + "'" +
            "}";
    }
    
}
