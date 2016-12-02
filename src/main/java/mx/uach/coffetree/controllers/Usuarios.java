package mx.uach.coffetree.controllers;

import javax.persistence.EntityManager;
import mx.uach.coffetree.conexion.Conexion;
import mx.uach.coffetree.models.Usuario;

/**
 * Controlador del modelo Usuario.
 *
 * @author Daniela Santillanes Castro
 * @version 2.0
 * @since 01/12/2016
 */
public class Usuarios {

    /**
     * Método para verificar que el inicio de sesión sea correcto.
     * 
     * @param usuario que es el nombre del usuario.
     * @param contra que es la contraseña del usuario.
     * @return user.
     */
    public static Usuario checkUsuario(String usuario, String contra) {
        try {
            EntityManager em = Conexion.getInstance().getCon();
            Usuario user = (Usuario) em.createQuery("SELECT u FROM Usuario u WHERE u.rol LIKE :usuario").setParameter("usuario", usuario).getSingleResult();
            if (!user.equals(null)) {
                if (user.getRol().equals(usuario) && user.getContrasena().equals(contra)) {
                    return user;
                }
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
