package mx.uach.coffetree.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase que contiene los atributos de un Usuario.
 * @author Daniela Santillanes Castro
 */
@Entity
@Table(name="usuarios")
public class Usuario implements Serializable{  

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   
   private String contrasena;
   
   private String rol;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
        /**
     * @return the contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * @param contrasena the contrasena to set
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * @return the rol
     */
    public String getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(String rol) {
        this.rol = rol;
    }
}
