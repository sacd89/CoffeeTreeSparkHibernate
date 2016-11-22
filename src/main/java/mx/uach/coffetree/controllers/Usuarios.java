package mx.uach.coffetree.controllers;

import javax.persistence.EntityManager;
import mx.uach.coffetree.conexion.Conexion;
import mx.uach.coffetree.models.Usuario;

public class Usuarios{

    public String checkUsuario(String usuario, String contra) {
        EntityManager em = Conexion.getInstance().getCon();
//        INVESTIGAR CONSULTAS
        Usuario usuarios = (Usuario) em.createQuery(String.format("SELECT p FROM"
                + "Usuario p WHERE rol LIKE %s AND contasena LIKE %s", usuario, contra)).getSingleResult();

//        String query = "select * from usuarios where rol like '"+usuario+"' and contrasena like '"+contra+"'";
//        List<Usuario> usuarios = (List<Usuario>) Usuarios.select(Conexion.getDBConexion(), query, Usuario.class);
        if (!usuarios.equals(null)) {
            if (usuarios.getRol().equals(usuario) && usuarios.getContrasena().equals(contra)) {
                if (usuarios.getRol().equals("Administrador")) {
                    return "admin";
                } else {
                    return "Cajero";
                }
            }
        } else {
            return "";
        }
        return "";
//        if (!usuarios.equals(null)) {
//            if (usuarios.getRol().equals(usuario) && usuarios.getContrasena().equals(contra)) {
//                if (usuarios.getRol().equals(Roles.ADMIN)) {
//                    return Roles.ADMIN;
//                } else {
//                    return Roles.CAJERO;
//                }
//            }
//        } else {
//            return null;
//        }
//        return null;
    }
}
