/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author utku38
 */
public class Pizza{
    private String nombre;
    private float precio;
    private Pizza pizza;
    private TamanioPizza tamanio;
    private TipoPizza tipoPizza;
    private VariedadPizza variedad;

    public void setTamanio(TamanioPizza tamanio) {
        this.tamanio = tamanio;
    }

    public void setTipoPizza(TipoPizza tipoPizza) {
        this.tipoPizza = tipoPizza;
    }

    public void setVariedad(VariedadPizza variedad) {
        this.variedad = variedad;
    }

    public Pizza(String nombre, float precio, Pizza pizza, TamanioPizza tamanio, TipoPizza tipoPizza, VariedadPizza variedad) {
        this.nombre = nombre;
        this.precio = precio;
        this.pizza = pizza;
        this.tamanio = tamanio;
        this.tipoPizza = tipoPizza;
        this.variedad = variedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public Pizza getPizza() {
        return pizza;
    }
    
    public TamanioPizza getTamanioPizza() {
        return tamanio;
    }
    
    public TipoPizza getTipoPizza() {
        return tipoPizza;
    }
    
    public VariedadPizza getVariedad() {
        return variedad;
    }
}
