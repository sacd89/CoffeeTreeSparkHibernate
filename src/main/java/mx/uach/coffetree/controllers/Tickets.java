package mx.uach.coffetree.controllers;

import javax.persistence.EntityManager;
import mx.uach.coffetree.conexion.Conexion;
import mx.uach.coffetree.models.Producto;
import mx.uach.coffetree.models.Ticket;
import mx.uach.coffetree.models.Venta;

/**
 * Controlador del modelo Ticket.
 *
 * @author Daniela Santillanes Castro
 * @version 2.0
 * @since 01/12/2016
 */
public class Tickets {

    /**
     * Método para agregar un Ticket a la base de datos.
     *
     * @param venta que es la venta que se realizo.
     * @param producto que es el producto que se vendió.
     * @param cant que es la cantidad del producto que se vendió.
     * @return ticket.
     */
    public static Ticket addTicket(Venta venta, Producto producto, Integer cant) {
        try {
            EntityManager em = Conexion.getInstance().getCon();
            Ticket ticket = new Ticket(venta, producto, cant);
            em.getTransaction().begin();
            em.persist(ticket);
            em.getTransaction().commit();
            return ticket;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
