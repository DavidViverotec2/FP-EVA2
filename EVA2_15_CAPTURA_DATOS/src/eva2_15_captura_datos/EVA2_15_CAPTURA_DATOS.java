package eva2_15_captura_datos;

import java.util.Scanner;

public class EVA2_15_CAPTURA_DATOS {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tama;
        
        System.out.print("Ingrese la cantidad de calificaciones a capturar: ");
        tama = entrada.nextInt();
        
        int califas[] = new int[tama];
         // For para la captura
        for (int i = 0; i < califas.length; i++) {
            System.out.print("Ingrese la calificacion #" + (i + 1) + " : ");
            califas[i] = entrada.nextInt();
        }
        // For para la lectura
        for (int i = 0; i < califas.length; i++) {
            System.out.print("[" + califas[i] + "]");
        }
        
        // Promedio del grupo
        // Primero sumar todas las califas
        
        
        int sumaCal = 0;
        for (int i = 0; i < califas.length; i++) {
            sumaCal += califas[i];
        }
        
        System.out.println(" El acumulado de las calificaciones = " + sumaCal);
            double promedio = sumaCal / (double) califas.length;
            System.out.println("El promedio del grupo es: " + promedio);
            
        }
        
        
        
    }
    
    
}
