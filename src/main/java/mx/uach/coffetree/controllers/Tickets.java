package mx.uach.coffetree.controllers;

import javax.persistence.EntityManager;
import mx.uach.coffetree.conexion.Conexion;
import mx.uach.coffetree.models.Ticket;

public class Tickets{
    
    public Ticket addTicket(Long ventaId, Long productoId, Double cant){
        EntityManager em = Conexion.getInstance().getCon();
        Ticket ticket = (Ticket) em.createQuery(String.format("INSERT INTO Ticket v"
                + "(venta_id, producto_id, cant) VALUES "
                + "(%s,%s,%s);", ventaId, productoId, cant));
        em.getTransaction().begin();
        em.persist(ticket);
        em.getTransaction().commit();
        return ticket;
    }
    
}
