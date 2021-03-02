/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.util.Scanner;

/**
 *
 * @author eucog
 */
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char op = 's';
        double p1=0,p2=0,p3=0,p4=0,p5=0;
        int n;
        double v,v1=0,v2=0,v3=0,v4=0,v5=0;
        Scanner entrada = new  Scanner(System.in);
        do
        {
           
            System.out.print("Ingrese el numero de producto que desa registrar: ");
            n = entrada.nextInt();
            switch(n)
            {
                case 1:
                    System.out.print("Numero de productos vendidos: ");
                    p1 = entrada.nextInt();
                    p1 =  (p1*2.98);
                    v1 +=  p1;
                    break;
                    
                case 2:
                    System.out.print("Numero de productos vendidos: ");
                    p2 = entrada.nextInt();
                    p2 = (p2*4.50);
                    v2 += p2;
                    break;
                    
                case 3:
                    System.out.print("Numero de productos vendidos: ");
                    p3 = entrada.nextInt();
                    p3 = (p3*9.98);
                    v3 += p3;
                    
                    break;
                    
                case 4:
                    System.out.print("Numero de productos vendidos: ");
                    p4 = entrada.nextInt();
                    p4 = (p4*4.49);
                    v4 += p4;
                    break;
                    
                case 5:
                    System.out.print("Numero de productos vendidos: ");
                    p5 = entrada.nextInt();
                    p5 = (p5*6.87);
                    v5 += p5;
                    break;
                    
                default :
                    System.out.print("Opcion no valida");
                    
            }
            System.out.println("Desea continuar N/S");
            op = entrada.next().charAt(0);
            
        }while(op =='s');
        
        System.out.println("valor por productos");
        System.out.println("producto numero uno: "+v1);
        System.out.println("producto numero dos: "+v2);
        System.out.println("producto numero tres: "+v3);
        System.out.println("producto numero cuatro: "+v4);
        System.out.println("producto numero cinco: "+v5);
    }
    }

