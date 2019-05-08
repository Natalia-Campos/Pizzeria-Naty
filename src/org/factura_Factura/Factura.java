/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.factura_Factura;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.factura.estado.de.factura.estadoFactura//<editor-fold defaultstate="collapsed" desc="/*comment*/">
        ;
//</editor-fold>
import org.pedido.detalle.de.pedido.DetallePedido;

/**
 * 
 * @author Naty
 */
public class Factura {
    private Date fechaHoraEmision;
    private long numero;
    private estadoFactura estadoFactura;
    private List<DetallePedido> detallesPedido;
    
    public Factura(){
        detallesPedido = new ArrayList();
    }

    public Factura(Date fechaHoraEmision, long numero,estadoFactura estadoFactura, List<DetallePedido> detallesPedido) {
        this.fechaHoraEmision = fechaHoraEmision;
        this.numero = numero;
        this.estadoFactura = estadoFactura;
        this.detallesPedido = detallesPedido;
    }

    public Date getFechaHoraEmision() {
        return fechaHoraEmision;
    }

    public void setFechaHoraEmision(Date fechaHoraEmision) {
        this.fechaHoraEmision = fechaHoraEmision;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public org.factura.estado.de.factura.estadoFactura getEstadoFactura() {
        return estadoFactura;
    }

    public void setEstadoFactura(estadoFactura estadoFactura) {
        this.estadoFactura = estadoFactura;
    }

    public List<DetallePedido> getDetallesPedido() {
        return detallesPedido;
    }

    public void setDetallesPedido(List<DetallePedido> detallesPedido) {
        this.detallesPedido = detallesPedido;
    }
    
    
}
