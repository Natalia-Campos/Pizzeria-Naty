/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria;

import java.math.BigDecimal;
import org.pedido.variedad.Variedad;
import org.persona.Persona;
import org.reporte.Reporte;

/** importaste cosas que no estas usando
 *
 * @author natalia
 */
public class Pizza {
    private int numeroPizza;
    private String nombre;
    private BigDecimal precio;
   ;

    public Pizza(int numeroPizza, String nombre, BigDecimal precio) {
        this.numeroPizza = numeroPizza;
        this.nombre = nombre;
        this.precio = precio;
    } 

    public int getNumeroPizza() {
        return numeroPizza;
    }

    public void setNumeroPizza(int numeroPizza) {
        this.numeroPizza = numeroPizza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    }

