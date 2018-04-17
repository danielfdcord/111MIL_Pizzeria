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
    private ArrayList<DetallePedido> detallesPedido;
    private EstadoFactura estado;

    /**
     * CONSTRUCTORES
     */
    public Factura() {
    }

    public Factura(Date fechaHoraEmision, int numero) {
        this.fechaHoraEmision = fechaHoraEmision;
        this.numero = numero;
        detallesPedido = new ArrayList();
        estado = new EstadoFactura();
    }

    /**
     * METODOS GET
     */
    public int getNumero() {
        return numero;
    }
    
    public EstadoFactura getEstado() {
        return estado;
    }
    
    public ArrayList getDetalleFactura() {
        return detallesPedido;
    }

    public Date getFechaHoraEmision() {
        return fechaHoraEmision;
    }
    
    /**
     * METODOS SET
     */
    public void setEstado(String nombre) {
        estado.setNombre(nombre);
    }

    public void setFechaHoraEmision(Date fechaHoraEmision) {
        this.fechaHoraEmision = fechaHoraEmision;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    /**
     * OTROS METODOS
     */
    public void calcTotalFactura() {
        
    }
}
