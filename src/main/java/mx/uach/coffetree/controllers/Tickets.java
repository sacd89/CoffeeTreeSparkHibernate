package mx.uach.coffetree.controllers;

import javax.persistence.EntityManager;
import mx.uach.coffetree.conexion.Conexion;
import mx.uach.coffetree.models.Producto;
import mx.uach.coffetree.models.Ticket;
import mx.uach.coffetree.models.Venta;

public class Tickets{
    
    public static Ticket addTicket(Venta venta, Producto producto, Integer cant){
        try{
        EntityManager em = Conexion.getInstance().getCon();
//        Ticket ticket = (Ticket) em.createQuery(String.format("INSERT INTO Ticket v"
//                + "(v.producto_id, v.cant) VALUES "
//                + "(%s,%s)", productoId, cant));
        Ticket ticket = new Ticket(venta, producto, cant);
        em.getTransaction().begin();
        em.persist(ticket);
        em.getTransaction().commit();
        return ticket;
        }catch(Exception e){
            System.out.println("ERROR ADD TICKET = " + e);
        }
        return null;
    }
    
}
