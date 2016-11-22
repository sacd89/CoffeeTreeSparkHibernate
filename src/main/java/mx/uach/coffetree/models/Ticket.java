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
public class Ticket implements Serializable{

    @Id
    private Long id;
  
    private Timestamp fecha_pedido;
    
    private Double total;
    
    private Timestamp fecha_entrega;
    
    private Boolean estado;

    /**
     * Método para obtener una fecha_pedido de un objeto Pedido.
     * @return the fecha_pedido
     */
    public Timestamp getFecha_pedido() {
        return fecha_pedido;
    }

    /**
     * Método para asignar una fecha_pedido de un objeto Pedido.
     * @param fecha_pedido the fecha_pedido to set
     */
    public void setFecha_pedido(Timestamp fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    /**
     * Método para obtener un total de un objeto Pedido.
     * @return the total
     */
    public Double getTotal() {
        return total;
    }

    /**
     * Método para asignar un total de un objeto Pedido.
     * @param total the total to set
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * Método para obtener una fecha_entrega de un objeto Pedido.
     * @return the fecha_entrega
     */
    public Timestamp getFecha_entrega() {
        return fecha_entrega;
    }

    /**
     * Método para asignar una fecha_entrega de un objeto Pedido.
     * @param fecha_entrega the fecha_entrega to set
     */
    public void setFecha_entrega(Timestamp fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    /**
     * Método para obtener un estado de un objeto Pedido.
     * @return the estado
     */
    public Boolean getEstado() {
        return estado;
    }

    /**
     * Método para asignar un pedido de un objeto Pedido.
     * @param estado the estado to set
     */
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
}
