/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciossabado3;

import java.util.Scanner;

/**
 *
 * @author emers
 */
public class ejercicio4 {
     public static void main(String[] args) {
         int a,b,c;
        Scanner sp = new Scanner(System.in);
        System.out.print("Introduzca primer número: ");
        a=sp.nextInt();
        System.out.print("Introduzca segundo número: ");
        b=sp.nextInt();
        System.out.print("Introduzca tercer número: ");
        c=sp.nextInt();

        if(a>b && b>c)
            System.out.println( a+", "+b+", "+c);
        else{
            if(a>c && c>b)
                System.out.println(a+", "+c+", "+b);
            else{
               if(b>a && a>c)
                   System.out.println(b+", "+a+", "+c);
               else{
                  if(b>c && c>a)
                      System.out.println(b+", "+c+", "+a);
                  else{
                      if(c>a && a>b)
                         System.out.println(c+", "+a+", "+b);
                      else{
                         if(c>b && b>a)
                            System.out.println(c+", "+b+", "+a);
                        }
                      }
                   }
                }
            }
        }
    }

