/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // TODO code application logic here
        int multiplicando;
        int multiplicador;
        int suma = 0;
        System.out.println("Ingrese el primer numero");
        multiplicando = entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        multiplicador = entrada.nextInt();
        while (multiplicador > 1){
            multiplicando = multiplicando * 2;
            multiplicador = multiplicador / 2;
            if (multiplicador%2 ==1){
                suma = suma + multiplicando;
            }
        }
        System.out.println("La multiplicacion da: "+ suma);
    }
    
}
