package mx.uach.coffetree.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import mx.uach.coffetree.conexion.Conexion;
import mx.uach.coffetree.models.Ingrediente;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;

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

    public List<Ingrediente> cantNombreDispIngrediente() {
        EntityManager em = Conexion.getInstance().getCon();
        List<Ingrediente> ingredientes = (List<Ingrediente>) em.createQuery("SELECT cant_Disp, nombre i FROM Ingrediente i").getResultList();
        return ingredientes;
    }
    
}
