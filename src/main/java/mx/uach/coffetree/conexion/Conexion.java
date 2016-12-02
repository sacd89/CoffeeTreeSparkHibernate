package mx.uach.coffetree.conexion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Modelo donde se implementa con el patrón de diseño Singleton el manejador de
 * EntityManager.
 * 
 * @author Daniela Santillanes Castro
 * @version 2.0
 * @since 01/12/2016
 */
public class Conexion {

    private static Conexion INSTANCE;
    private EntityManager em;

    /**
     * Constructor vacio de la Conexión.
     */
    private Conexion() {
        this.initConection();
    }

    /**
     * Método donde creamos el EntityManager.
     */
    private void initConection() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CoffeeTreePU");
        em = emf.createEntityManager();
    }

    /**
     * Método que obtiene la instancia de la conexión de la base de datos.
     *
     * @return INSTANCE que es la instancia que creamos.
     */
    public static Conexion getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Conexion();
        }
        return INSTANCE;
    }

    /**
     * Método que obtiene la conexión.
     *
     * @return con que es la conexión de la base de datos.
     */
    public EntityManager getCon() {
        return em;
    }

}
