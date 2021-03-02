/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author eucog
 */
public class JavaApplication19 {

    
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        int n;
        
        System.out.print("Ingrese el numero de empleados");
        n = entrada.nextInt();
        n +=1;
        
        char[] e = new char[n];
        int[] h = new int[n];
        double[]t = new double[n];
        
        for(int i=1; i<n; i++)
        {
            System.out.println("Ingrese el nombre del empleado "+i);
             e[i] = entrada.next();
            
            
            System.out.print(e[i]);
            
        }
        
    }
    
}
