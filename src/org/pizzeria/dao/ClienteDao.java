/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;
import org.persona.cliente.Cliente;
/**
 *
 * @author Giselle
 */
public interface ClienteDao {
    
public Cliente BuscarClienteNombre (String nombre);

public Cliente ActualizarClienteNomb (String nombre);
}
            
  