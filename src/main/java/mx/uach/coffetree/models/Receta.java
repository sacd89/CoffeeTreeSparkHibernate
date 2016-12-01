
package mx.uach.coffetree.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "recetas")
public class Receta implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    private Producto producto;
    
    @ManyToOne
    private Ingrediente ingrediente;
    
    private Integer cant;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
        /**
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * @return the ingrediente
     */
    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    /**
     * @param ingrediente the ingrediente to set
     */
    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    /**
     * @return the cant
     */
    public Integer getCant() {
        return cant;
    }

    /**
     * @param cant the cant to set
     */
    public void setCant(Integer cant) {
        this.cant = cant;
    }
    
}
