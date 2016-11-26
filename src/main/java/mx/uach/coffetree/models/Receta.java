
package mx.uach.coffetree.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recetas")
public class Receta implements Serializable{

    @Id
    private Integer receta_id;
    
    private Producto producto;
    
    private Ingrediente ingrediente;
    
    private Float cant;

    public Integer getReceta_id() {
        return receta_id;
    }

    public void setReceta_id(Integer receta_id) {
        this.receta_id = receta_id;
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
    public Float getCant() {
        return cant;
    }

    /**
     * @param cant the cant to set
     */
    public void setCant(Float cant) {
        this.cant = cant;
    }
    
}
