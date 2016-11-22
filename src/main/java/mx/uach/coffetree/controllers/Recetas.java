package mx.uach.coffetree.controllers;

import java.util.List;
import javax.persistence.EntityManager;
import mx.uach.coffetree.conexion.Conexion;
import mx.uach.coffetree.models.Receta;


public class Recetas{
    
//    public static String checkUsuario(String usuario, String contra){
//        String query = "select * from usuarios where rol like '"+usuario+"' and contrasena like '"+contra+"'";
//        List<Usuario> usuarios = (List<Usuario>) Recetas.select(Conexion.getDBConexion(), query, Usuario.class);
//        
//        if(!usuarios.isEmpty()){
//            try{
//            if(usuarios.get(0).getRol().equals(usuario) && usuarios.get(0).getContrasena().equals(contra)){
//                if(usuarios.get(0).getRol().equals("Administrador")){
//                    return "admin";
//                    }else{
//                    return "Cajero";
//                    }
//                }
//            }catch(Exception e){
//                JOptionPane.showMessageDialog(null, "Acceso como Cajero.");
//                return "Cajero";
//            }
//        }else{
//            return "";
//        }
//        return "";
//    }
    
    public static List<Receta> recetaMostrar(String nom){

        EntityManager em = Conexion.getInstance().getCon();
//        INVESTIGAR CONSULTAS
        List<Receta> recetas = em.createQuery(String.format("SELECT p FROM"
                + "Producto p WHERE nombre LIKE %s", nom)).getResultList();

//        String query = "select * from productos where nombre like '" + nom +"%'";
//        List<Recetas> recetas = (List<Recetas>) Recetas.select(Conexion.getDBConexion(), query, Receta.class);
//        System.out.println("productos = " + recetas.stream().collect(Collectors.toList()));
        
        return recetas;
    }
}
