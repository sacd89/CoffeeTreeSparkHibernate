package mx.uach.coffetree.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Modelo para mappear los tickets del CoffeeTree.
 *
 * @author Daniela Santillanes Castro
 * @version 2.0
 * @since 01/12/2016
 */
@Entity
@Table(name = "ticket")
public class Ticket implements Serializable {

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
     * Método que obtiene una venta.
     *
     * @return venta que es la venta realizada.
     */
    public Venta getVenta() {
        return venta;
    }

    /**
     * Método para asignar una venta.
     *
     * @param venta que es la venta realizada.
     */
    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    /**
     * Método que obtiene un producto.
     *
     * @return producto que es el producto que se vendio.
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * Método para asignar un producto.
     *
     * @param producto que es el producto que se vendio.
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * Método que obtiene una cantidad.
     *
     * @return cant que es la cantidad que se vendio del producto.
     */
    public Integer getCant() {
        return cant;
    }

    /**
     * Método para asignar una cantidad.
     *
     * @param cant que es la cantidad que se vendio del producto.
     */
    public void setCant(Integer cant) {
        this.cant = cant;
    }

}
