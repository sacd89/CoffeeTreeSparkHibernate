/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.coffetree;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mx.uach.coffetree.controllers.Ingredientes;
import mx.uach.coffetree.controllers.Productos;
import mx.uach.coffetree.controllers.Recetas;
import mx.uach.coffetree.controllers.Tickets;
import mx.uach.coffetree.controllers.Usuarios;
import mx.uach.coffetree.controllers.Ventas;
import mx.uach.coffetree.models.Ingrediente;
import mx.uach.coffetree.models.Producto;
import mx.uach.coffetree.models.Receta;
import mx.uach.coffetree.models.Usuario;
import mx.uach.coffetree.models.Venta;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.velocity.VelocityTemplateEngine;

/**
 * Clase main donde tenemos las rutas de nuestra aplicación.
 *
 * @author Daniela Santillanes Castro
 * @version 2.0
 * @since 01/12/2016
 */
public class Main {

    private static Usuario usuarioSesion;

    public static void main(String[] args) {

        staticFiles.location("/public");
        String layout = "templates/menuLayout.vtl";

        //Ruta para renderizar vista del inicio de sesión.
        get("/login", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "templates/login.vtl");
        }, new VelocityTemplateEngine());

        //Ruta donde obtenemos datos del inicio de sesión.
        post("/login", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String user = request.queryParams("user1");
            String password = request.queryParams("password");
            model.put("user", user);
            model.put("password", password);
            Usuario usuario = Usuarios.checkUsuario(user, password);
            if (usuario != null) {
                usuarioSesion = usuario;
                response.redirect("/main");
                return null;
            } else {
                usuarioSesion = null;
                response.redirect("/login");
                return null;
            }
        }, new VelocityTemplateEngine());

        //Ruta para renderizar la vista del menú.
        get("/main", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        //Ruta para renderizar la vista de crepas dulces de un ingrediente.
        get("/crepasDulces1", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            List<Producto> crepasDulces1 = Productos.crepasUnDul();
            model.put("crepasDulces", crepasDulces1);
            model.put("template", "templates/crepasDulces.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        //Ruta para renderizar la vista de crepas dulces de dos ingredientes.
        get("/crepasDulces2", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            List<Producto> crepasDulces2 = Productos.crepasDosDul();
            model.put("crepasDulces", crepasDulces2);
            model.put("template", "templates/crepasDulces.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        //Ruta para renderizar la vista de crepas saladas de un ingrediente.
        get("/crepasSaladas1", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            List<Producto> crepasSaladas1 = Productos.crepasUnSal();
            model.put("crepasSaladas", crepasSaladas1);
            model.put("template", "templates/crepasSaladas.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        //Ruta para renderizar la vista de crepas saladas de dos ingredientes.
        get("/crepasSaladas2", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            List<Producto> crepasSaladas2 = Productos.crepasDosSal();
            model.put("crepasSaladas", crepasSaladas2);
            model.put("template", "templates/crepasSaladas.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        //Ruta para renderizar la vista de las bebidas calientes chicas.
        get("/bebidasCalientesChicas", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            List<Producto> bebidasCalientes = Productos.bebidasCalientesChicas();
            model.put("bebidasCalientes", bebidasCalientes);
            model.put("template", "templates/bebidasCalientes.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        //Ruta para renderizar la vista de las bebidas calientes medianas.
        get("/bebidasCalientesMedianas", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            List<Producto> bebidasCalientes = Productos.bebidasCalientesMedianas();
            model.put("bebidasCalientes", bebidasCalientes);
            model.put("template", "templates/bebidasCalientes.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        //Ruta para renderizar la vista de las bebidas calientes grandes.
        get("/bebidasCalientesGrandes", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            List<Producto> bebidasCalientes = Productos.bebidasCalientesGrandes();
            model.put("bebidasCalientes", bebidasCalientes);
            model.put("template", "templates/bebidasCalientes.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        //Ruta para renderizar la vista de las bebidas frias chicas.
        get("/bebidasFriasChicas", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            List<Producto> bebidasFrias = Productos.bebidasFriasChicas();
            model.put("bebidasFrias", bebidasFrias);
            model.put("template", "templates/bebidasFrias.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        //Ruta para renderizar la vista de las bebidas frias medianas.
        get("/bebidasFriasMedianas", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            List<Producto> bebidasFrias = Productos.bebidasFriasMedianas();
            model.put("bebidasFrias", bebidasFrias);
            model.put("template", "templates/bebidasFrias.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        //Ruta para renderizar la vista de las bebidas frias grandes.
        get("/bebidasFriasGrandes", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            List<Producto> bebidasFrias = Productos.bebidasFriasGrandes();
            model.put("bebidasFrias", bebidasFrias);
            model.put("template", "templates/bebidasFrias.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        //Ruta para renderizar la vista donde ingresaremos la cantidad de producto.
        get("/addCantidad/:productId", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String id = request.params("productId");
            model.put("id", id);
            System.out.println("---------------id = " + id);
            model.put("template", "templates/cantidad.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        /**
         * Ruta para obtener la cantidad ingresada en el form, verifica que la
         * cantidad no sea nula, ni menor a cero, si la cantidad es correcta,
         * verifica que haya suficientes ingredientes según la receta y los va
         * descontando.
         */
        post("/addCantidad/:productId", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            Integer banSal = 0;
            String id = request.params("productId");
            Long idProd = Long.parseLong(id);
            String cantidad = request.queryParams("cantidad");
            Integer cantIngresada = Integer.parseInt(cantidad);
            System.out.println("---------------idPOST = " + id);
            model.put("id", id);
            model.put("cantidad", id);
            if (cantIngresada.equals(null)) {
                System.out.println("CANTIDAD NULA");
                response.redirect("/addCantidad/" + id);
                return null;
            } else {
                if (cantIngresada > 0) {
                    List<Receta> receta = Recetas.getRecetaByProducto(idProd);
                    for (int i = 0; i < receta.size(); i++) {
                        Long recetaId = receta.get(i).getId();
                        Integer cantReceta = receta.get(i).getCant();
                        Ingrediente ingrediente = receta.get(i).getIngrediente();
                        Long ingredienteId = ingrediente.getId();
                        Ingrediente ingredientes = Ingredientes.getIngredienteById(ingredienteId);
                        System.out.println("!!!!!!!ingredientes = " + ingredientes.getNombre());
                        Integer cantIngrediente = ingredientes.getCant_disp();
                        System.out.println("!!!!!!!!cantIngrediente = " + cantIngrediente);
                        Integer cantModificada = cantIngrediente - (cantReceta * cantIngresada);
                        if (cantModificada > 0) {
                            Ingredientes.updateIngredienteById(ingredienteId, cantModificada);
                            response.redirect("/addVenta/" + id + "/" + cantidad);
                            return null;
                        } else {
                            model.put("SinProd", true);
                            System.out.println("NO HAY CANTIDAD SUFICIENTE");
                            response.redirect("/addCantidad/" + id);
                            return null;
                        }
                    }
                } else {
                    System.out.println("Cantidad negativa");
                    response.redirect("/addCantidad" + id);
                    return null;
                }
                return null;
            }
        },
                new VelocityTemplateEngine()
        );

        /**
         * Ruta para agregar la venta del producto.
         */
        get("/addVenta/:productId/:cantidad", (request, response) -> {
            Float cantidadDinero = 0.0f;
            Map<String, Object> model = new HashMap<>();
            String idParams = request.params("productId");
            Long id = Long.parseLong(idParams);
            String cantidadParams = request.params("cantidad");
            Integer cantidad = Integer.parseInt(cantidadParams);
            cantidadDinero = cantidadDinero + cantidad;
            Date hora = new Date();
            Date fecha = new Date();
            Venta venta = Ventas.addVenta(usuarioSesion, cantidadDinero, id, hora, fecha);
            List<Receta> recetas = Recetas.getRecetaByProducto(id);
            Producto producto = Productos.getProductoById(id);
            if (venta != null) {
                Tickets.addTicket(venta, producto, cantidad);
                System.out.println("SE CREO LA VENTA");
            } else {
                System.out.println("ERROR AL CREAR LA VENTA");
            }
            model.put("idProducto", id);
            model.put("cantidad", cantidad);
            model.put("template", "templates/productoSeleccionada.vtl");
            return new ModelAndView(model, layout);
        },
                new VelocityTemplateEngine()
        );
    }

}
