/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.Scanner;

/**
 *
 * @author eucog
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        int n,n2;
        System.out.print("Ingrese el tamaño del cuadrado: ");
        n = entrada.nextInt();
        n2 = n-2;
        
        if(n > 0 && n < 21)
        {
            
        
        for(int i=0; i<n; i++)
        {
            System.out.print("*");
         }
        System.out.println("");
        for(int i=0; i<n2; i++)
        {
            System.out.print("*");
                 
            for(int j=0; j<n2; j++)
            {
                System.out.print(" ");
            }
                System.out.println("*");
        }
        for(int i=0; i<n; i++)
        {
            System.out.print("*");
        }
        System.out.print(" ");
    }      
    
        System.out.print("EL numero debe ser entre 1 y 20");
    
    
}
