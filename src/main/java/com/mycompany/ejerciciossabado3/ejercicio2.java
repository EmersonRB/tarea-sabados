
package com.mycompany.ejerciciossabado3;

import java.util.Scanner;


public class ejercicio2 {
    public static void main(String [] args){
        Scanner sp= new Scanner(System.in);
        
        System.out.println("ingrese un numero");
        double numero = sp.nextDouble();
        if(numero > 0) {
        System.out.println("numero positivo");
        } else { 
            System.out.println("numero negativo ");
         }   
    }
}
//