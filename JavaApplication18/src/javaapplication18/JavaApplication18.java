/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.util.Scanner;



/**
 *
 * @author eucog
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int n;
        double semana = 200;
        System.out.print("Ingresar el numero de salarios registrados: ");
        n = entrada.nextInt();
        n +=1;
        
        double[] salario= new double [n];
        double[] valor= new double[n];
        
        for(int i=01; i<n; i++)
        {
            System.out.println("Ingrese el salario del vendedor: "+i);
            salario[i] =  entrada.nextDouble();
        }
        
        System.out.println("Los salarios de la categoria A son:");
        for(int i=0; i<n; i++)
        {
            if(salario[i]<=3000)
            {
                valor[i] = semana;
            }
            else if(salario[i] < 5000)
            {
             
                valor[i] = (semana * 0.05)+200;
            }
            else if(salario[i] > 7000)
            {
                valor[i] = (semana * 0.010)+200;
            }
            else
            {
                valor[i] = (semana* 0.07)+200 ;
            }
            
            System.out.println(valor[i]);
        }
        
        System.out.println("Los salarios de la categoria B son:");
                
        for(int i=1; i<n; i++)
        {
            if(salario[i]<=5000)
            {
                salario[i] = semana;
            }
            else if(salario[i] > 5000)
            {
             
                salario[i] = (semana * 0.07)+200;
            }
            else if(salario[i] > 10000 && salario[i]<15000)
            {
                salario[i] = (semana * 0.010)+200;
            }
            else
            {
                salario[i] = (semana* 0.013)+200 ;
            }
            
            
            System.out.println(salario[i]);
            
        }
        
        
    }

    

