package mx.uach.coffetree.controllers;

import java.util.Date;
import javax.persistence.EntityManager;
import mx.uach.coffetree.conexion.Conexion;
import mx.uach.coffetree.models.Usuario;
import mx.uach.coffetree.models.Venta;

/**
 * Modelo para mappear las ventas del CoffeeTree.
 *
 * @author Daniela Santillanes Castro
 * @version 2.0
 * @since 01/12/2016
 */
public class Ventas {

    /**
     * Método para agregar una venta a la base de datos.
     *
     * @param usuario que es el usuario que realizó la venta.
     * @param total que es el total de la venta.
     * @param productId que es el id del producto que se vendio.
     * @param hora que es la fecha en que se realizo la venta.
     * @param fecha que es la fecha en que se realizo la venta.
     * @return venta.
     */
    public static Venta addVenta(Usuario usuario, Float total, Long productId, Date hora, Date fecha) {
        try {
            EntityManager em = Conexion.getInstance().getCon();

            Venta venta = new Venta(total, hora, fecha, usuario);
            em.getTransaction().begin();
            em.persist(venta);
            em.getTransaction().commit();
            return venta;
        } catch (Exception e) {
            System.out.println("ERROR ADDVENTA = " + e);
            e.printStackTrace();
        }
        return null;
    }

}
