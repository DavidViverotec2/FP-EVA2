package eva2_2_switch;

import java.util.Scanner;

public class EVA2_2_SWITCH {
    public static void main(String[] args) {
        int dia;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el numero del dia de la semana (1-7): ");
        dia = entrada.nextInt();
        
        // else if -- if anidado
        
        /*if (dia == 1){
            System.out.println("Domingo");}
        else if (dia == 2){
            System.out.println("Lunes");}
        else if (dia == 3) {
            System.out.println("Martes");}
        else if (dia == 4) {
            System.out.println("Miercoles");}
        else if (dia == 5) {
            System.out.println("Jueves");}
        else if (dia == 6) {
            System.out.println("Viernes");}
        else if (dia == 7) {
            System.out.println("Sabado");}
        else {
            System.out.println("Este dia no es valido");}
        */
        
        switch(dia) { // Opciones --> Casos
            case 1:
                System.out.println("Lunes");
                break; // El break termina el caso y el switch
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:  // Opcional, Siempre al final, No necesita break
                System.out.println("Numero No Valido");
        }
    }
    
}
