package mx.uach.coffetree.controllers;

import java.util.List;
import javax.persistence.EntityManager;
import mx.uach.coffetree.conexion.Conexion;
import mx.uach.coffetree.enums.TipoProducto;
import mx.uach.coffetree.models.Producto;

/**
 * Controlador del modelo Producto.
 *
 * @author Daniela Santillanes Castro
 * @version 2.0
 * @since 01/12/2016
 */
public class Productos {

    /**
     * Método para obtener los productos por medio de su ID.
     *
     * @param id que es el id del producto.
     * @return producto.
     */
    public static Producto getProductoById(Long id) {
        try {
            EntityManager em = Conexion.getInstance().getCon();
            Producto producto = (Producto) em.createQuery("SELECT p FROM Producto p WHERE id= :id").setParameter("id", id).getSingleResult();
            return producto;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Método para obtener las crepas saladas de un ingrediente. Se utiliza
     * {@link TipoProducto} CS1.
     *
     * @return productos.
     */
    public static List<Producto> crepasUnSal() {
        try {
            System.out.println("ENTRE AL METODO CREPUNSAL");
            EntityManager em = Conexion.getInstance().getCon();
            System.out.println("ENTRE A LA CONEXION");
            List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                    + " Producto p WHERE tipoProducto = :tipo").setParameter("tipo", TipoProducto.CS1).getResultList();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Método para obtener las crepas saladas de dos ingredientes. Se utiliza
     * {@link TipoProducto} CS2.
     *
     * @return productos.
     */
    public static List<Producto> crepasDosSal() {
        try {
            EntityManager em = Conexion.getInstance().getCon();
            List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                    + " Producto p WHERE tipoProducto = :tipo").setParameter("tipo", TipoProducto.CS2).getResultList();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Método para obtener las crepas dulces de un ingrediente. Se utiliza
     * {@link TipoProducto} CD1.
     *
     * @return productos.
     */
    public static List<Producto> crepasUnDul() {
        try {
            EntityManager em = Conexion.getInstance().getCon();
            List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                    + " Producto p WHERE tipoProducto = :tipo").setParameter("tipo", TipoProducto.CD1).getResultList();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Método para obtener las crepas dulces de dos ingrediente. Se utiliza
     * {@link TipoProducto} CD2.
     *
     * @return productos.
     */
    public static List<Producto> crepasDosDul() {
        try {
            EntityManager em = Conexion.getInstance().getCon();
            List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                    + " Producto p WHERE tipoProducto = :tipo").setParameter("tipo", TipoProducto.CD2).getResultList();

            return productos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Método para obtener las bebidas calientes chicas. Se utiliza
     * {@link TipoProducto} BCC.
     *
     * @return productos.
     */
    public static List<Producto> bebidasCalientesChicas() {
        try {
            EntityManager em = Conexion.getInstance().getCon();
            List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                    + " Producto p WHERE tipoProducto = :tipo").setParameter("tipo", TipoProducto.BCC).getResultList();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Método para obtener las bebidas calientes medianas. Se utiliza
     * {@link TipoProducto} BCM.
     *
     * @return productos.
     */
    public static List<Producto> bebidasCalientesMedianas() {
        try {
            EntityManager em = Conexion.getInstance().getCon();
            List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                    + " Producto p WHERE tipoProducto = :tipo").setParameter("tipo", TipoProducto.BCM).getResultList();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Método para obtener las bebidas calientes grandes. Se utiliza
     * {@link TipoProducto} BCG.
     *
     * @return productos.
     */
    public static List<Producto> bebidasCalientesGrandes() {
        try {
            EntityManager em = Conexion.getInstance().getCon();
            List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                    + " Producto p WHERE tipoProducto = :tipo").setParameter("tipo", TipoProducto.BCG).getResultList();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Método para obtener las bebidas frias chicas. Se utiliza
     * {@link TipoProducto} BFC.
     *
     * @return productos.
     */
    public static List<Producto> bebidasFriasChicas() {
        try {
            EntityManager em = Conexion.getInstance().getCon();
            List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                    + " Producto p WHERE tipoProducto = :tipo").setParameter("tipo", TipoProducto.BFC).getResultList();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Método para obtener las bebidas frias medianas. Se utiliza
     * {@link TipoProducto} BFM.
     *
     * @return productos.
     */
    public static List<Producto> bebidasFriasMedianas() {
        try {
            EntityManager em = Conexion.getInstance().getCon();
            List<Producto> productos = (List<Producto>) em.createQuery("SELECT p FROM"
                    + " Producto p WHERE tipoProducto = :tipo").setParameter("tipo", TipoProducto.BFM).getResultList();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Método para obtener las bebidas frias grandes. Se utiliza
     * {@link TipoProducto} BFG.
     *
     * @return productos.
     */
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
}
