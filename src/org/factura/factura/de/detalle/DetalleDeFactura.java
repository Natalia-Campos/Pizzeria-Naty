/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.factura.factura.de.detalle;


import java.util.Date;
import java.util.List;
import org.factura.estado.de.factura.estadoFactura;
import org.factura_Factura.Factura;
import org.pedido.detalle.de.pedido.DetallePedido;


/** llama a constructor de detalle de factura, pedido 
 *
 * @author Giselle
 */
public class DetalleDeFactura extends Factura {

 
 public DetalleDeFactura() {
       
      
     
        
        }

public DetalleDeFactura(Date fechaHoraEmision, long numero, estadoFactura estadoFactura, List<DetallePedido> detallesPedido) {
        super(fechaHoraEmision, numero, estadoFactura, detallesPedido);
}
}