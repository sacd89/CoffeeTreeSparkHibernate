package mx.uach.coffetree.controllers;

import java.util.List;
import javax.persistence.EntityManager;
import mx.uach.coffetree.conexion.Conexion;
import mx.uach.coffetree.models.Receta;


public class Recetas{
    
    public static List<Receta> recetaMostrar(String nom){

        EntityManager em = Conexion.getInstance().getCon();
//        INVESTIGAR CONSULTAS
        List<Receta> recetas = em.createQuery(String.format("SELECT p FROM"
                + "Receta p WHERE nombre LIKE %s", nom)).getResultList();

//        String query = "select * from productos where nombre like '" + nom +"%'";
//        List<Recetas> recetas = (List<Recetas>) Recetas.select(Conexion.getDBConexion(), query, Receta.class);
//        System.out.println("productos = " + recetas.stream().collect(Collectors.toList()));
        
        return recetas;
    }
    
    public static List<Receta> getRecetaByProducto(Long idProd){
        try{
         EntityManager em = Conexion.getInstance().getCon();
         List<Receta> receta = (List<Receta>) em.createQuery("select r from Receta r where producto_id = :idProd").setParameter("idProd", idProd).getResultList();
        return receta;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
}
