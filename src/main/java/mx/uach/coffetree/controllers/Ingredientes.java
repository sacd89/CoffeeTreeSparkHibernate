package mx.uach.coffetree.controllers;

import java.util.List;
import javax.persistence.EntityManager;
import mx.uach.coffetree.conexion.Conexion;

public class Ingredientes{
    
    public List<Ingredientes> cantDisp(){
        
        EntityManager em = Conexion.getInstance().getCon();
        List<Ingredientes> ingredientes = (List<Ingredientes>) 
                em.createQuery("SELECT i FROM Ingrediente i").getResultList();
        return ingredientes;

//        String query = "select * from ingredientes";
//        List<Ingredientes> precios = (List<Ingredientes>) Ingredientes.select(Conexion.getDBConexion(), query, Ingrediente.class);
//        System.out.println("cant_disp = " + precios.stream().collect(Collectors.toList()));
//        
//        return precios;
    }
    
}
