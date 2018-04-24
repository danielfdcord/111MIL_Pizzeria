
package pizzeria.interfazusuario;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner (System.in);
        
        System.out.println("----------------------------------------");
        System.out.println("            MENU PRINCIPAL");
        System.out.println("----------------------------------------");
        System.out.println("");
        System.out.println("1) Ingresar al Sistema:");
        System.out.println("2) Salir del Sistema:");
        int i = scan.nextInt();
        System.out.println("");
        System.out.println("----------------------------------------");
        System.out.println("");
       
        if (i==1){
            
            System.out.println("        Opciones: ");
            System.out.println("        1) Realizar Pedido");
            System.out.println("        2) Ver Pedidos");
            System.out.println("        3) Administrar Pizzas");
            int j = scan.nextInt();
        }
        else {
            System.out.println("        HASTA LUEGO");    
        }
    }
}
