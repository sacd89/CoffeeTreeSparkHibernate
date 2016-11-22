package mx.uach.coffetree.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import mx.uach.coffetree.enums.Permiso;

/**
 * Clase que contiene los atributos de un Usuario.
 * @author Daniela Santillanes Castro
 */
@Entity
public class Usuario implements Serializable{  

    @Id
    private Long id;
    
    private String contra;
    private Permiso rol_us;

    /**
     * Método para obtener un usuario de un objeto Usuario.
     * @return the usuario
     */
    public String getContrasena() {
        return contra;
    }

    /**
     * Método para asignar un usuario de un objeto Usuario.
     * @param contra the usuario to set
     */
    public void setContrasena(String contra) {
        this.contra = contra;
    }

    /**
     * Método para obtener una contrasena de un objeto Usuario.
     * @return the contrasena
     */
    public Permiso getRol() {
        return rol_us;
    }

    /**
     * Método para asignar una contraseña de un objeto Usuario.
     * @param rol_us the contrasena to set
     */
    public void setRol(Permiso rol_us) {
        this.rol_us = rol_us;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
