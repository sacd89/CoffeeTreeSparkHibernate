/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 *
 * @author Daniela Santillanes Castro
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

   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * @return the total
     */
    public Float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(Float total) {
        this.total = total;
    }

    /**
     * @return the hora
     */
    public Date getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(Date hora) {
        this.hora = hora;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
