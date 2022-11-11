/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicioexcepcion;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author camig
 */
public class EjercicioExcepcion {

  
     private int divisor;
    private int numero;
    
    public  EjercicioExcepcion(int divisor, int numero) throws Exception {
        if (numero < 10 || divisor < 10)
            throw new Exception("Tiene que dijitar un numero mayor a 10");
        this.numero = numero;
        this.divisor = divisor;
    }
 

    public static void main(String[] args) {
        
    System.out.println("(Prueba crear un exception) Ingrese un numero mayor a 10");
      int numero,divisor;
      double resultado;
      Scanner sc = new Scanner(System.in);
    try{
    
    System.out.println("Digite un numero");
    numero = sc.nextInt();
    System.out.println("Digite el divisor");
    divisor = sc.nextInt();
    EjercicioExcepcion persona1 = new EjercicioExcepcion(divisor, numero);
    resultado= numero/divisor;
    System.out.println("El resultado es= "  + resultado);
}
     catch(Exception ex){
     System.out.println("Digito algo que no es "+ex.getMessage());
     
    }
    aritmetico();
    }
    
    
    
    public static void aritmetico(){
        
    System.out.println(" Segundo ejercicio->  Digite un numero y su divisor");
        
      int numero,divisor;
      double resultado;
      Scanner sc = new Scanner(System.in);
        
        
     try{
    System.out.println("Digite un numero");
    numero = sc.nextInt();
    System.out.println("Digite el divisor");
    divisor = sc.nextInt();
    resultado= numero/divisor;
    System.out.println("El resultado es= "  + resultado);
}
catch(InputMismatchException ex){
System.out.println("No puedes dijitar letras  "+ex.getMessage());}
catch(ArithmeticException ex){
System.out.println("No puedes dividir por cero   "+ex.getMessage());}
    }
    
}



