
package com.mycompany.ejerciciossabado3;

import java.util.Scanner;

public class EjerciciosSabado3 {

    public static void main(String[] args) {
	    Scanner sp= new Scanner(System.in);
    int numero1,numero2;
    
     System.out.print("Introduce el primer número");
         numero1=sp.nextInt();
     
        System.out.println("introduce el segundo numero");
        numero2=sp.nextInt();
     if(numero1==numero2 )
			System.out.println("Son iguales");
      else 
			System.out.println("No son iguales");
        }

}
