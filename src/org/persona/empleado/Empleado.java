/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.persona.Empleado;

import org.persona.Persona;

/**
 *
 * @author Giselle
 */
public class Empleado extends Persona{
    private String cvEmpleado;

    public String getCvEmpleado() {
        return cvEmpleado;
    }

    public void setCvEmpleado(String cvEmpleado) {
        this.cvEmpleado = cvEmpleado;
    }

    public Empleado(String cvEmpleado, String nombre, String apellido, String direccion, int telefono, int cuil, String email) {
        super(nombre, apellido, direccion, telefono, cuil, email);
        this.cvEmpleado = cvEmpleado;
    }

  
    }

   

   

