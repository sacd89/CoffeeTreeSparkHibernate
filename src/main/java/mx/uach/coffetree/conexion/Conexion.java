package mx.uach.coffetree.conexion;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Conexion {

    private static Conexion INSTANCE;
    private EntityManager em;

    private Conexion() {
        this.initConection();
    }

    private void initConection() {
        em = Persistence.createEntityManagerFactory("CoffeeTreePU").createEntityManager();
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
