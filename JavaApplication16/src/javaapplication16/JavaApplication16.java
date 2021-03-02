/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import java.util.Scanner;

/**
 *
 * @author eucog
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double mes, tmes, credito,limitec,t;
        
        System.out.print("Ingrese el saldo de inicio de mes");
        mes = entrada.nextDouble();
        System.out.print("Cual fue el total abonado durante el mes");
        tmes = entrada.nextDouble();
        System.out.print("Creditos agregados");
        credito = entrada.nextDouble();
        System.out.print("Limite de creditos");
        limitec = entrada.nextDouble();
        
        limitec += credito;
        
        mes += tmes;
        
        if(limitec < mes)
        {
           System.out.print("Limite excedido"); 
        }else
        {
            System.out.print("Aun no llega al limite");
        }
        
    }
    
}
