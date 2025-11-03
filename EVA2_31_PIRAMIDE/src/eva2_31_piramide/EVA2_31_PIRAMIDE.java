package eva2_31_piramide;
import java.util.Scanner;

public class EVA2_31_PIRAMIDE {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;
        
        while (true) { // Permite repetir el programa infinitamente hasta que el usuario decida salir
            System.out.print("Ingrese el numero para el patron (-1 para salir): ");
            valor = entrada.nextInt();
            
            if (valor == -1) { // Si el usuario ingresa -1, el programa termina
                System.out.println("Hasta luego!");
                break;
            }
            
            for (int i = 1; i <= valor ; i++) {  // Controla las filas, el indice debe ser menor o igual al valor que da el usuario
                for (int j = 1; j <= i; j++) {   // Controla los * por fila , mientras j sea menor que el numero de fila, se hace lo sig.
                    System.out.print("*");       // Se utiliza el print para imprimir en la misma fila mientras j sea menor a la fila
                }
                System.out.println();            // Al final de cada fila se salta de linea
            }

            for (int i = valor - 1; i >= 1; i--) { // El indice inicia en valor - 1 para no repetir la ultima fila; se reduce en 1 por iteracion
                for (int j = 1; j <= i; j++) {    // Hace lo mismo que el anterior
                    System.out.print("*");      
                }
                System.out.println();             // Salto de línea después de cada fila
            }

            System.out.println(); // Línea en blanco entre pirámides
        }
    }
}
