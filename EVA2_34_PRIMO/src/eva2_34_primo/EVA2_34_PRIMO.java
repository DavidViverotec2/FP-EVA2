package eva2_34_primo;

import java.util.Scanner;

public class EVA2_34_PRIMO {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        while (true) { // Repite el programa infinitamente hasta que el usuario decida salir
            System.out.print("Introduce un numero (o -1 para salir): ");
            int numero = entrada.nextInt();
            
            if (numero == -1) { // Si el usuario ingresa -1, el programa termina
                System.out.println("Hasta luego");
                break; // Sale del ciclo while
            }
            
            int contador = 0;  // Guarda cuantos divisores tiene el numero

            if (numero <= 1) { // Si es menor o igual a 1, no puede ser primo
                System.out.println(numero + " no es un numero primo");
            } else { // Si es mayor a 1 
                for (int i = 1; i <= numero; i++) { // Me reproduce hasta llegar al numero
                    if (numero % i == 0) { // Si el residuo entre el numero y el indice es cero
                        contador++; // si es divisible, lo aumentamos en el contador
                    }
                }

                // Un número primo solo tiene dos divisores: 1 y él mismo
                if (contador == 2) { // Si tiene solo 2 divisores 
                    System.out.println(numero + " es un numero primo."); // Es primo
                } else { // Si no
                    System.out.println(numero + " no es un numero primo."); // No es primo
                }
            }
            System.out.println(); // Deja una línea en blanco entre ejecuciones
        }
    }
}
