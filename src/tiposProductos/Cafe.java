package tiposProductos;
import java.util.Objects;

public class Cafe extends Productos {

    
    private static final float SUPLEMENTOLECHE = 0.7f;

    public Cafe(int id, String nombre, float precio, int stock, String alergeno) {
        super(id, nombre, precio, stock, alergeno);
        // Constructor que me ha obligado a poner por tener herencia
    }

    private String tipoCafe;
    private Boolean descafeinado;
    private String tipoLeche;
    


    public String getTipoCafe() {
        return this.tipoCafe;
    }

    public void setTipoCafe(String tipoCafe) {
        this.tipoCafe = tipoCafe;
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
        return Objects.equals(tipoCafe, cafe.tipoCafe) && Objects.equals(descafeinado, cafe.descafeinado) && Objects.equals(tipoLeche, cafe.tipoLeche);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoCafe, descafeinado, tipoLeche);
    }

    @Override
    public String toString() {
        return "{" +
            " tipoCafe='" + getTipoCafe() + "'" +
            ", descafeinado='" + isDescafeinado() + "'" +
            ", tipoLeche='" + getTipoLeche() + "'" +
            "}";
    }
    
}
