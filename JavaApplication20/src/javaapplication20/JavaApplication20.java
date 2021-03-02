/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import java.util.Scanner;

/**
 *
 * @author eucog
 */
public class JavaApplication20 {

    public static void main(String[] args) {
        long numero, aux, num, decimal;
     int x;
     boolean Binario;
     Scanner sc = new Scanner(System.in);

     do {
          System.out.println("Introduce un numero binario");
          numero = sc.nextLong();
          Binario = true;
          aux = numero;
          while (aux != 0) {
                     num= aux % 10; 
                     if (num != 0 && num != 1) { 
                          Binario = false; 
                     }
                     aux = aux / 10;                          
           }
      } while (!Binario); 

      x = 0;
      decimal = 0; 
      while (numero != 0) {
                num = numero % 10;                      
                decimal = decimal + num * (int) Math.pow(2, x);
                x++;
                numero = numero / 10;
      }
      System.out.println("Decimal: " + decimal);
   }
}
    
    

