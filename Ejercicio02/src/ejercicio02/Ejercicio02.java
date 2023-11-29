/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // TODO code application logic here
        int numero;
        int contador = 0;
        System.out.println("Ingrese un numero que sea par y natural");
        numero = entrada.nextInt();
        if (numero%2 == 0 && numero >0 ){
            while (contador <= numero){
            System.out.print(contador + " ");
            contador = contador + 1;
            }
        }else{
                System.out.print("El numero ingresado es invalido "); 
                    
                    }
        
    
    } 
        
    }
    

