/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.coffetree;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javafx.scene.control.Alert;
import mx.uach.coffetree.controllers.Productos;
import mx.uach.coffetree.controllers.Usuarios;
import static mx.uach.coffetree.controllers.Usuarios.checkUsuario;
import mx.uach.coffetree.enums.TipoProducto;
import mx.uach.coffetree.models.Producto;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.velocity.VelocityTemplateEngine;

/**
 *
 * @author dsantillanes
 */
public class Main {

    public static void main(String[] args) {

        staticFiles.location("/public");
        String layout = "templates/layout.vtl";

        get("/login", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "templates/login.vtl");
        }, new VelocityTemplateEngine());

        post("/login", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String user = request.queryParams("user1");
            String password = request.queryParams("password");
            model.put("user", user);
            model.put("password", password);
            if (Usuarios.checkUsuario(user, password) == "admin") {
//               System.out.println("Entre al admin");
//               model.put("conexion", true);
                response.redirect("/main/" + user + "/" + password);
                return null;
            } else if (Usuarios.checkUsuario(user, password) == "Cajero") {
//               System.out.println("entre al cajero");
//               model.put("conexion", true);
                response.redirect("/main/" + user + "/" + password);
                return null;
            } else if (Usuarios.checkUsuario(user, password) == "") {
//               System.out.println("entre al vacio");
//               model.put("conexion", false);
                response.redirect("/login");
                return null;
            } else {
//               System.out.println("entre al else");
//               model.put("conexion", false);
//               model.put("errorLogin", "Usuario / Contra incorrecto");
                response.redirect("/login");
                return null;
            }
        }, new VelocityTemplateEngine());

        get("/main/:user1/:password", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String user = request.params("user1");
            String password = request.params("password");
            model.put("user", user);
            model.put("password", password);
            model.put("template", "templates/menu.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/crepasDulces", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            List<Producto> crepasDulces1 = Productos.crepasUnDul();
            List<Producto> crepasDulces2 = Productos.crepasDosDul();
            model.put("crepasDulces1", crepasDulces1);
            model.put("crepasDulces2", crepasDulces2);
            model.put("template", "templates/crepas.vtl");
            return new ModelAndView(model, "templates/crepasDulces.vtl");
        }, new VelocityTemplateEngine());

        get("/crepasSaladas", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            List<Producto> crepasSaladas1 = Productos.crepasUnSal();
            List<Producto> crepasSaladas2 = Productos.crepasDosSal();
            model.put("crepasSaladas1", crepasSaladas1);
            model.put("crepasSaladas2", crepasSaladas2);
            model.put("template", "templates/crepas.vtl");
            return new ModelAndView(model, "templates/crepasSaladas.vtl");
        }, new VelocityTemplateEngine());

        get("/bebidasCalientes", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            List<Producto> bebidasCalientes = Productos.bebidasCalientes();
            model.put("bebidasCalientes", bebidasCalientes);
            return new ModelAndView(model, "templates/bebidasCalientes.vtl");
        }, new VelocityTemplateEngine());

        get("/bebidasFrias", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            List<Producto> bebidasFrias = Productos.bebidasFrias();
            model.put("bebidasFrias", bebidasFrias);
            return new ModelAndView(model, "templates/bebidasFrias.vtl");
        }, new VelocityTemplateEngine());
    }

}
