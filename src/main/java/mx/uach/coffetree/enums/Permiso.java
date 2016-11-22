/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.coffetree.enums;

/**
 *
 * @author dsantillanes
 */
public enum Permiso {
    
    CAJERO("cajero"),
    ADMINISTRADOR("administrador");
    
    private String descripcion;

    private Permiso(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private Permiso() {
    }
    
}
