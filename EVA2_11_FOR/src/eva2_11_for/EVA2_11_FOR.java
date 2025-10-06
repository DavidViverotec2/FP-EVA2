package eva2_11_for;

import java.util.Scanner;

public class EVA2_11_FOR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int rep;
        String mensaje;
        
        System.out.print("Mensaje a repetir: ");
        mensaje = entrada.nextLine();
        
        System.out.print("Cantidad a repetir: ");
        rep = entrada.nextInt();
        
        for (int i = 1; i <= rep; i++) {
            System.out.println(i + ".- " + mensaje);
        }
                
    }
    
}
