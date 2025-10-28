package eva2_25_adivinar_numero;

import java.util.Scanner;

public class EVA2_25_ADIVINAR_NUMERO {
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
        }while(valor != -1 ); // Condicion para repetir (true)
    }
    
}
