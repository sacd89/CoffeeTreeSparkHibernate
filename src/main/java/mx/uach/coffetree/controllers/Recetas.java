package mx.uach.coffetree.controllers;

import java.util.List;
import javax.persistence.EntityManager;
import mx.uach.coffetree.conexion.Conexion;
import mx.uach.coffetree.models.Receta;

/**
 * Controlador del modelo Receta.
 *
 * @author Daniela Santillanes Castro
 * @version 2.0
 * @since 01/12/2016
 */
public class Recetas {

    /**
     * Método para obtener las recetas por su ID.
     * 
     * @param idProd que es el id del Producto.
     * @return receta.
     */
    public static List<Receta> getRecetaByProducto(Long idProd) {
        try {
            EntityManager em = Conexion.getInstance().getCon();
            List<Receta> receta = (List<Receta>) em.createQuery("SELECT r FROM "
                    + "Receta r WHERE producto_id = :idProd").
                    setParameter("idProd", idProd).getResultList();
            return receta;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
