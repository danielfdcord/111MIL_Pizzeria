/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author utku33
 */
public class Factura {
    /**
     * CAMPOS
     */
    private String fechaHoraEmision;
    private int numero;

    /**
     * CONSTRUCTORES
     */
    public Factura() {
    }

    public Factura(String fechaHoraEmision, int numero) {
        this.fechaHoraEmision = fechaHoraEmision;
        this.numero = numero;
    }

    /**
     * METODOS GET
     */
    public int getNumero() {
        return numero;
    }
    
    public int getEstado() {
        return numero;
    }
    
    public void getDetalleFactura() {
        System.out.println("***************");
        System.out.println("Fecha y hora de Emision: " + fechaHoraEmision);
        System.out.println("***************");
        System.out.println("Numero de factura: " + numero);
        System.out.println("***************");
    }

    public String getFechaHoraEmision() {
        return fechaHoraEmision;
    }
    
    /**
     * METODOS SET
     */
    public int setEstado() {
        return numero;
    }

    public void setFechaHoraEmision(String fechaHoraEmision) {
        this.fechaHoraEmision = fechaHoraEmision;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    /**
     * OTROS METODOS
     */
    public void buscarItemsAFacturar() {
        
    }
    
    public void calcTotalFactura() {
        
    }
}
