package eva2_19_tic_tac_toe;

import java.util.Scanner;

public class EVA2_19_TIC_TAC_TOE {
    public static void main(String[] args) {
        int tictac[][] = new int[3][3];
        int fila,colu,jug;
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < 9; i++) {
            System.out.println("Introduce tu jugada. Fila:");
            fila = entrada.nextInt();
            System.out.println("Introduce tu jugada. Columna:");
            colu = entrada.nextInt();
            System.out.println("Jugador 1 o 2:");
            jug = entrada.nextInt();
        }
            
        for(int i = 0; i < tictac.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + tictac[i][j] + "]");
            }   
            System.out.println("");
        }
            
        
    }
    
}
