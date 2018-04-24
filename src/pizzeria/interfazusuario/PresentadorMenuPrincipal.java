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
public class PresentadorMenuPrincipal implements ContratoMenuPrincipal.Presentador{
    private ContratoMenuPrincipal.Vista vista;

    public PresentadorMenuPrincipal(ContratoMenuPrincipal.Vista vista) {
        this.vista = vista;
    }
    
    @Override
    public void opcionIngresada(int opcion) {
            
         switch (opcion){
            
            case 1:
                    
            case 2:
                    
            case 3:    
        }
    }
    
    

    @Override
    public void vincular() {
        this.vista.setPresenter(this);
        vista.mostrarMenuPrincipal();
    }

    @Override
    public void tipoDePizzaIngreado(int tipo) {
        
    }

    @Override
    public void tamanioIngresado(int tamanio) {
        
    }

    @Override
    public void coccionIngresada(int coccion) {
        
    }
    
    @Override
    public List<TipoPizza> getTiposPizza() {
        return null;
    }

    @Override
    public List<TamanioPizza> getTamanio() {
        return null;
    }

    

    
    
}
