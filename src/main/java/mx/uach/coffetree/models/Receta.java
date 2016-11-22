
package mx.uach.coffetree.models;

import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Receta implements Serializable{

    @Id
    private Long id;
    
    private BigDecimal cant;
    private BigDecimal ingrediente_id;
    
    public BigDecimal getIngrediente_id() {
        return ingrediente_id;
    }

    public void setIngrediente_id(BigDecimal ingrediente_id) {
        this.ingrediente_id = ingrediente_id;
    }

    public BigDecimal getCant() {
        return cant;
    }

    public void setCant(BigDecimal cant) {
        this.cant = cant;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
}
