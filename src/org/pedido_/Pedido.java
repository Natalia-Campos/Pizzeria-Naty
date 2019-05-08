/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pedido_;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.factura_Factura.Factura;
import org.pedido.detalle.de.pedido.DetallePedido;
import org.pedido.estado.de.pedido.EstadoPedido;
import org.persona.cliente.Cliente;

/** genero metodo de detalle de pedido y factura
 *
 * @author ewiedermann
 */
public class Pedido {
    private Date fechaHoraCreacion;
    private Date fechaHoraEntrega;
    private Cliente cliente;
    private int numero;
    private List<DetallePedido> detallesPedido;
    
    public Pedido(){
        detallesPedido = new ArrayList();
    }

    public Pedido(Date fechaHoraCreacion, Date fechaHoraEntrega, Cliente cliente, int numero, List<DetallePedido> detallesPedido) {
        this.fechaHoraCreacion = fechaHoraCreacion;
        this.fechaHoraEntrega = fechaHoraEntrega;
        this.cliente = cliente;
        this.numero = numero;
        this.detallesPedido = detallesPedido;
    }
    
    public BigDecimal calcTotalPedido(){
        BigDecimal total = BigDecimal.ZERO;
        
        for(DetallePedido detalle : detallesPedido){
            total = total.add(detalle.calcTotalItem());
        }
        return total;
    }
    
    public void facturar (Factura facturar, EstadoPedido facturado){
        
    }

    public Date getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    public void setFechaHoraCreacion(Date fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }

    public Date getFechaHoraEntrega() {
        return fechaHoraEntrega;
    }

    public void setFechaHoraEntrega(Date fechaHoraEntrega) {
        this.fechaHoraEntrega = fechaHoraEntrega;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<DetallePedido> getDetallesPedido() {
        return detallesPedido;
    }

    public void setDetallesPedido(List<DetallePedido> detallesPedido) {
        this.detallesPedido = detallesPedido;
    }
    
    
}