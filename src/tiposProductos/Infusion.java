package tiposProductos;
import java.util.Objects;
public class Infusion extends Productos {

    public Infusion(String id, String nombre, double precio, int stock, boolean alergeno) {
        super(id, nombre, precio, stock, alergeno);
        // Constructor que me ha obligado a poner por tener herencia
    }

    private String tipoInfusion;
    private Boolean sinTeina;
    private String tipoLeche;

    /**
     * Metodo que dependiendo el tipo de leche que tengas sumará una cantidad u
     * otra;
     * 
     * @param tipoLeche
     */
    public void sumarComplementoTipoLeche(String tipoLeche) {

        // precio= precio + complementoLeche;

    }


    public String getTipoInfusion() {
        return this.tipoInfusion;
    }

    public void setTipoInfusion(String tipoInfusion) {
        this.tipoInfusion = tipoInfusion;
    }

    public Boolean isSinTeina() {
        return this.sinTeina;
    }

    public Boolean getSinTeina() {
        return this.sinTeina;
    }

    public void setSinTeina(Boolean sinTeina) {
        this.sinTeina = sinTeina;
    }

    public String getTipoLeche() {
        return this.tipoLeche;
    }

    public void setTipoLeche(String tipoLeche) {
        this.tipoLeche = tipoLeche;
    }

    public Infusion tipoInfusion(String tipoInfusion) {
        setTipoInfusion(tipoInfusion);
        return this;
    }

    public Infusion sinTeina(Boolean sinTeina) {
        setSinTeina(sinTeina);
        return this;
    }

    public Infusion tipoLeche(String tipoLeche) {
        setTipoLeche(tipoLeche);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Infusion)) {
            return false;
        }
        Infusion infusion = (Infusion) o;
        return Objects.equals(tipoInfusion, infusion.tipoInfusion) && Objects.equals(sinTeina, infusion.sinTeina) && Objects.equals(tipoLeche, infusion.tipoLeche);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoInfusion, sinTeina, tipoLeche);
    }

    @Override
    public String toString() {
        return "{" +
            " tipoInfusion='" + getTipoInfusion() + "'" +
            ", sinTeina='" + isSinTeina() + "'" +
            ", tipoLeche='" + getTipoLeche() + "'" +
            "}";
    }
    
}
