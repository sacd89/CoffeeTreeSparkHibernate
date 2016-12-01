package mx.uach.coffetree.controllers;

import java.util.List;
import javax.persistence.EntityManager;
import mx.uach.coffetree.conexion.Conexion;
import mx.uach.coffetree.enums.TipoProducto;
import mx.uach.coffetree.models.Producto;

public class Productos {

    public static List<Producto> productosMostrar(String nom) {

        EntityManager em = Conexion.getInstance().getCon();
//        INVESTIGAR CONSULTAS
        List<Producto> productos = (List<Producto>) em.createQuery(String.format("SELECT p FROM"
                + "Producto p WHERE nombre LIKE %s", nom)).getResultList();

//        String query = "select * from productos where nombre like '" + nom +"%'";
//        List<Productos> productos = (List<Productos>) Productos.select(Conexion.getDBConexion(), query, Producto.class);
//        System.out.println("productos = " + productos.stream().collect(Collectors.toList()));
//        
        return productos;
    }
    
    public static Producto getProductoById(Long id){
        try{
        EntityManager em = Conexion.getInstance().getCon();
        Producto producto = (Producto) em.createQuery("SELECT p FROM Producto p WHERE id= :id").setParameter("id", id).getSingleResult();
        return producto;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static List<Producto> productosMostrarNo(String nom, String nomno) {

        EntityManager em = Conexion.getInstance().getCon();
//        INVESTIGAR CONSULTAS
        List<Producto> productos = (List<Producto>) em.createQuery(String.format("SELECT p FROM"
                + "Producto p WHERE nombre LIKE %s AND NOT nombre LIKE %s", nom, nomno)).getResultList();
//        String query = "select * from productos where nombre like '" + nom +"%' and not nombre like'"
//                        + nomno + "%'";
//        List<Productos> productos = (List<Productos>) Productos.select(Conexion.getDBConexion(), query, Producto.class);
//        System.out.println("productos = " + productos.stream().collect(Collectors.toList()));
//        
        return productos;
    }

    public static List<Producto> crepasUnSal() {
        try {
            System.out.println("ENTRE AL METODO CREPUNSAL");
            EntityManager em = Conexion.getInstance().getCon();
            System.out.println("ENTRE A LA CONEXION");
            List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                    + " Producto p WHERE tipoProducto = :tipo").setParameter("tipo", TipoProducto.CS1).getResultList();
            return productos;
        } catch (Exception e) {
            System.out.println("ERRORCREPASUNSAL = " + e);
        }
        return null;
    }

    public static List<Producto> crepasDosSal() {
        try {
            EntityManager em = Conexion.getInstance().getCon();
            List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                    + " Producto p WHERE tipoProducto = :tipo").setParameter("tipo", TipoProducto.CS2).getResultList();
            return productos;
        } catch (Exception e) {
            System.out.println("ERRORCREPASDOSSAL = " + e);
        }
        return null;
    }

    public static List<Producto> crepasUnDul() {
        try {
            EntityManager em = Conexion.getInstance().getCon();
            List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                    + " Producto p WHERE tipoProducto = :tipo").setParameter("tipo", TipoProducto.CD1).getResultList();
            return productos;
        } catch (Exception e) {
            System.out.println("ERRORCREPAUNDULCE:  = " + e);
        }
        return null;
    }

    public static List<Producto> crepasDosDul() {
        try {
            EntityManager em = Conexion.getInstance().getCon();
            List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                    + " Producto p WHERE tipoProducto = :tipo").setParameter("tipo", TipoProducto.CD2).getResultList();

            return productos;
        } catch (Exception e) {
            System.out.println("ERRORCREPASDOSDULCES = " + e);
        }
        return null;
    }

    public static List<Producto> bebidasCalientesChicas() {
        try {
            EntityManager em = Conexion.getInstance().getCon();
            List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                    + " Producto p WHERE tipoProducto = :tipo").setParameter("tipo", TipoProducto.BCC).getResultList();
            return productos;
        } catch (Exception e) {
            System.out.println("ERRORBEBIDASCALIENTES = " + e);
        }
        return null;
    }
    
    public static List<Producto> bebidasCalientesMedianas() {
        try {
            EntityManager em = Conexion.getInstance().getCon();
            List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                    + " Producto p WHERE tipoProducto = :tipo").setParameter("tipo", TipoProducto.BCM).getResultList();
            return productos;
        } catch (Exception e) {
            System.out.println("ERRORBEBIDASCALIENTES = " + e);
        }
        return null;
    }
    
    public static List<Producto> bebidasCalientesGrandes() {
        try {
            EntityManager em = Conexion.getInstance().getCon();
            List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                    + " Producto p WHERE tipoProducto = :tipo").setParameter("tipo", TipoProducto.BCG).getResultList();
            return productos;
        } catch (Exception e) {
            System.out.println("ERRORBEBIDASCALIENTES = " + e);
        }
        return null;
    }

    public static List<Producto> bebidasFriasChicas() {
        try {
            EntityManager em = Conexion.getInstance().getCon();
            List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                    + " Producto p WHERE tipoProducto = :tipo").setParameter("tipo", TipoProducto.BFC).getResultList();
            return productos;
        } catch (Exception e) {
            System.out.println("ERRORBEBIDASFRIAS = " + e);
        }
        return null;
    }
    
    public static List<Producto> bebidasFriasMedianas() {
        try {
            EntityManager em = Conexion.getInstance().getCon();
            List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                    + " Producto p WHERE tipoProducto = :tipo").setParameter("tipo", TipoProducto.BFM).getResultList();
            return productos;
        } catch (Exception e) {
            System.out.println("ERRORBEBIDASFRIAS = " + e);
        }
        return null;
    }
    
    public static List<Producto> bebidasFriasGrandes() {
        try {
            EntityManager em = Conexion.getInstance().getCon();
            List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                    + " Producto p WHERE tipoProducto = :tipo").setParameter("tipo", TipoProducto.BFG).getResultList();
            return productos;
        } catch (Exception e) {
            System.out.println("ERRORBEBIDASFRIAS = " + e);
        }
        return null;
    }

    public static List<Producto> productosRecetas() {

        EntityManager em = Conexion.getInstance().getCon();
        List<Producto> productos = (List<Producto>) em.createQuery("SELECT "
                + "p.nombre FROM Producto p").getResultList();

//        String query = "select nombre from productos";
//        List<Productos> productos = (List<Productos>) Productos.select(Conexion.getDBConexion(), query, Producto.class);
//        System.out.println("productos = " + productos.stream().collect(Collectors.toList()));
        return productos;
    }
}
