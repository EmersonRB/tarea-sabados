
package com.mycompany.ejerciciossabado3;

import java.util.Scanner;


public class ejercicio3 {
      public static void main(String [] args){
            Scanner sp= new Scanner(System.in);
        int numero1,numero2;
        
        System.out.println("Introduce el primer numero");
        numero1=sp.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        numero2=sp.nextInt();
        
         if(numero1>numero2){
         System.out.println("el orden correcto es : "+numero1+">"+numero2);
    }
        else
            System.out.print("el orden de mayor a menor es : "+numero2+" > "+numero1);
}
}