/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraConsola;

import CalculadoraConsola.Calculadora;
import CalculadoraConsola.Consola;



/**
 *
 * @author Estudiantes
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Calculadora miCalculadorPrincipal= new Calculadora();
        
        Consola miConsola= new Consola();
        miConsola.calculadorcon= miCalculadorPrincipal;
        miConsola.Operaciones();
        
               
        
    }
        
        
    }

