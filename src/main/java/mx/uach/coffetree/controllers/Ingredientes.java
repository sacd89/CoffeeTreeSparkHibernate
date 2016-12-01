package mx.uach.coffetree.controllers;

import java.util.List;
import javax.persistence.EntityManager;
import mx.uach.coffetree.conexion.Conexion;
import mx.uach.coffetree.models.Ingrediente;

public class Ingredientes {

    public List<Ingrediente> getIngredientes() {

        EntityManager em = Conexion.getInstance().getCon();
        List<Ingrediente> ingredientes = (List<Ingrediente>) em.createQuery("SELECT i FROM Ingrediente i").getResultList();
        return ingredientes;

//        String query = "select * from ingredientes";
//        List<Ingredientes> precios = (List<Ingredientes>) Ingredientes.select(Conexion.getDBConexion(), query, Ingrediente.class);
//        System.out.println("cant_disp = " + precios.stream().collect(Collectors.toList()));
//
//        return precios;
    }

    public static Ingrediente getIngredienteById(Long id) {
        try {
            EntityManager em = Conexion.getInstance().getCon();
            Ingrediente ingredientes = (Ingrediente) em.createQuery(
                    "SELECT i FROM Ingrediente i WHERE id=:id").setParameter("id", id).getSingleResult();
            return ingredientes;
        } catch (Exception e) {
            System.out.println("AQUI ES EL ERROR");
            e.printStackTrace();
        }
        return null;
    }

    public static Ingrediente updateIngredienteById(Long id, Integer cant) {
        try {
            EntityManager em = Conexion.getInstance().getCon();
            Ingrediente ingrediente = getIngredienteById(id);
            em.getTransaction().begin();
            ingrediente.setCant_disp(cant);
            em.persist(ingrediente);
            em.getTransaction().commit();
            return ingrediente;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
