package tiposProductos;
import java.util.Objects;
public class Infusion extends Productos {

    public Infusion(int id, String nombre, double precio, String alergeno,int stock) {
        super(id, nombre, precio, alergeno, stock);
        // Constructor que me ha obligado a poner por tener herencia
    }

    
    private String tipoLeche;


    public String getTipoLeche() {
        return this.tipoLeche;
    }

    public void setTipoLeche(String tipoLeche) {
        this.tipoLeche = tipoLeche;
    }

   

    public Infusion tipoLeche(String tipoLeche) {
        setTipoLeche(tipoLeche);
        return this;
    }

    
    @Override
    public String toString() {
        return " tipoLeche: " + getTipoLeche();
    }
    
}
