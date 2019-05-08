/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.persona.cliente;

import org.persona.Persona;
/**
 *
 * @author Giselle
 */
public class Cliente extends Persona{

    public Cliente(String nombre, String apellido, String direccion, int telefono, int cuil, String email) {
        super(nombre, apellido, direccion, telefono, cuil, email);
    }

    
}
