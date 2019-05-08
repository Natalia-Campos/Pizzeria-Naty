/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.persona.Cocinero;
import org.persona.Persona;
/**
 *
 * @author Giselle
 */
public class Cocinero extends Persona{
    private String cvCocinero;

    public String getCvCocinero() {
        return cvCocinero;
    }

    public void setCvCocinero(String cvCocinero) {
        this.cvCocinero = cvCocinero;
    }

    public Cocinero(String cvCocinero, String nombre, String apellido, String direccion, int telefono, int cuil, String email) {
        super(nombre, apellido, direccion, telefono, cuil, email);
        this.cvCocinero = cvCocinero;
    }

    
    

  
    }