/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.coffetree.models;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author kenia_000
 */
@Entity
public class Venta implements Serializable {

    @Id
    private Long id;

    private Ticket ticket;

    private Double total;

    private Timestamp fecha;

    private Timestamp hora;

    private Long MAX;
    
    private String metodo_clave;

    /**
     * @return the ticket
     */
    public Ticket getTicket() {
        return ticket;
    }

    /**
     * @param ticket the ticket to set
     */
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    /**
     * Método para obtener un total de un objeto Pedido.
     *
     * @return the total
     */
    public Double getTotal() {
        return total;
    }

    /**
     * Método para asignar un total de un objeto Pedido.
     *
     * @param total the total to set
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    public Long getMax() {
        return MAX;
    }

    public void setMax(Long MAX) {
        this.MAX = MAX;
    }

    public int toInteger(){
        return MAX.intValue();
    }
    
    public Timestamp getFecha() {
        return fecha;
    }

    /**
     * Método para asignar un nombre_ingrediente a un objeto Ingrediente.
     *
     * @param fecha_pedido the id_proveedor to set
     */
    public void setFecha(Timestamp fecha_pedido) {
        this.fecha = fecha_pedido;
    }

    public Timestamp getHora() {
        return hora;
    }

    public void setHora(Timestamp hora) {
        this.hora = hora;
    }

    public String getMetodo_clave() {
        return metodo_clave;
    }

    public void setMetodo_clave(String metodo_clave) {
        this.metodo_clave = metodo_clave;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
