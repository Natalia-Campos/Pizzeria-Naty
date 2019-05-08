/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pedido.estado.de.pedido;

/**
 *
 * @author ewiedermann
 */
public class EstadoPedido {
    private int numeroEstado;
    private String nombre;
    private String descripcion;
    
    public EstadoPedido(){
        
    }

    public EstadoPedido(int numeroEstado, String nombre, String descripcion) {
        this.numeroEstado = numeroEstado;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public boolean esPteFacturacion(){
        return nombre.equals("Pendiente de pago");
    }
    public boolean esFacturado(){
        return nombre.equals("Facturando");
    }
    public boolean esGenerada(){
        return nombre.equals("Generada");
    }

    public int getNumeroEstado() {
        return numeroEstado;
    }

    public void setNumeroEstado(int numeroEstado) {
        this.numeroEstado = numeroEstado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
