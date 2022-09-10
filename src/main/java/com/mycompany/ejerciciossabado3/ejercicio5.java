
package com.mycompany.ejerciciossabado3;

import java.util.Scanner;


public class ejercicio5 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el dia: ");
        int dias = input.nextInt();
        
        System.out.print("Ingrese el mes: ");
        int mes = input.nextInt();
        
        System.out.print("Ingrese el año: ");
        int anio = input.nextInt();
        
        if(anio>1000 && anio<=2050) 
        {
            if(mes >= 1 && mes <= 12) 
            {
                if(mes == 2) 
                {
                    if(dias>=1 && dias<=28) 
                    {
                        System.out.println("Fecha ingresada de febrero es valida: "+dias+"/"+mes+"/"+anio ); 
                    } else{
                        System.err.printf("dia: %d, no es valido para febrero ", dias);     
                    }                    
                }
                else{ 
                        if(dias>=1 && dias<=31) 
                        {
                          System.out.println("Fecha ingresada valida: "+dias+"/"+mes+"/"+anio ); 
                        }else{ 
                            System.err.printf("dia: %d, no es valido ", dias);     
                        }    
                    }
            } 
            else{ 
                System.out.printf("El mes: %d,  no es valido", mes);
                }
        }
        else{ 
                if(dias == 0 && mes == 0 && anio == 0)
                {
                    System.err.println("dia, mes, año, no pueden ser 0");
                } 
                else
                {
                    System.err.println("Año no valido");
                }
            }
    }
}


