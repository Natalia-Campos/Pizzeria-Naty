/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.factura.estado.de.factura;

/**tiene atributos, getterandsetter y constructor
 *
 * @author ewiedermann
 */
public class estadoFactura {
    private int numeroEstado;
    private String nombre;
    private String descripcion;
    
    public estadoFactura(){
        
    }

    public estadoFactura(int numeroEstado, String nombre, String descripcion) {
        this.numeroEstado = numeroEstado;
        this.nombre = nombre;
        this.descripcion = descripcion;
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