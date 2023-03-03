package ejercicioslogicos1;

public class EjerciciosLogicos1 {

    public static void main(String[] args) {
       //Realizar un programa que permita el intercambio de valores
       //entre dos variables. Por Ejemplo: Si  una variable numero
       //vale 35, y una variable numero2 vale 20, realizar las acciones
       //necesarias para que numero pase a valer 20 y numero2 valga 35.
       //Una vez realizado el cambio mostrar el resultado por pantalla
       
       int numero = 35;
       int numero2 = 20;
       int aux;
       
        System.out.println("------ANTES-----");
        System.out.println("num1: " + numero);
        System.out.println("num2: " + numero2);
        
        aux = numero2;
        numero2 = numero;
        numero = aux;
        
        System.out.println("-----DESPUES----");
        System.out.println("num1: " + numero);
        System.out.println("num2: " + numero2);
    }
    
}
