package com.Java.org;

import java.util.Scanner;

/**
 *
 * Compara enteros utilizando instrucciones if, operadores
 * relacionales y de igualdad.
 *  
 */

public class Comparacion {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.print("Escriba el primer numero:");
		numero1 = entrada.nextInt();
		
		System.out.print("Escriba el segundo numero:");
		numero2 = entrada.nextInt();
		
		if(numero1 == numero2)
			System.out.printf("%d == %d\n", numero1, numero2);
		
		if(numero1 != numero2)
			System.out.printf("%d != %d\n", numero1, numero2);
		
		if(numero1 < numero2)
			System.out.printf("%d < %d\n", numero1, numero2);
		
		if(numero1 > numero2)
			System.out.printf("%d < %d\n", numero1, numero2);
		
		if(numero1 <= numero2)
			System.out.printf("%d <= %d\n", numero1, numero2);
		
		if(numero1 >= numero2)
			System.out.printf("%d >= %d\n", numero1, numero2);
	
	}//fin del metodo main

}//fin de la clase Comparacion
