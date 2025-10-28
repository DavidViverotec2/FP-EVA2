package eva2_28_buscar;

import java.util.Scanner;

public class EVA2_28_BUSCAR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valores[] = new int[10];
        int valor;
        
        for(int i = 0; i < valores.length; i++) {
            valores[i] = (int) (Math.random() * 100);
        }
        for(int i = 0; i < valores.length; i++) {
            System.out.print("[" + valores[i] + "]");
        }
        System.out.println("");
        System.out.print("Valor a buscar:");
        valor = entrada.nextInt();
        
        for(int i = 0; i < valores.length; i++){ // Abre la lista
            if (valor == valores[i]){ // Si el valor a buscar esta en la lista
                System.out.println("Valor encontrado!!!");
                System.out.println("Posicion: " + i);
                break; // Lo rompemos para que no la siga recorriendo
            }
        }
        
        }
        
        }
    
