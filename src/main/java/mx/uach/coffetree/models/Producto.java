
package mx.uach.coffetree.models;

import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Producto implements Serializable{

    @Id
    private Long id;
    
    private String nombre_producto;
    
    private Double precio_producto;

    public String getNombre() {
        return nombre_producto;
    }

    
    public void setNombre(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    
    public Double getPrecio() {
        return precio_producto;
    }

    
    public void setPrecio(Double precio_producto) {
        this.precio_producto = precio_producto;
    }

    @Override
    public String toString() {
        return this.nombre_producto; 
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
   

   
    
}
