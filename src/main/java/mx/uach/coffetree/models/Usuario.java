package mx.uach.coffetree.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Modelo para mappear los usuarios del CoffeeTree.
 *
 * @author Daniela Santillanes Castro
 * @version 2.0
 * @since 01/12/2016
 */
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String contrasena;

    private String rol;

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
     * Método que obtiene una contraseña.
     *
     * @return contrasena que es la contraseña del usuario.
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Método para asignar una contraseña.
     *
     * @param contrasena que es la contraseña del usuario.
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * Método que obtiene un rol de usuario.
     *
     * @return rol que es el rol del usuario.
     */
    public String getRol() {
        return rol;
    }

    /**
     * Método para asignar un rol de usuario.
     *
     * @param rol que es el rol del usuario.
     */
    public void setRol(String rol) {
        this.rol = rol;
    }
}
