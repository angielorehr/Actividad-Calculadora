/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraConsola;


import CalculadoraConsola.Calculadora;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Consola {
  
    Calculadora calculadorcon;

public void Operaciones(){
    
  

  Scanner miEscanner=new Scanner(System.in);
  int numero;
  double numero1; 
  double numero2;
  
  System.out.println("Digite un numero segun la opcion");
  System.out.println("1. SUMAR");
  System.out.println("2. RESTAR");
  System.out.println("3. MULTIPLICAR");
  System.out.println("4. DIVIDIR");
  
  numero= miEscanner.nextInt();    
  
  System.out.println("Digite el primero numero");
  numero1= miEscanner.nextDouble();
  System.out.println("Digite el segundo numero");
  numero2= miEscanner.nextDouble();
        
   
  switch (numero){
  case 1: System.out.println(calculadorcon.sumar(numero1, numero2));
  case 2: System.out.println(calculadorcon.restar(numero1, numero2));
  case 3: System.out.println(calculadorcon.multiplicar(numero1, numero2));
  case 4: System.out.println(calculadorcon.dividir(numero1, numero2));
  
  }
  
}
              

        
}