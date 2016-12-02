package mx.uach.coffetree.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Modelo para mappear las ventas del CoffeeTree.
 *
 * @author Daniela Santillanes Castro
 * @version 2.0
 * @since 01/12/2016
 */
@Entity
@Table(name="ventas")
public class Venta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   
   private Float total;
   
   private Date hora;
   
   private Date fecha;
   
   @ManyToOne
   private Usuario usuario;

    public Venta() {
    }
    
    public Venta(Float total, Date hora, Date fecha, Usuario usuario) {
        this.total = total;
        this.hora = hora;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public Venta(Long id, Float total, Date hora, Date fecha, Usuario usuario) {
        this.id = id;
        this.total = total;
        this.hora = hora;
        this.fecha = fecha;
        this.usuario = usuario;
    }

   
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
     * Método que obtiene el total de la venta.
     * 
     * @return total que es el total de la venta.
     */
    public Float getTotal() {
        return total;
    }

    /**
     * Método para asignar un total a la venta.
     * 
     * @param total que es el total de la venta.
     */
    public void setTotal(Float total) {
        this.total = total;
    }

    /**
     * Método que obtiene la hora de la venta.
     * 
     * @return hora que es la hora de la venta.
     */
    public Date getHora() {
        return hora;
    }

    /**
     * Método para asignar una hora a la venta.
     * 
     * @param hora que es la hora de la venta.
     */
    public void setHora(Date hora) {
        this.hora = hora;
    }

    /**
     * Método que obtiene la fecha de la venta.
     * 
     * @return fecha que es la fecha de la venta.
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Método para asignar una fecha a la venta.
     * 
     * @param fecha que es la fecha de la venta.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Método que obtiene el usuario que realizo la venta.
     * 
     * @return usuario que es el usuario que realizo la venta.
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Método para asignar un usuario que realizo la venta.
     * 
     * @param usuario que es el usuarui que realizo la venta.
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
