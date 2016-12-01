/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.coffetree.models;

import java.io.Serializable;
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
@Table(name="ticket")
public class Ticket implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    private Venta venta;
    
    @ManyToOne
    private Producto producto;
    
    private Integer cant;

    public Ticket() {
    }
    
    public Ticket(Venta venta, Producto producto, Integer cant) {
        this.venta = venta;
        this.producto = producto;
        this.cant = cant;
    }

    public Ticket(Long id, Venta venta, Producto producto, Integer cant) {
        this.id = id;
        this.venta = venta;
        this.producto = producto;
        this.cant = cant;
    }
    
   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
        /**
     * @return the venta
     */
    public Venta getVenta() {
        return venta;
    }

    /**
     * @param venta the venta to set
     */
    public void setVenta(Venta venta) {
        this.venta = venta;
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
