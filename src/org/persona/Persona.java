/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.persona;

/**Atributos de persona y constructor de persona
 *
 * @author Giselle
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private int cuil;
    private String email; 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Persona(String nombre, String apellido, String direccion, int telefono, int cuil, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cuil = cuil;
        this.email = email;
    }

   
    
}
