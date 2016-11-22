
package mx.uach.coffetree.controllers;

import java.sql.Timestamp;
import javax.persistence.EntityManager;
import mx.uach.coffetree.conexion.Conexion;
import mx.uach.coffetree.models.Venta;

public class Ventas{
     
    public Venta getVentaMaxima(Long id){
        EntityManager em = Conexion.getInstance().getCon();
//        INVESTIGAR CONSULTAS
        Venta venta = (Venta) em.createQuery(String.format("SELECT MAX(%s)", id));
        em.getTransaction().begin();
        em.persist(venta);
        em.getTransaction().commit();
        return venta;
    }
    
    public Venta addVenta(Long usuarioId, Double total, Long ventaId, Timestamp hora, Timestamp fecha, String metodoClave){
        EntityManager em = Conexion.getInstance().getCon();
        Venta venta = (Venta) em.createQuery(String.format("INSERT INTO Venta v"
                + "(usuarioId, total, ventaId, hora, fecha, metodoClave) VALUES "
                + "(%s,%s,%s,%s,%s,%s);", usuarioId, total, ventaId, hora, fecha, metodoClave));
        em.getTransaction().begin();
        em.persist(venta);
        em.getTransaction().commit();
        return venta;
    }
            
//            List<Receta> upd = new ArrayList<>();
//            List<Receta> ide = new ArrayList<>();
//            total = Float.parseFloat(lblTotal.getText());
//            //Aqui sacamos el ultimo id de venta agregado
//            
//                Ventas.executeQuery(Conexion.getDBConexion(), String.format("insert into ticket(venta_id, producto_id,cant) values(%s, %s, %s)",1,this.mod.getValueAt(x, 0),mod.getValueAt(x, 2)));
//                upd= (List<Receta>) Recetas.select(Conexion.getDBConexion(), String.format("select cant from recetas where producto_id like '%s'",this.mod.getValueAt(x, 0)), Receta.class);
//                ide= (List<Receta>) Recetas.select(Conexion.getDBConexion(), String.format("select ingrediente_id from recetas where producto_id like '%s'",this.mod.getValueAt(x, 0)), Receta.class);
//               for(int up=0;up<upd.size();up++){  
//                Receta update = (Receta) upd.get(up);
//                Receta ing_id = (Receta) ide.get(up);
//                
//                Recetas.executeQuery(Conexion.getDBConexion(), String.format("update ingredientes set cant_disp=cant_disp-(%s*%s) where ingrediente_id like '%s'",mod.getValueAt(x, 2),update.getCant(),ing_id.getIngrediente_id()));
//               
//                }
//            }
}
