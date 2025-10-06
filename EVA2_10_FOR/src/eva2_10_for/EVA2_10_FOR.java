package eva2_10_for;

import java.util.Scanner;

public class EVA2_10_FOR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Imprimir del 1 al 20
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " - ");
        }
        
        // Imprimir al reves
        System.out.println("");
        for (int i = 20; i >= 1; i--) {
            System.out.print(i + " - ");
        }
        
        System.out.println("");
        // Imprimir los pares de 0 a 100
        // 0 - 2 - 4 ... -100
        
        // +=, -=, *=; /=
        for (int i = 0; i <= 100; i += 2) {
            System.out.print(i + " - ");}
        
        System.out.println("");
        
       //Imprimir en orden inverso
        for (int i = 100; i >= 0; i -= 2) {
            System.out.print(i + " - ");}
        
        // Solicitar dos numeros al usuario, imprimir la lista
        // Entre esos numeros
        
        System.out.println("");
        int num1,num2;
        
        System.out.print("Ingrese el primer numero (menor): ");
        num1 = entrada.nextInt();
        
        System.out.print("Ingrese el segundo numero (mayor): ");
        num2 = entrada.nextInt();

        for (int i = num1; i <= num2; i++) {
            System.out.print(i + " ");}
        
        System.out.println("");
        
        for (int i = num2; i >= num1; i--) {
            System.out.print(i + " ");}
    }
    
    
}
