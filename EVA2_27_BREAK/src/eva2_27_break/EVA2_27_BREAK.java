package eva2_27_break;

import java.util.Scanner;

public class EVA2_27_BREAK {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor,adivinar;
        
        do{
            adivinar = (int)(Math.random() *5 );
            System.out.println("JUEGO DE ADIVINAR NUMERO");
            System.out.print("Adivine el numero. -1 para terminar: ");
            valor = entrada.nextInt();
            System.out.println("");
            if (valor == adivinar)
                System.out.println("ADIVINASTE EL NUMERO!!!");
            else if (valor == -1){
                System.out.println("Gracias por jugar!!!");
                break; // Rompe el ciclo
            }else {
                System.out.println("No adivinaste!");}
        }while(true); // Condicion para repetir (true)
    }
    
}
