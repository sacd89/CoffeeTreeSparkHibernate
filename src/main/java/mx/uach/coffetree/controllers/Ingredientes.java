package mx.uach.coffetree.controllers;

import javax.persistence.EntityManager;
import mx.uach.coffetree.conexion.Conexion;
import mx.uach.coffetree.models.Ingrediente;

/**
 * Controlador del modelo Ingrediente.
 *
 * @author Daniela Santillanes Castro
 * @version 2.0
 * @since 01/12/2016
 */
public class Ingredientes {

    /**
     * Método donde obtenemos los ingredientes por medio de su ID.
     *
     * @param id que es el id del ingrediente.
     * @return ingredientes.
     */
    public static Ingrediente getIngredienteById(Long id) {
        try {
            EntityManager em = Conexion.getInstance().getCon();
            Ingrediente ingredientes = (Ingrediente) em.createQuery(
                    "SELECT i FROM Ingrediente i WHERE id=:id").setParameter("id", id).getSingleResult();
            return ingredientes;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Método donde actualizamos el campo de cantidad de la tabla Ingredientes.
     *
     * @param id que es el id del ingrediente.
     * @param cant que es la nueva cantidad a actualizar.
     * @return ingrediente.
     */
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
