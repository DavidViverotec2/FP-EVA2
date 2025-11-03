package eva2_33_cuenta;

import java.util.Scanner;

public class EVA2_33_CUENTA {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cuenta = 1000000,retirado = 0;
        
        
        while(cuenta > 0){ // Mientras el saldo sea mayor que 0
            System.out.println("Tiene $" + cuenta + " en su cuenta."); // Imprimimos el saldo actual de la cuenta
            System.out.print("Ingrese la cantidad a retirar: "); // Pedimos la cantidad a retirar 
            retirado = entrada.nextInt();  // El valor capturado se guarda 
            cuenta -= retirado;  // Se resta lo retirado al saldo de la cuenta
            }
        System.out.println("Su saldo actual es de: $ " + cuenta);
        System.out.println("Por lo que ve, ya no puede retirar por falta de credito.");
    }
    
}
