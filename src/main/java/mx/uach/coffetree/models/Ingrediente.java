package mx.uach.coffetree.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Modelo para mappear los ingredientes del CoffeeTree.
 *
 * @author Daniela Santillanes Castro
 * @version 2.0
 * @since 01/12/2016
 */
@Entity
@Table(name = "ingredientes")
public class Ingrediente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;

    private Integer cant_disp;

    private Date fecha_ped;

    /**
     * Método que obtener el id.
     *
     * @return id del ingrediente.
     */
    public Long getId() {
        return id;
    }

    /**
     * Método que asigna un id.
     *
     * @param id que es el id del ingrediente.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Método que obtener el nombre.
     *
     * @return nombre del ingrediente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para asignar un nombre.
     *
     * @param nombre que es el nombre del ingrediente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que obtiene la cantidad disponible.
     *
     * @return cant_disp que es la cantidad disponible del ingrediente.
     */
    public Integer getCant_disp() {
        return cant_disp;
    }

    /**
     * Método para asignar una cantidad disponible.
     *
     * @param cant_disp que es la cantidad disponible del ingrediente.
     */
    public void setCant_disp(Integer cant_disp) {
        this.cant_disp = cant_disp;
    }

    /**
     * Método que obtiene la fecha de pedido.
     *
     * @return fecha_ped que es la fecha de pedido del ingrediente.
     */
    public Date getFecha_ped() {
        return fecha_ped;
    }

    /**
     * Método para asignar una fecha de pedido.
     *
     * @param fecha_ped que es la fecha de pedido del ingrediente.
     */
    public void setFecha_ped(Date fecha_ped) {
        this.fecha_ped = fecha_ped;
    }
}
