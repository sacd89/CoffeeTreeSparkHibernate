package mx.uach.coffetree.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import mx.uach.coffetree.enums.TipoProducto;

/**
 * Modelo para mappear los productos del CoffeeTree.
 *
 * @author Daniela Santillanes Castro
 * @version 2.0
 * @since 01/12/2016
 */
@Entity
@Table(name = "productos")
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;

    private Float precio;

    @Enumerated(EnumType.STRING)
    private TipoProducto tipoProducto;

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
     * Método que obtiene el nombre.
     *
     * @return nombre que es el nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para asignar un nombre.
     *
     * @param nombre que es el nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que obtiene el precio.
     *
     * @return precio que es el precio del producto.
     */
    public Float getPrecio() {
        return precio;
    }

    /**
     * Método para asignar el precio.
     *
     * @param precio que es el precio del producto.
     */
    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    /**
     * Método que obtiene el tipo de producto.
     *
     * @return tipoProducto que es el tipo de producto.
     */
    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    /**
     * Método para asignar un tipo de producto.
     *
     * @param tipoProducto que es el tipo de producto.
     */
    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

}
