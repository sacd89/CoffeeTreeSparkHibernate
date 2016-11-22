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

        EntityManager em = Conexion.getInstance().getCon();
//        INVESTIGAR CONSULTAS
        List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                + "Producto p WHERE nombre LIKE 'Crepa jamon' OR nombre LIKE 'Crepa queso'"
                + "OR nombre LIKE 'Crepa champ%' AND nombre NOT LIKE 'Crepa champhi'").getResultList();

//        String query = "select * from productos where nombre like 'Crepa jamon' or nombre like 'Crepa queso' or nombre like 'Crepa champ%' and nombre not like 'Crepa champhi'";
//        List<Productos> productos = (List<Productos>) Productos.select(Conexion.getDBConexion(), query, Producto.class);
//        System.out.println("productos = " + productos.stream().collect(Collectors.toList()));
        return productos;
    }

    public static List<Producto> crepasDosSal() {

        EntityManager em = Conexion.getInstance().getCon();
//        INVESTIGAR CONSULTAS
        List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                + "Producto p WHERE nombre LIKE '%quesoc%' OR nombre LIKE '%quesom%'"
                + "OR nombre LIKE '%quesop%' OR nombre LIKE '%jamonc%'"
                + "OR nombre LIKE '%jamonp%' OR nombre LIKE '%champhi%'").getResultList();

//        String query = "select * from productos where nombre like '%quesoc%' or nombre like '%quesom%' or nombre like '%quesop%' or nombre like '%jamonc%' or nombre like '%jamonp%' or nombre like '%champhi%'";
//        List<Productos> productos = (List<Productos>) Productos.select(Conexion.getDBConexion(), query, Producto.class);
//        System.out.println("productos = " + productos.stream().collect(Collectors.toList()));
        return productos;
    }

    public static List<Producto> crepasUnDul() {

        EntityManager em = Conexion.getInstance().getCon();
//        INVESTIGAR CONSULTAS
        List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                + "Producto p WHERE nombre LIKE '%philad%' OR nombre LIKE "
                + "'%nutella%' OR nombre LIKE '%leche%' OR nombre LIKE "
                + "'%cajeta%' OR nombre LIKE 'Crepa fresa' OR nombre LIKE "
                + "'%zarzamora%'").getResultList();

//        String query = "select * from productos where nombre like '%philad%' or nombre like '%nutella%' or nombre like '%leche%' or nombre like '%cajeta%' or nombre like 'Crepa fresa' or nombre like '%zarzamora%'";
//        List<Productos> productos = (List<Productos>) Productos.select(Conexion.getDBConexion(), query, Producto.class);
//        System.out.println("productos = " + productos.stream().collect(Collectors.toList()));
        return productos;
    }

    public static List<Producto> crepasDosDul() {

        EntityManager em = Conexion.getInstance().getCon();
//        INVESTIGAR CONSULTAS
        List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                + "Producto p WHERE nombre LIKE '%nutcaje%' OR nombre LIKE "
                + "'%nutelphia%' OR nombre LIKE '%nutfresa%' OR nombre LIKE "
                + "'%nutzarza%' OR nombre LIKE '%nutchera%' OR nombre LIKE "
                + "'%cajelphia%' OR nombre LIKE '%cajfresa%'OR nombre LIKE "
                + "'%cajzarza%' OR nombre LIKE '%cajchera%' OR nombre LIKE "
                + "'%philafresa%' OR nombre LIKE '%philazarza%' OR nombre LIKE "
                + "'%philachera%' OR nombre LIKE '%frezarza%' OR nombre LIKE "
                + "'%frechera%' OR nombre LIKE '%zarzachera%'").getResultList();
//        String query = "select * from productos where nombre like '%nutcaje%' or nombre like '%nutelphia%' or nombre like '%nutfresa%' or nombre like '%nutzarza%' or nombre like '%nutchera%' or nombre like '%cajelphia%' or nombre like '%cajfresa%'or nombre like '%cajzarza%' or nombre like '%cajchera%' or nombre like '%philafresa%' or nombre like '%philazarza%' or nombre like '%philachera%' or nombre like '%frezarza%' or nombre like '%frechera%' or nombre like '%zarzachera%'";
//        List<Productos> productos = (List<Productos>) Productos.select(Conexion.getDBConexion(), query, Producto.class);
//        System.out.println("productos = " + productos.stream().collect(Collectors.toList()));

        return productos;
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
