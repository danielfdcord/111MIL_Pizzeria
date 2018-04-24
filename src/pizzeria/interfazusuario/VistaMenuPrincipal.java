/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria.interfazusuario;

import java.util.Scanner;

/**
 *
 * @author utku38
 */
public class VistaMenuPrincipal implements ContratoMenuPrincipal.Vista{
   
    private ContratoMenuPrincipal.Presentador presentador;

    public VistaMenuPrincipal() {
        this.presentador = new PresentadorMenuPrincipal(this);
        this.presentador.vincular();
    }
    
    
    
    @Override
    public void mostrarMenuPrincipal() {
        
        Scanner scan=new Scanner (System.in);
        
        System.out.println("----------------------------------------");
        System.out.println("            MENU PRINCIPAL");
        System.out.println("----------------------------------------");
        System.out.println("");
        System.out.println(" Opciones: ");
        System.out.println(" 1) Realizar Pedido");
        System.out.println(" 2) Ver Pedidos");
        System.out.println(" 3) Administrar Pizzas");
        int j = scan.nextInt();
        this.presentador.opcionIngresada(j);
        
        }

    @Override
    public void setPresenter(ContratoMenuPrincipal.Presentador presentador) {
        this.presentador = presentador;
    }

    @Override
    public void mostrarSelectorTiposDePizza() {
        
    }

    @Override
    public void mostrarSelectorTamanios() {
        
    }

    @Override
    public void mostrarSelectorCoccion() {
        
    }

    @Override
    public void mostrarResumenDetalle() {
        
    }
    
    
    
}
