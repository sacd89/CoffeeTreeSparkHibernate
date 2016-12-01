
package mx.uach.coffetree.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ingredientes")
public class Ingrediente implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    
    private Integer cant_disp;
    
    private Date fecha_ped;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
   
        /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cant_disp
     */
    public Integer getCant_disp() {
        return cant_disp;
    }

    /**
     * @param cant_disp the cant_disp to set
     */
    public void setCant_disp(Integer cant_disp) {
        this.cant_disp = cant_disp;
    }

    /**
     * @return the fecha_ped
     */
    public Date getFecha_ped() {
        return fecha_ped;
    }

    /**
     * @param fecha_ped the fecha_ped to set
     */
    public void setFecha_ped(Date fecha_ped) {
        this.fecha_ped = fecha_ped;
    }
}
