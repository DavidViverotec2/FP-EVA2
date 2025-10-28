package eva2_26_adivinar_while;

import java.util.Scanner;

public class EVA2_26_ADIVINAR_WHILE {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor = 0,adivinar;
        while(valor != -1) {
            adivinar = (int)(Math.random() *5 );
            System.out.println("JUEGO DE ADIVINAR NUMERO");
            System.out.print("Adivine el numero. -1 para terminar: ");
            valor = entrada.nextInt();
            System.out.println("");
            if (valor == adivinar)
                System.out.println("ADIVINASTE EL NUMERO!!!");
        }
    }
    
}
