package com.Java.org;

import java.util.Scanner;

public class Multipliucacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultado, numero1, numero2; 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce Numero1: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Introduce Numero2: ");
		numero2 = entrada.nextInt();
		
		resultado = numero1 * numero2;
		
		System.out.println("El resultado de multiplicar " + numero1 + " * " + numero2 + " es: " + resultado);
	}

}
