package com.Java.org;

import java.util.Scanner;

public class Resta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultado, numero1, numero2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingresa Numero1: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Ingresa Numero2: ");
		numero2 = entrada.nextInt();
		
		resultado = numero1 - numero2;
		
		System.out.println("El resultado de restar: " + numero1 + " - " + numero2 + " es: " + resultado);
	

	}// fin del main

}// fin de la clase Resta

