package eva2_21_do_while_pwd;

import java.util.Scanner;

public class EVA2_21_DO_WHILE_PWD {
    final static String USUARIO = "admin";
    final static String PDW = "admin";
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String usu,contra;
        do{
            System.out.println("");
            System.out.println("----- ACCESO AL SISTEMA -----");
            System.out.print("USUARIO: ");
            usu = entrada.nextLine();
            System.out.print("CONTRASEÑA:");
            contra = entrada.nextLine();
        } while(!(usu.equals(USUARIO) && contra.equals(PDW))); // Si la contraseña es true y el usuario igual, se convierte en false y sale
        System.out.println("");                                // Ya que el ciclo while funciona mientras sea true
        System.out.println("----- BIENVENIDO AL SISTEMA -----");
    }
    
}
