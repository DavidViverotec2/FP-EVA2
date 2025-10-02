package eva2_1_exa1;

import java.util.Scanner;

public class EVA2_1_EXA1 {
    public static void main(String[] args) {
        int natacion,ciclismo,correr,tiempo;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Tiempo en natacion: ");
        natacion = entrada.nextInt();
        
        System.out.print("Tiempo en natacion: ");
        ciclismo = entrada.nextInt();
        
        System.out.print("Tiempo en natacion: ");
        correr = entrada.nextInt();
        
        tiempo = natacion + ciclismo + correr;
        
        if ((tiempo < 120) && ((natacion < 60) && (ciclismo < 60) && (correr < 60))) {
            System.out.println("Clasificaion: Excelente");
        } else if ((tiempo < 120) || ((natacion < 70) && (ciclismo < 70) && (correr < 70))) {
            System.out.println("Clasificacion: Buena");
        }else {
            System.out.println("Clasificacion: Regular");}
        
    }
    
}
