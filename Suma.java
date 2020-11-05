package com.Java.org;

import java.util.Scanner;

import org.apache.poi.util.SystemOutLogger;

/**
 * Programa que suma dos valores ingresados por el usuario
 * 
 */

public class Suma {

	public static void main(String[] args) {

		double suma, numero1, numero2;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Ingresa Numero1:");
		numero1 = entrada.nextDouble();

		System.out.print("Ingresa Numero2:");
		numero2 = entrada.nextDouble();

		suma = numero1 + numero2;

		System.out.printf("Resultado: %f\n ", suma);

	}// fin del metodo main

}// fin de la clase Suma
