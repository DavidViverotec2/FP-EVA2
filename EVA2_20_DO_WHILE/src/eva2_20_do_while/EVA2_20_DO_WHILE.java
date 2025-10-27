/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_do_while;

import java.util.Scanner;

/**
 *
 * @author elvat
 */
public class EVA2_20_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("-----MENÚ PRINCIPAL-----");
            System.out.println("Presiona la opción:");
            System.out.println("1. Pedidos:");
            System.out.println("2. Proovedores:");
            System.out.println("3. Facturacion:");
            System.out.println("4. Salir");
            opcion = entrada.nextInt();
            
            switch(opcion) {
                case 1:
                        System.out.println("PEDIDOS DEL SISTEMA!!");
                        break;
                case 2:
                        System.out.println("PROOVEDORES DEL SISTEMA");
                        break;
                case 3:
                        System.out.println("FACTURACION!!");
                        break;}
        }while(opcion != 4);
        System.out.println("salida");
    }
    
}
