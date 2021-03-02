/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.util.Scanner;

/**
 *
 * @author eucog
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int n ;
         System.out.print("Ingrese el numero de productos vendidos");
        n = entrada.nextInt();
        
        int[]  a = new int[n], b = new int[n] ,c = new int[n];
        int vmx = 0;
        int  ventam = 0,tv,sv = 0,v = 0;
        
        for(int i=1; i<=2; i++)
        {
            System.out.print("Ingrese el codigo del pronducto: "+i);
            a [i] = entrada.nextInt();
            
            System.out.print("Ingrese el valor de el producto: "+a[i]);
            b [i] = entrada.nextInt();
            
            System.out.print("Ingrese el numero de cantidades ventidad del producto: "+a[i]);
            c [i] = entrada.nextInt();
            
             vmx +=c[i];
            tv = c[i]*b[i];
            v +=tv;
            
            if(ventam>c[i])
            {
                ventam = c[i];
            }
            if (sv >b[i])
            {
        }

    }
        System.out.println("El total de productos vendios en un dia es de: "+vmx);
        System.out.println("Ingreso total en ventas de un dia: "+v);
        System.out.println("El producto mas vendido es el numero: "+ventam);
        System.out.println("Producto mas costoso vendido es: "+sv);

    
}
