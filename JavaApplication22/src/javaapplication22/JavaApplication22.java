/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import java.util.Scanner;

/**
 *
 * @author eucog
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        int[] numero = new int[10];
        int n = 0;
        
        
        for(int i=0; i<10; i++)
        {
            System.out.print("Ingrese un numero: ");
            numero[i]= entrada.nextInt();
            
            if(n<numero[i])
            {
                n = numero[i];
            }
        }
        System.out.print("El mayor elemento del venctor es: "+n);
    }
    
}
