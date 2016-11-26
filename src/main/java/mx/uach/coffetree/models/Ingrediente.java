
package mx.uach.coffetree.models;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ingredientes")
public class Ingrediente implements Serializable{

    @Id
    private Integer ingrediente_id;
    
    private String nombre;
    
    private Float cant_disp;
    
    private Date fecha_ped;

    public Integer getIngrediente_id() {
        return ingrediente_id;
    }

    public void setIngrediente_id(Integer ingrediente_id) {
        this.ingrediente_id = ingrediente_id;
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
    public Float getCant_disp() {
        return cant_disp;
    }

    /**
     * @param cant_disp the cant_disp to set
     */
    public void setCant_disp(Float cant_disp) {
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
