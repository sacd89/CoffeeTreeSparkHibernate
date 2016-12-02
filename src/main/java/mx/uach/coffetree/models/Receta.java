
package mx.uach.coffetree.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Modelo para mappear las recetas del CoffeeTree.
 *
 * @author Daniela Santillanes Castro
 * @version 2.0
 * @since 01/12/2016
 */
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

    /**
     * Método que obtiene el id.
     *
     * @return id que es el id del producto.
     */
    public Long getId() {
        return id;
    }

    /**
     * Método para asignar un id.
     *
     * @param id que es el id del producto.
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * Método que obtiene el producto.
     * @return producto que es el producto asignado a la receta.
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * Método para asignar un producto,
     * 
     * @param producto que es el producto asignado a la receta.
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * Método que obtiene el ingrediente.
     * 
     * @return ingrediente que es el ingrediente de la receta del producto.
     */
    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    /**
     * Método para asignar un ingrediente.
     * 
     * @param ingrediente que es el ingrediente de la receta del producto.
     */
    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    /**
     * Método que obtiene la cantidad.
     * 
     * @return cant que es la cantidad del ingrediente.
     */
    public Integer getCant() {
        return cant;
    }

    /**
     * Método para asignar una cantidad.
     * 
     * @param cant que es la cantidad del ingrediente.
     */
    public void setCant(Integer cant) {
        this.cant = cant;
    }
    
}
