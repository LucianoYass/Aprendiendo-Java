
package ejerciciointegrador3;

import java.util.Scanner;

public class EjercicioIntegrador3 {

    public static void main(String[] args) {
        Double matriz [][] = new Double [4][4];
        Double suma = 0.0;
        
        Scanner teclado = new Scanner (System.in);
        
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese alumno nro " + f);
                matriz[f][c] = teclado.nextDouble();
                suma = suma + matriz[f][c];
            }
            matriz[f][3] = suma / 3;
            suma = 0.0;
        }
        
        for (int f = 0; f < 4; f++) {
            System.out.println("Las notas del alumno nro "+f+" son: ");
            for (int c = 0; c < 3; c++) {
                System.out.println("nota nro "+c+ " " +matriz[f][c]);
            }
            System.out.println("El promedio de las notas es: "+matriz[f][3]);
        }
    }
    
}
