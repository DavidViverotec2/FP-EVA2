package eva2_6_inicializar;

import java.util.Scanner;

public class EVA2_6_INICIALIZAR {
    public static void main(String[] args) {
       String diasSemana[] = {"Lunes","Martes","Miercoles",
                              "Jueves","Viernes","Sabado",
                              "Domingo"};
       
        Scanner entrada = new Scanner(System.in);
        int dia;
        
        System.out.print("Dia de la semana (0-6): ");
        dia = entrada.nextInt();
        System.out.println(diasSemana[dia]);
    }
    
}
