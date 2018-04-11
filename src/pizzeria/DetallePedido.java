/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author utku30
 */
public class DetallePedido {
    
    private int cantidad;
    private float precio;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public DetallePedido(int cantidad, float precio) {
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
}

