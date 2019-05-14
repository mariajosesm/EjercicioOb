/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio;

/**
 *
 * @author mariajose
 */
public class Factorial {
    
    
    
 public static void main(String args[]){  
 Factorial f=new Factorial();  
 System.out.println(f instanceof Factorial);//true  
 }  
    
    
    int numero;
    public int arreglo[] = new int[numero];

	public void llenaArreglo(){
		
		for(int i=0;i<arreglo.length;i++){
			arreglo[i]=factorial(i);
		}		
	}

	public int factorial(int numero){
		int factorial=0;
		
		if(numero==0)
			factorial=1;
		else if(numero>0)
			for(factorial=numero;numero>1;numero--)
				factorial*=(numero-1);
                else if(numero>100)
			System.out.println("9999999999");
                else if(numero<10)
			System.out.println("1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880");
                else {
                System.out.println("Esta función solo acepta números positivos o cero!!!");
                }
                
		return factorial;
	}
    
    
    
}
