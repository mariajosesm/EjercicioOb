/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mariajose
 */
public class FactorialTest {
    

    @Test
    public void testFactorial1() {
        int numero = 0;
        int arreglo [] = new int[numero];
        String result= "Esta funcion solo acepta numeros positivos o cero";
        if (numero ==-numero){
        assertEquals(numero, result);
        }

    }
    
    
    @Test
    public void testFactorial2() {
        int numero = 0;
        int arreglo [] = new int[numero];
        String result = "9999999999";
        if (numero ==100){
        assertEquals(numero, result);
        }

    }
    
    
    @Test
    public void testFactorial3() {
        int numero = 0;
        int arreglo [] = new int[numero];
        String result = "1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880";
        if (numero <10){
        assertEquals(numero, result);
        }

    }
    
    
    
    
    
}
