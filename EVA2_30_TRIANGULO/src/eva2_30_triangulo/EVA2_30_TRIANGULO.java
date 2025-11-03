package eva2_30_triangulo;

import java.util.Scanner;

public class EVA2_30_TRIANGULO {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;
        
        
        while(true){
            System.out.print("Ingrese el numero para el patron(-1 para terminar): ");
            valor = entrada.nextInt();
            String impreso = "*";
            if (valor == -1){
                System.out.println("Hasta Luego!");
                break;
            }
            for (int i = 0;i < valor;i++){
            System.out.println(impreso); // Se imprime el valor pasaso de la variable
            impreso += "*"; // En cada iteracion se agrega un * a la variable impreso
            }   System.out.println("");
        }
    
    }
    }