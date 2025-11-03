package eva2_32_factorial;

import java.util.Scanner;

public class EVA2_32_FACTORIAL {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, factorial; // Declaramos las variables

        while (true) {
            System.out.print("Ingrese el numero del cual quiere saber su factorial (-1 para salir): ");
            numero = entrada.nextInt();

            if (numero == -1) { // Si el numero es -1
                System.out.println("Hasta Luego");
                break; // Rompe el ciclo y termina el programa
                
            } else if (numero == 0) { // Si el numero es 0
                System.out.println("El factorial de 0 es = 1");
                System.out.println("");
                
            } else if (numero < 0) { // Si el numero es negativo (distinto de -1)
                System.out.println("Tienes que escoger un numero positivo");
                System.out.println("");
                
            } else { // Si es mayor a 0
                factorial = 1; // Reiniciamos factorial antes de comenzar a multiplicar

                for (int i = 1; i <= numero; i++) { // i debe ser menor o igual al numero
                    factorial = factorial * i; // Se multiplica el factorial actual por el indice (1*1, 1*2, 2*3, 6*4, etc.)
                    System.out.println(i + "! = " + factorial); // Se imprime el resultado
                }
                System.out.println(""); // Deja una línea en blanco al final
            }
        }
    }
}
