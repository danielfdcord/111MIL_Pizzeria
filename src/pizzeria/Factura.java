/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author: Agustin y Jose.
 */
public class Factura {
    /**
     * CAMPOS
     */
    private Date fechaHoraEmision;
    private int numero;
    private EstadoFactura estado;
    private DetallePedido detalleFactura;

    /**
     * CONSTRUCTORES
     */
    public Factura() {
    }

    public Factura(Date fechaHoraEmision, int numero,EstadoFactura estado,DetallePedido detalle) {
        this.fechaHoraEmision = fechaHoraEmision;
        this.numero = numero;
        this.estado = estado;
        this.detalleFactura = detalle;
    }

    /**
     * METODOS GET
     * @return 
     */
    public int getNumero() {
        return this.numero;
    }
 
    public Date getFechaHoraEmision() {
        return this.fechaHoraEmision;
    }
    
    public DetallePedido getDetalleFactura(){
        return this.detalleFactura;
    }
    
    public EstadoFactura getEstado(){
        return this.estado;
    }
    
    
    /**
     * METODOS SET
     * @param estado
     */
    public void setEstado(EstadoFactura estado) {
        this.estado= estado;
    }

    public void setFechaHoraEmision(Date fechaHoraEmision) {
        this.fechaHoraEmision = fechaHoraEmision;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setDetalleFactura(DetallePedido detalle){
        this.detalleFactura = detalle;
    }
    
    /**
     * OTROS METODOS
     */
    
    public String toString(){
        return "";
    }
    
    public void buscarItemsAFacturar(){
    
    }
    
    public float calcTotalFactura() {
        return 0;
    }
    
}
