/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria.interfazusuario;

import java.util.List;
import pizzeria.TamanioPizza;
import pizzeria.TipoPizza;

/**
 *
 * @author utku38
 */
public interface ContratoMenuPrincipal {
    
    public interface Vista{
        void setPresenter(ContratoMenuPrincipal.Presentador presentador);
        void mostrarMenuPrincipal();
        void mostrarSelectorTiposDePizza();
        void mostrarSelectorTamanios();
        void mostrarSelectorCoccion();
        void mostrarResumenDetalle();
    }
    
    public interface Presentador{
        void vincular();
        void opcionIngresada(int opcion);
        void tipoDePizzaIngreado(int tipo);
        void tamanioIngresado(int tamanio);
        void coccionIngresada(int coccion);
        List<TipoPizza> getTiposPizza();
        List<TamanioPizza> getTamanio();
    }
}
