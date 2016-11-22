
package mx.uach.coffetree.models;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ingrediente implements Serializable{

    @Id
    private Long id;
    
    private String nombre_ingrediente;
    
    private Double cantidad_disponible;
    
    private Timestamp fecha_caducidad;
    
    private Timestamp fecha_pedido;
   
    public String getNombre() {
        return nombre_ingrediente;
    }

  
    public void setNombre(String nombre_ingrediente) {
        this.nombre_ingrediente = nombre_ingrediente;
    }


    public Double getCant_disp() {
        return cantidad_disponible;
    }

 
    public void setCant_disp(Double cantidad_disponible) {
        this.cantidad_disponible = cantidad_disponible;
    }


    public Timestamp getFecha_cad() {
        return fecha_caducidad;
    }

  
    public void setFecha_cad(Timestamp fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    public Timestamp getFecha_ped() {
        return fecha_pedido;
    }

 
    public void setFecha_ped(Timestamp fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
