package mx.uach.coffetree.controllers;

import javax.persistence.EntityManager;
import mx.uach.coffetree.conexion.Conexion;
import mx.uach.coffetree.models.Usuario;

public class Usuarios {

    public static String checkUsuario(String usuario, String contra) {
        try {
            EntityManager em = Conexion.getInstance().getCon();
            Usuario user = (Usuario) em.createQuery("SELECT u FROM Usuario u WHERE u.rol LIKE :usuario").setParameter("usuario", usuario).getSingleResult();
            if (!user.equals(null)) {
                if (user.getRol().equals(usuario) && user.getContrasena().equals(contra)) {
                    if (user.getRol().equals("Administrador")) {
                        return "admin";
                    } else {
                        return "Cajero";
                    }
                }
            } else {
                return "";
            }
        } catch (Exception e) {
            System.out.println("ERROR CHECKUSUARIO " + e);
        }
        return "";
    }
}
