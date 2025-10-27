package eva2_24_ciclo_infinito;

import java.util.Scanner;

public class EVA2_24_CICLO_INFINITO {
    final static String USUARIO = "admin";
    final static String PDW = "admin";
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String usu,contra;
        
        while(true) { //Ciclo que se repite infinitamente
            System.out.println("");
            System.out.println("----- ACCESO AL SISTEMA -----");
            System.out.print("USUARIO: ");
            usu = entrada.nextLine();
            System.out.print("CONTRASEÑA:");
            contra = entrada.nextLine();
            if((usu.equals(USUARIO) && contra.equals(PDW)))
                break; // termina el ciclo
    }
        System.out.println("");
        System.out.println("----- BIENVENIDO AL SISTEMA -----");
    }

}
