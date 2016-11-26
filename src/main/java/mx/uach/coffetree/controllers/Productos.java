package mx.uach.coffetree.controllers;

import java.util.List;
import javax.persistence.EntityManager;
import mx.uach.coffetree.conexion.Conexion;
import mx.uach.coffetree.models.Producto;

public class Productos{

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
        try{
        EntityManager em = Conexion.getInstance().getCon();
//        INVESTIGAR CONSULTAS
        List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                + " Producto p WHERE nombre LIKE 'Crepa jamon' OR nombre LIKE 'Crepa queso'"
                + "OR nombre LIKE 'Crepa champ%' AND nombre NOT LIKE 'Crepa champhi'").getResultList();

//        String query = "select * from productos where nombre like 'Crepa jamon' or nombre like 'Crepa queso' or nombre like 'Crepa champ%' and nombre not like 'Crepa champhi'";
//        List<Productos> productos = (List<Productos>) Productos.select(Conexion.getDBConexion(), query, Producto.class);
//        System.out.println("productos = " + productos.stream().collect(Collectors.toList()));
        return productos;
        }catch(Exception e){
            System.out.println("ERRORCREPASUNSAL = " + e);
        }
        return null;
    }

    public static List<Producto> crepasDosSal() {
        try{
        EntityManager em = Conexion.getInstance().getCon();
        List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                + " Producto p WHERE nombre LIKE '%quesoc%' OR nombre LIKE '%quesom%'"
                + "OR nombre LIKE '%quesop%' OR nombre LIKE '%jamonc%'"
                + "OR nombre LIKE '%jamonp%' OR nombre LIKE '%champhi%'").getResultList();
        return productos;
        }catch(Exception e){
            System.out.println("ERRORCREPASDOSSAL = " + e);
        }
        return null;
    }

    public static List<Producto> crepasUnDul() {
        try{
        EntityManager em = Conexion.getInstance().getCon();
        List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                + " Producto p WHERE nombre LIKE '%philad%' OR nombre LIKE "
                + "'%nutella%' OR nombre LIKE '%leche%' OR nombre LIKE "
                + "'%cajeta%' OR nombre LIKE 'Crepa fresa' OR nombre LIKE "
                + "'%zarzamora%'").getResultList();
        }catch(Exception e){
            System.out.println("ERRORCREPAUNDULCE:  = " + e );
        }
        return null;
    }

    public static List<Producto> crepasDosDul() {
        try{
        EntityManager em = Conexion.getInstance().getCon();
//        INVESTIGAR CONSULTAS
        List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                + " Producto p WHERE nombre LIKE '%nutcaje%' OR nombre LIKE "
                + "'%nutelphia%' OR nombre LIKE '%nutfresa%' OR nombre LIKE "
                + "'%nutzarza%' OR nombre LIKE '%nutchera%' OR nombre LIKE "
                + "'%cajelphia%' OR nombre LIKE '%cajfresa%'OR nombre LIKE "
                + "'%cajzarza%' OR nombre LIKE '%cajchera%' OR nombre LIKE "
                + "'%philafresa%' OR nombre LIKE '%philazarza%' OR nombre LIKE "
                + "'%philachera%' OR nombre LIKE '%frezarza%' OR nombre LIKE "
                + "'%frechera%' OR nombre LIKE '%zarzachera%'").getResultList();
        return productos;
        }catch(Exception e){
            System.out.println("ERRORCREPASDOSDULCES = " + e);
        }
        return null;
    }

    public static List<Producto> productosRecetas() {

         EntityManager em = Conexion.getInstance().getCon();
//        INVESTIGAR CONSULTAS
        List<Producto> productos = (List<Producto>) em.createQuery("SELECT "
                + "p.nombre FROM Producto p").getResultList();
        
//        String query = "select nombre from productos";
//        List<Productos> productos = (List<Productos>) Productos.select(Conexion.getDBConexion(), query, Producto.class);
//        System.out.println("productos = " + productos.stream().collect(Collectors.toList()));

        return productos;
    }
}
